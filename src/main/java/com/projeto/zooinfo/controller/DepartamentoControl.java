package com.projeto.zooinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.zooinfo.models.Departamento;
import com.projeto.zooinfo.repository.DepartamentoRepository;

@Controller
public class DepartamentoControl {

	@Autowired
	private DepartamentoRepository dr;
	
	@RequestMapping(value="/CadastrarDepartamento", method=RequestMethod.GET)
	public String form() {
		return "departamento/FormDepartamento";
	}
	
	@RequestMapping(value="/CadastrarDepartamento", method=RequestMethod.POST)
	public String form(Departamento departamento) {
		dr.save(departamento);
		return "redirect:/CadastrarDepartamento";
	}
}
