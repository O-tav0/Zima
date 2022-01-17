package br.com.zima.Zima.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="codigo")
	private Integer codUsuario;
	
	@Column(name="tipo")
	private Integer tipoUsuario;
	
	@Column(name="nome")
	private String nomeUsuario;
	
	@Column(name="cpf")
	private String cpfUsuario;
	
	@Column(name="senha")
	private String senha;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefone")
	private String telefone;

}
