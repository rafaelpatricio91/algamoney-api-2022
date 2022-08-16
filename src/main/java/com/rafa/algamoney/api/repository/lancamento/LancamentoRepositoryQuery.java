package com.rafa.algamoney.api.repository.lancamento;

import java.util.List;

import com.rafa.algamoney.api.model.Lancamento;
import com.rafa.algamoney.api.repository.filter.LancamentoFilter;

public interface LancamentoRepositoryQuery {
	
	public List<Lancamento> filtrar(LancamentoFilter lancamentoFilter);

	
}
