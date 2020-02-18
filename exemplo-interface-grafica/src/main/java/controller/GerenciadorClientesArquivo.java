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
    
    private List<Cliente> clientes = new ArrayList<Cliente>();
    
    public void lerArquivo() throws FileNotFoundException, IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("clientes.txt");
        ObjectInputStream objInputStream = new ObjectInputStream(fileInputStream);
        this.clientes = (List<Cliente>)objInputStream.readObject();
    }
    
    public void escreverArquivo() throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("clientes.txt");
        ObjectOutputStream objOutputStream = new ObjectOutputStream(fileOutputStream);
        objOutputStream.writeObject(this.clientes);
    }
    
    public List<Cliente> listarClientes() {
        try {
            this.lerArquivo();
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
            this.lerArquivo();
            clienteSelecionado = clientes.stream().filter( (cliente) -> cliente.getId().equals(id) ).findFirst();
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
            this.escreverArquivo();
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
            this.escreverArquivo();
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removerCliente(Cliente cliente) {
        clientes.remove(cliente);
        try {
            this.escreverArquivo();
        } catch (IOException ex) {
            Logger.getLogger(GerenciadorClientesArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
