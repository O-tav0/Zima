package br.com.zima.Zima.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="produto")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="descricao")
	private String descricao;
	
	@Column(name="preco")
	private Double preco;
	
	@Column(name="img")
	private String caminhoimg;
}
