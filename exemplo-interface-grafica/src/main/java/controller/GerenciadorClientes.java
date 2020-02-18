package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Cliente;

public class GerenciadorClientes {
	
	private Map<String, Cliente> clientes = new HashMap<String, Cliente>();
	
	public List<Cliente> listarClientes() {
		return new ArrayList<Cliente>(clientes.values());
	}
	
	public Cliente recuperarCliente(String id) {
		return clientes.get(id);
	}

	public void criarCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}
	
	public void atualizarCliente(Cliente cliente) {
		clientes.put(cliente.getId(), cliente);
	}
	
	public void removerCliente(Cliente cliente) {
		clientes.remove(cliente.getId());
	}

}
