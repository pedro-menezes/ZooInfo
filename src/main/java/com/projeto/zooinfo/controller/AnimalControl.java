package com.projeto.zooinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.zooinfo.models.Animal;
import com.projeto.zooinfo.repository.AnimalRepository;

@Controller
public class AnimalControl {
    
	@Autowired
	private AnimalRepository ar;
	
	@RequestMapping(value="/CadastrarAnimal", method=RequestMethod.GET)
	public String form() {
		return "animal/formAnimal";
	}
	
	@RequestMapping(value="/CadastrarAnimal", method=RequestMethod.POST)
	public String form(Animal animal) {
		ar.save(animal);
		return "redirect:/CadastrarAnimal";
	}
}
