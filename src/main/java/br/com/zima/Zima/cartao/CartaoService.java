package br.com.zima.Zima.cartao;

import java.util.List;
import java.util.Optional;

import javax.annotation.ManagedBean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.stereotype.Component;

import br.com.zima.Zima.domain.Cartao;



@Component
public interface CartaoService {
	public Optional<Cartao> listarTodosCartoes(Integer id);
}
