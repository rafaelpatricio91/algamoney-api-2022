package com.rafa.algamoney.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rafa.algamoney.api.exception.PessoaInativaException;
import com.rafa.algamoney.api.model.Lancamento;
import com.rafa.algamoney.api.repository.LancamentoRepository;

@Service
public class LancamentoService {
	
	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private LancamentoRepository lancamentoRepository;
	
	public Lancamento criar(Lancamento lancamento) {
		if (pessoaService.isPessoaInativa(lancamento.getPessoa().getCodigo())) {
			throw new PessoaInativaException();
		}
		return lancamentoRepository.save(lancamento);
	}

}
