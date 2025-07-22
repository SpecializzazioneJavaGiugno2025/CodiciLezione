package it.aulab.progettoblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.aulab.progettoblog.models.Comment;
import it.aulab.progettoblog.repositories.CommentRepository;

@Controller
@RequestMapping("/api/comments")
public class CommentRestController {
    @Autowired
    CommentRepository commentRepository;
    // @RequestMapping(value="/comments", method=RequestMethod.GET)
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Comment> getAllPost(){
        return commentRepository.findAll();
    }

}
