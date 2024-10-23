package Entity.Implement;

import Entity.Abstract.ABaseEntity;

public class Category extends ABaseEntity {

    private String nombre;
    private  String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    @Override
    public void Save() {
        System.out.printf("Guardando categoria \n");
    }

    @Override
    public void Update() {
        System.out.printf("Modificando categoria \n");
    }

    @Override
    public void All() {
        System.out.printf("Lista de categorias \n");
    }

    @Override
    public void FindById() {
        System.out.printf("Encontrada la categoria por id \n");
    }

    @Override
    public void Delete() {
        System.out.printf("Eliminado categoria \n");
    }

}
