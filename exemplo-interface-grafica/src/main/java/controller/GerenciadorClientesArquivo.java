/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Cliente;

/**
 *
 * @author diegopessoa
 */
public class GerenciadorClientesArquivo {
    
	/** 
	 * Carrega lista de clientes do arquivo
	 */
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    
    /** Lê arquivo que armazena os clientes **/
    public void lerArquivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("clientes.txt"); // Carrega canal de leitura do arquivo clientes.txt
        ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream); // Lê arquivo como objeto
        this.clientes = (List<Cliente>)objInputStream.readObject(); // Carrega o objeto lido no arquivo na lista de clientes
    }
    
    public void escreverArquivo() throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("clientes.txt"); // Carrega canal de saída do arquivo clientes.txt
        ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream); // Carrega canal para escrita de objetos
        objOutputStream.writeObject(this.clientes); // Escreve lista de clientes atualizada no arquivo
    }
    
    public List<Cliente> listarClientes() {
        try {
            this.lerArquivo(); // Chama a função lerArquivo() para atualizar a lista de clientes
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clientes;
    }

    public Optional<Cliente> recuperarCliente(String id) {
        Optional<Cliente> clienteSelecionado = Optional.empty();
        try {
            this.lerArquivo(); // Chama a função lerArquivo() para atualizar a lista de clientes
            clienteSelecionado = clientes.stream().filter( (cliente) -> cliente.getId().equals(id) ).findFirst(); // Recupera cliente pelo código
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clienteSelecionado;
    }

    public void criarCliente(Cliente cliente) {
        clientes.add(cliente);
        try {
            this.escreverArquivo(); // Escreve lista atualizada no arquivo
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizarCliente(Cliente cliente) {
        if (this.recuperarCliente(cliente.getId()).isPresent()) {
            clientes.remove(cliente);
        } 
        clientes.add(cliente);
        try {
            this.escreverArquivo(); // Escreve lista atualizada no arquivo
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
        try {
            this.escreverArquivo(); // Escreve lista atualizada no arquivo
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
