package com.projeto.zooinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.zooinfo.models.Familia;
import com.projeto.zooinfo.repository.FamiliaRepository;

@Controller
public class FamiliaControl {

	@Autowired
	private FamiliaRepository fr;
	
	@RequestMapping(value="/CadastrarFamilia", method=RequestMethod.GET)
	public String form() {
		return "familia/formFamilia";
	}
	
	@RequestMapping(value="/CadastrarFamilia", method=RequestMethod.POST)
	public String form(Familia familia) {
		fr.save(familia);
		return "redirect:/CadastrarFamilia";
	}
}
