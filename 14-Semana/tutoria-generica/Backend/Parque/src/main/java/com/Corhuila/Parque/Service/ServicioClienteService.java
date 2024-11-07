package com.Corhuila.Parque.Service;

import com.Corhuila.Parque.Entity.ServicioCliente;
import com.Corhuila.Parque.IRepository.IServicioClienteRepository;
import com.Corhuila.Parque.IService.IServicioClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioClienteService implements IServicioClienteService {
    @Autowired
    private IServicioClienteRepository repository;

    @Override
    public ServicioCliente save(ServicioCliente servicioServicioCliente) {
        return repository.save(servicioServicioCliente);
    }

    @Override
    public void update(ServicioCliente servicioServicioCliente, Integer id) {
        //Validar si existe.
        Optional<ServicioCliente> up =  repository.findById(id);

        if(!up.isEmpty()){
            up.get().setCantidad(servicioServicioCliente.getCantidad());
            up.get().setTotalPagar(servicioServicioCliente.getTotalPagar());
            up.get().setClienteId(servicioServicioCliente.getClienteId());
            up.get().setServicioId(servicioServicioCliente.getServicioId());
            repository.save(servicioServicioCliente);
        }else {
            System.out.println("No existe registro");
        }
    }

    @Override
    public List<ServicioCliente> all() {
        return repository.findAll();
    }

    @Override
    public Optional<ServicioCliente> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}
