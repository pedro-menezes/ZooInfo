package com.projeto.zooinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.zooinfo.models.Especie;
import com.projeto.zooinfo.repository.EspecieRepository;

@Controller
public class EspecieControl {

	@Autowired
	private EspecieRepository er;
	
	@RequestMapping(value="/CadastrarEspecie", method=RequestMethod.GET)
	public String form() {
		return "especie/formEspecie";
	}
	
	@RequestMapping(value="/CadastrarEspecie", method=RequestMethod.POST)
	public String form(Especie especie) {
		er.save(especie);
		return "redirect:/CadastrarEspecie";
	}
}
