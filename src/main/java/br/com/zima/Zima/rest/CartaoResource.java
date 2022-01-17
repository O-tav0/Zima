package br.com.zima.Zima.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import br.com.zima.Zima.cartao.CartaoService;
import br.com.zima.Zima.cartao.CartaoServiceImpl;
import br.com.zima.Zima.domain.Cartao;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/cartoes")
@CrossOrigin(origins = "*")
public class CartaoResource {
	
	@Autowired
	CartaoService cartaoService;
	
	@ApiOperation(value = "Greets the world or Niteroi")
	@GetMapping(value = "/todos")
	public Optional<Cartao> getCartoes(@RequestParam Integer id) {
		return cartaoService.listarTodosCartoes(id);
	}
}
