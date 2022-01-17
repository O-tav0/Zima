package br.com.zima.Zima.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="endereco")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Endereco implements Serializable{
	
	@Id
	@Column(name="codigo")
	private Integer codUsuario;
	
	@Column(name="cep")
	private String cep;
	
	@Column(name="cidade")
	private String cidade;
	
	@Column(name="uf")
	private String uf;
	
	@Column(name="bairro")
	private String bairro;
	
	@Column(name="rua")
	private String rua;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="complemento")
	private String complemento;
	
	@Column(name="pRef")
	private String pontoReferencia;
}
