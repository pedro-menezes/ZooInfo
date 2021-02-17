package com.projeto.zooinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.zooinfo.models.Venda;
import com.projeto.zooinfo.repository.VendaRepository;

@Controller
public class VendaControl {

	@Autowired
	private VendaRepository vr;
	
	@RequestMapping(value="/CadastrarVenda", method=RequestMethod.GET)
	public String form() {
		return "venda/formVenda";
	}
	
	@RequestMapping(value="/CadastrarVenda", method=RequestMethod.POST)
	public String form(Venda venda) {
		vr.save(venda);
		return "redirect:/CadastrarVenda";
	}
}
