package com.example.Diary.controller;

import com.example.Diary.Service.NoteService;
import com.example.Diary.models.Note;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class DiaryController {
    private final NoteService noteService;

    @GetMapping("/")
    public  String notes(@RequestParam(name = "title", required = false) String title, Model model){
        model.addAttribute("notes", noteService.listNotes(title));
        return "notes";
    }

    @GetMapping("/note/{id}")
    public String noteInfo(@PathVariable Long id, Model model){
            model.addAttribute("note", noteService.getNoteById(id));

        return "note-info";
    }

    @PostMapping("/note/create")
    public String createNote(Note note){
        noteService.saveNote(note);
        return "redirect:/";
    }
    @PostMapping("/note/delete/{id}")
    public String deleteNote(@PathVariable Long id) {
        noteService.deleteNote(id);
        return "redirect:/";
    }
}
