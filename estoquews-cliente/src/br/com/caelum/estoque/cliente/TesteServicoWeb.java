package br.com.caelum.estoque.cliente;

import java.util.Arrays;

public class TesteServicoWeb {

	public static void main(String[] args) {
		
		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSPort();
		Filtro filtro = new Filtro();
		filtro.setNome("Xaomi");
		filtro.setTipo(TipoItem.CELULAR);
		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);
		
		ListaItens lista = cliente.todosOsItens(filtros);
		
		System.out.println(lista);
	}

}
