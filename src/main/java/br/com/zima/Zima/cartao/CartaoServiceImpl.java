package br.com.zima.Zima.cartao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.zima.Zima.domain.Cartao;

@Component
public class CartaoServiceImpl implements CartaoService {
	
	@Autowired
	CartaoRepository cartaoRepository;
	
	public Optional<Cartao> listarTodosCartoes(Integer id) {
		return cartaoRepository.findById(id);
	}

}
