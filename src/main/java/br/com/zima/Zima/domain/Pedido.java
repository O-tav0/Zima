package br.com.zima.Zima.domain;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="pedido")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Pedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigoPedido")
	private Integer codigoPedido;
	
	@JoinColumn(name="cod_usuario")
	@OneToOne
	private Usuario usuario;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="data")
	private Date dataPedido;
	
	@Column(name="cep_entrega")
	private String cepEntrega;
	
	@Column(name="bairro_entrega")
	private String bairroEntrega;
	
	@Column(name="rua_entrega")
	private String ruaEntrega;
	
	@Column(name="numero_entrega")
	private String numeroEntrega;
	
	@Column(name="pRef_entrega")
	private String pRefEntrega;
	
	//TODO Trocar este atributo para um Enum
	@Column(name="status")
	private String status;
	
	@Column(name="local")
	private String local;
	
	@OneToMany(mappedBy="pedido")
	private List<ItemPedido> itensDoPedido;
	
}
