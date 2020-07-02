package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Cliente;

/***
 * 
 * Realiza as principais operações de gerenciamento de clientes
 * 
 * @author diegopessoa
 *
 */
public class GerenciadorClientes {
	
	/** 
	 * Armazena os clientes tendo como índice de acesso o seu código
	 */
	private Map<String, Cliente> clientes = new HashMap<String, Cliente>();
	
	
	/** 
	 * Lista todos os clientes cadastrados
	 * 
	 * @return lista de clientes
	 */
	public List<Cliente> listarClientes() {
		return new ArrayList<Cliente>(clientes.values());
	}
	
	/** 
	 * Recupera um cliente pelo código
	 * 
	 * @param id - código do cliente
	 * @return cliente
	 */
	public Cliente recuperarCliente(String id) {
		return clientes.get(id);
	}

	/**
	 * Cria um novo cliente
	 * @param cliente
	 */
	public void criarCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}
	
	/**
	 * Atualiza dados de um cliente existente
	 * @param cliente
	 */
	public void atualizarCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}
	
	/**
	 * Remove um cliente
	 * @param cliente
	 */
	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente.getId());
	}

}
