package br.com.zima.Zima.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="cartao")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Cartao {
	
	@Id
	@Column(name="cod_usuario")
	private Integer codigoUsuario;
	
	@Column(name="numero")
	private String numeroCartao;
	
	@Column(name="titular")
	private String titularCartao;
	
	@Column(name="data_validade")
	private Date validade;
	
	@Column(name="cvv")
	private String cvv;
}
