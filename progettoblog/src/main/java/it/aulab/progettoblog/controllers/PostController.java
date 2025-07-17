package it.aulab.progettoblog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import it.aulab.progettoblog.models.Post;
import it.aulab.progettoblog.repositories.PostRepository;

@Controller
@RequestMapping("/posts")
public class PostController {
    @Autowired
    PostRepository postRepository;
    
    // @RequestMapping(value="/posts", method=RequestMethod.GET)
    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody List<Post> getAllPost(){
        return postRepository.findAll();
    }
}
