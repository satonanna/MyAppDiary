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
}