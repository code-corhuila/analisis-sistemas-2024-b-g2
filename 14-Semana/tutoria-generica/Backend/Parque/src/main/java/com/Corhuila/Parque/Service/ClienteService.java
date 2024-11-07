package com.Corhuila.Parque.Service;

import com.Corhuila.Parque.Entity.Cliente;
import com.Corhuila.Parque.IRepository.IClienteRepository;
import com.Corhuila.Parque.IService.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService implements IClienteService {
    @Autowired
    private IClienteRepository repository;

    @Override
    public Cliente save(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public void update(Cliente cliente, Integer id) {
        //Validar si existe.
        Optional<Cliente> up =  repository.findById(id);

        if(!up.isEmpty()){
            up.get().setDocumento(cliente.getDocumento());
            up.get().setNombre(cliente.getNombre());
            up.get().setCorreo(cliente.getCorreo());
            repository.save(cliente);
        }else {
            System.out.println("No existe registro");
        }
    }

    @Override
    public List<Cliente> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
