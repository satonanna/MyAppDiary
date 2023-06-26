package com.example.Diary.repositories;

import com.example.Diary.models.Note;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {
    default List<Note> findByDay(String day) {
        return null;
    }
}
