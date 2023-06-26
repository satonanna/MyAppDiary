package com.example.Diary.Service;

import com.example.Diary.models.Note;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class NoteService {
    private List<Note> notes = new ArrayList<>();
    private long ID=0;

    {
        notes.add(new Note(++ID,"Суббота 24.06.2023", "Отличное настроение", "Радость, воодушевление", "злость", "колено болело"));
        notes.add(new Note(++ID,"Пятница 23.06.2023", "Тухлое настроение", "Никаких", "Печаль, апатия", "колено болело"));
        notes.add(new Note(++ID,"Четверг 22.06.2023", "Напряженное настроение", "никаких", "Тревога, страх", "живот болел"));
    }
    public List<Note>  listNote() {return notes;}

    public void saveNote(Note note){
        note.setId(++ID);
        notes.add(note);
    }

    public void deleteNote(Long id){
        notes.removeIf(note -> note.getId().equals(id));
    }

    public Note getNoteById(Long id) {
        for (Note note : notes){
            if (note.getId().equals(id)) return note;
        }
        return null;
    }
}
