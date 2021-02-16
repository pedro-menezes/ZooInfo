package com.projeto.zooinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.zooinfo.models.Funcionario;
import com.projeto.zooinfo.repository.FuncionarioRepository;

@Controller
public class FuncionarioControl {

	@Autowired
	private FuncionarioRepository fr;
	
	@RequestMapping(value="/CadastrarFuncionario", method=RequestMethod.GET)
	public String form() {
		return "funcionario/formFuncionario";
	}
	
	@RequestMapping(value="/CadastrarFuncionario", method=RequestMethod.POST)
	public String form(Funcionario funcionario) {
		fr.save(funcionario);
		return "redirect:/CadastrarFuncionario";
	}
}
