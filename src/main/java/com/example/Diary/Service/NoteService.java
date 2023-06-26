package com.example.Diary.Service;

import com.example.Diary.models.Image;
import com.example.Diary.models.Note;
import com.example.Diary.repositories.NoteRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
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

    public void saveNote(Note note, MultipartFile file1,MultipartFile file2,MultipartFile file3) throws IOException {
        Image image1;
        Image image2;
        Image image3;
        if (file1.getSize() !=0){
            image1 = toImageEntity(file1);
            image1.setPreviewImage(true);
            note.addImageToNote(image1);
        }
        if (file2.getSize() !=0){
            image2 = toImageEntity(file2);
            note.addImageToNote(image2);
        }
        if (file3.getSize() !=0){
            image3 = toImageEntity(file3);
            note.addImageToNote(image3);
        }
        log.info("Saving new Note. Day: {}; ", note.getDay());
        Note noteFromDb = noteRepository.save(note);
        noteFromDb.setPreviewImageId(noteFromDb.getImages().get(0).getId());
        noteRepository.save(note);
    }

    private Image toImageEntity(MultipartFile file) throws IOException {
        Image image = new Image();
        image.setName(file.getName());
        image.setOriginalFileName(file.getOriginalFilename());
        image.setContentType(file.getContentType());
        image.setSize(file.getSize());
        image.setBytes(file.getBytes());
        return image;
    }

    public void deleteNote(Long id){
        noteRepository.deleteById(id);
    }

    public Note getNoteById(Long id) {
        return noteRepository.findById(id).orElse(null);
    }
}