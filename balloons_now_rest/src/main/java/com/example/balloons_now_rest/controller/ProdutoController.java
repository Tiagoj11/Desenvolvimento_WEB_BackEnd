package com.example.balloons_now_rest.controller;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.balloons_now_rest.model.Produto;
import com.example.balloons_now_rest.repository.ProdutoRepository;

@RestController
@RequestMapping({ "/produtos" })
public class ProdutoController {
	private ProdutoRepository repository;
	
	ProdutoController(ProdutoRepository produtoRepository) {
		this.repository = produtoRepository;
	}
	@GetMapping
	public List<?> findAll() {
		return repository.findAll();
	}
	@GetMapping(path = { "/{id}" })
	public ResponseEntity<?> findById(@PathVariable long id) {
		return repository.findById(id).map(record ->
		ResponseEntity.ok().body(record))
		.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public Produto create(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	@DeleteMapping(path = { "/{id}" })
	public ResponseEntity<?> delete(@PathVariable long id) {
		return repository.findById(id).map(record -> {
			repository.deleteById(id);
			return ResponseEntity.ok().build();
		}).orElse(ResponseEntity.notFound().build());
	}

}
