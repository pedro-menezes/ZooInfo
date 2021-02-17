package com.projeto.zooinfo.repository;

import org.springframework.data.repository.CrudRepository;

import com.projeto.zooinfo.models.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, String> {

}
