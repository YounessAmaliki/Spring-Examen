package edu.ap.spring.controller;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import edu.ap.spring.jpa.Joke;
import edu.ap.spring.jpa.JokeRepository;


@Autowired
JokeRepository repository;

@Controller
@Scope("session")
public class JokeController {
   
   public JokeController() {
   }
       
   @RequestMapping("/joke")
   public String joke() {
	   return "";
	   
	   @ResponseBody
	   public String joke(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName) {	   
		
		   }

		   
		
   }
		   
   @RequestMapping("/joke_post")
   public String joke_post() {
	   return "";
   }
   
   @RequestMapping("/")
   public String root() {
	   return "redirect:/joke";
   }
}
