package com.example.Diary.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "notes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "day")
    private String day;
    @Column(name = "mood")
    private String mood;
    @Column(name = "positiveEmotion")
    private String positiveEmotion;
    @Column(name = "negativeEmotion")
    private String negativeEmotion;
    @Column(name = "bodyPart")
    private String bodyPart;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,
    mappedBy = "note")
    private List<Image> images = new ArrayList<>();
    private Long previewImageId;
    private LocalDateTime dateOfCreated;

    @PrePersist
    private void init(){
        dateOfCreated = LocalDateTime.now();
    }

    public void addImageToNote(Image image){
        image.setNote(this);
        images.add(image);
    }
}