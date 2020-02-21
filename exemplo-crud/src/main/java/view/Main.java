package view;

import java.time.LocalDate;

import controller.GerenciadorClientes;
import model.Cliente;

/***
 * Classe principal para execução da interface gráfica
 * 
 * @author diegopessoa
 *
 */
public class Main {
	
	public static void main(String[] args) {
		
		GerenciadorClientes gerenciador = new GerenciadorClientes();
		
		
		Cliente cliente = new Cliente();
		cliente.setId(1l);
		cliente.setNome("Fulano da Silva");
		cliente.setCpf("123.123.123-23");
		cliente.setEmail("fulano@gmail.com");
		cliente.setDataNascimento(LocalDate.of(1988, 06, 30));
		cliente.setEndereco("Rua deserta, 0");
		gerenciador.criarCliente(cliente);
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2l);
		cliente2.setNome("Cicrano da Silva");
		cliente2.setCpf("123.123.132-23");
		cliente2.setEmail("cicrano@gmail.com");
		cliente2.setDataNascimento(LocalDate.of(1978, 06, 30));
		cliente2.setEndereco("Rua movimentada, 0");
		gerenciador.criarCliente(cliente2);
		
		
		System.out.println("Clientes cadastrados: ");
		for(Cliente c : gerenciador.listarClientes()) {
			System.out.println("Nome = "+ c.getNome());
			System.out.println("E-mail = "+ c.getEmail());
			System.out.println("CPF = "+ c.getCpf());
			System.out.println("Endereço= "+ c.getEndereco());
			System.out.println("----------------------");
		}
		
		gerenciador.removerCliente(cliente);
		
		System.out.println("Clientes cadastrados: ");
		for(Cliente c : gerenciador.listarClientes()) {
			System.out.println("Nome = "+ c.getNome());
			System.out.println("E-mail = "+ c.getEmail());
			System.out.println("CPF = "+ c.getCpf());
			System.out.println("Endereço= "+ c.getEndereco());
			System.out.println("----------------------");
		}
		
		
	}

}
