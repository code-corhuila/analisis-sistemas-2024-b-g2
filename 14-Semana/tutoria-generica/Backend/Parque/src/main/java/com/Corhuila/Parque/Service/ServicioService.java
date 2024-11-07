package com.Corhuila.Parque.Service;

import com.Corhuila.Parque.Entity.Servicio;
import com.Corhuila.Parque.IRepository.IServicioRepository;
import com.Corhuila.Parque.IService.IServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioService implements IServicioService {
    @Autowired
    private IServicioRepository repository;

    @Override
    public Servicio save(Servicio servicio) {
        return repository.save(servicio);
    }

    @Override
    public void update(Servicio servicio, Integer id) {
        //Validar si existe.
        Optional<Servicio> up =  repository.findById(id);

        if(!up.isEmpty()){
            up.get().setCodigo(servicio.getCodigo());
            up.get().setNombre(servicio.getNombre());
            up.get().setPrecioUnitario(servicio.getPrecioUnitario());
            repository.save(servicio);
        }else {
            System.out.println("No existe registro");
        }
    }

    @Override
    public List<Servicio> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Servicio> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }
}