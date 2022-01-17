package br.com.zima.Zima.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="pagamento")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pagamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private Integer codigo;
	
	@JoinColumn(name="codigo")
	@OneToOne
	private Pedido pedido;
	
	@Column(name="forma")
	private String forma;
	
	//TODO Trocar este atributo para um ENUM
	@Column(name="status")
	private String status;
	
	@Column(name="data")
	private Date data;
}
