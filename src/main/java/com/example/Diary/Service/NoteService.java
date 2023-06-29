package com.example.Diary.Service;

import com.example.Diary.models.Note;
import com.example.Diary.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> listNotes(String day) {
        if (day != null) return noteRepository.findByDay(day);
        return noteRepository.findAll();
    }

    public void saveNote(Note note) {
        log.info("Saving new {}", note);
        noteRepository.save(note);
    }


    public void deleteNote(Long id) {
        noteRepository.deleteById(id);
        log.info("Deleted note with ID: {}", id);
    }

    public Note getNoteById(Long id) {
        Note note = noteRepository.findById(id).orElse(null);
        if (note != null) {
            log.info("Retrieved note by ID: {}", id);
        } else {
            log.info("Note not found for ID: {}", id);
        }
        return note;
    }
}
