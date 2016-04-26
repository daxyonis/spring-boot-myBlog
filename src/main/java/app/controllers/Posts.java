package app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import app.models.Post;

import app.services.PostService;

@Controller
public class Posts {
    
    private static PostService postService;
    
    @Autowired
    public void setPostService(PostService ps){
	Posts.postService = ps;
    }

    @RequestMapping("/post")
    public String posts(Model model){
	List<Post> posts = postService.findLatest(3);
	model.addAttribute("posts", posts);
	return "posts";
    }
}
