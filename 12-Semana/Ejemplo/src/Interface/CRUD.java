package Interface;

import java.util.List;
import java.util.Optional;

public interface CRUD {

    //Crear
    Object Save(Object object);

    //Modificar
    void Update(Object object, Long id);

    //Consultar todo
    List<Object> All();

    //Consultar por id
    Optional<Object> FindById(Long id);

    //Eliminar
    void DeleteById(Long id);
}
