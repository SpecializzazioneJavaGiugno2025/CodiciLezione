package it.aulab.progettoblog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.aulab.progettoblog.models.Author;
import it.aulab.progettoblog.services.AuthorService;

@Controller
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    public AuthorService authorService;

    @GetMapping
    public String authorsIndex(Model viewModel){
        viewModel.addAttribute("title", "Spring template authors");
        viewModel.addAttribute("authors", authorService.readAll());
        return "authors";
    }

    @GetMapping("/create")
    public String createAuhtor(Model viewModel){
        viewModel.addAttribute("title", "Crea un autore");
        viewModel.addAttribute("author",  new Author());
        return "createAuthor";
    }

    @PostMapping
    public String createAuthor(@ModelAttribute("author") Author author){
        authorService.create(author);
        return "redirect:/authors";
    }

}