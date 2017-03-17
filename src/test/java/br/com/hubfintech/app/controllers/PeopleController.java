package br.com.hubfintech.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.hubfintech.app.entities.People;
import br.com.hubfintech.app.repositories.PeopleRepository;

@Controller

public class PeopleController {
	@Autowired
	private PeopleRepository peopleRepository;
	
	@RequestMapping("/")
	public String list(Model model){
		model.addAttribute("people", peopleRepository.findAll());
		return "people";
	}
	
	@RequestMapping("/save")
	public String save(People people){
		peopleRepository.save(people);
		return "redirect:/";
	}

}
