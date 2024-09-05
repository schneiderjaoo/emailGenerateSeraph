package com.magazine.seraph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.magazine.seraph.model.Cliente;
import com.magazine.seraph.repository.ClienteRepository;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    // Salvar ou atualizar um cliente
    public Cliente salvarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    // Encontrar um cliente por ID
    public Cliente encontrarClientePorId(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    // Atualizar um cliente existente
    public Cliente atualizarCliente(Long id, Cliente clienteAtualizado) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            cliente.setNome(clienteAtualizado.getNome());
            cliente.setEmail(clienteAtualizado.getEmail());
            return clienteRepository.save(cliente);
        } else {
            throw new RuntimeException("Cliente não encontrado com id " + id);
        }
    }

    // Deletar um cliente por ID
    public void deletarClientePorId(Long id) {
        try{  
            clienteRepository.existsById(id);
            clienteRepository.deleteById(id);
        } catch(Exception e) {
            throw new RuntimeException("Cliente não encontrado com id " + id);
        }
    }

    // Deletar todos os clientes
    public void deletarTodosClientes() {
        clienteRepository.deleteAll();
    }
}