package br.com.criandoapi.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.criandoapi.projeto.model.Usuario;

public interface InterfaceUsuario extends JpaRepository<Usuario, String>{

}
