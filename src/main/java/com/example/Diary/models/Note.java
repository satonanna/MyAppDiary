package com.example.Diary.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    @Column(name ="day")
    private String day;
    @Column(name = "mood", columnDefinition = "text")
    private String mood;
    @Column(name = "positiveEmotion", columnDefinition = "text")
    private String positiveEmotion;
    @Column(name = "negativeEmotion", columnDefinition = "text")
    private String negativeEmotion;
    @Column(name = "bodyPart", columnDefinition = "text")
    private String bodyPart;
}