package com.Attornatus.BackendAttornatus.service;

import com.Attornatus.BackendAttornatus.entity.Cliente;
import com.Attornatus.BackendAttornatus.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente ){
        return clienteRepository.save(cliente);
    }
    public List<Cliente> listaCliente(){
        return clienteRepository.findAll();
    }
    public Optional<Cliente> buscarPorId(long id){
        return clienteRepository.findById(id);
    }

    public void deletarPorId(long id){
        clienteRepository.deleteById(id);
    }

}
