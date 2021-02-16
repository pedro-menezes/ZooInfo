package com.projeto.zooinfo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.zooinfo.models.Usuario;
import com.projeto.zooinfo.repository.UsuarioRepository;

@Controller
public class UsuarioControl {

	@Autowired
	private UsuarioRepository ur;
	
	@RequestMapping(value="/CadastrarUsuario", method=RequestMethod.GET)
	public String form() {
		return "usuario/FormUsuario";
	}
	
	@RequestMapping(value="/CadastrarUsuario", method=RequestMethod.POST)
	public String form(Usuario usuario) {
		ur.save(usuario);
		return "redirect:/CadastrarAnimal";
	}
}
