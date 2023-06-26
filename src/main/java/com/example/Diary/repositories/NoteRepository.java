package com.example.Diary.repositories;

import com.example.Diary.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
    default String findByTitle(String title) {
        return title;
    }
}
