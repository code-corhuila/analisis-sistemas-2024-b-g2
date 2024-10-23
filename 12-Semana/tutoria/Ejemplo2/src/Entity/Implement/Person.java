package Entity.Implement;

import Entity.Abstract.ABaseEntity;

public class Person  extends ABaseEntity {
    private String nombre;
    private String apellido;
    private byte edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    @Override
    public void Save() {
        System.out.printf("Guardando persona \n");
    }

    @Override
    public void Update() {
        System.out.printf("Modificando persona \n");
    }

    @Override
    public void All() {
        System.out.printf("Lista de personas \n");
    }

    @Override
    public void FindById() {
        System.out.printf("Encontrada la persona por id \n");
    }

    @Override
    public void Delete() {
        System.out.printf("Eliminado persona \n");
    }
}
