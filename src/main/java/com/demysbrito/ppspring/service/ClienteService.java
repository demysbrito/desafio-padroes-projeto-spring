package com.demysbrito.ppspring.service;
import com.demysbrito.ppspring.model.Cliente;

/**
 * Interface que define o padrão <b>Strategy</b> no domínio de cliente.
 * Com isso, se necessário, podemos ter múltiplas implementações
 * dessa mesma interface.
 * 
 * @author demys
 *
 */

public interface ClienteService {
	Iterable<Cliente> buscarTodos();
	Cliente buscarPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);
}





