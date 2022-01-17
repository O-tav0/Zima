package br.com.zima.Zima.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="itens_pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="codigoPedido")
	private Pedido pedido;
	
	@OneToOne
	@JoinColumn(name="codigo")
	private Produto produto;
	
	@Column(name="qtdItem")
	private Integer qtdItem;
	
	//TODO Troca esse atributo para um Enum
	@Column(name="tipoBebida")
	private String tipoBebida;
	
	@Column(name="qtdBebida")
	private Integer qtdBebida;
}
