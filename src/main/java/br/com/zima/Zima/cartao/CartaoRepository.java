package br.com.zima.Zima.cartao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import br.com.zima.Zima.domain.Cartao;

public interface CartaoRepository extends CrudRepository<Cartao, Integer>{

}
