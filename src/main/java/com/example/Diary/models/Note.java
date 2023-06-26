package com.example.Diary.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Note {
    private Long id;
    private String day;
    private String mood;
    private String positiveEmotion;
    private String negativeEmotion;
    private String bodyPart;
}