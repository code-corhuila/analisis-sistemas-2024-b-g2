package Entity.Implement;

import Entity.Abtract.ABaseEntity;

import java.util.List;
import java.util.Optional;

public class User extends ABaseEntity {
    private String user;
    private String password;
    private Person personId;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person getPersonId() {
        return personId;
    }

    public void setPersonId(Person personId) {
        this.personId = personId;
    }

    @Override
    public Object Save(Object object) {
        return null;
    }

    @Override
    public void Update(Object object, Long id) {

    }

    @Override
    public List<Object> All() {
        return List.of();
    }

    @Override
    public Optional<Object> FindById(Long id) {
        return Optional.empty();
    }

    @Override
    public void DeleteById(Long id) {
        this.setId(id);
        System.out.printf("Eliminado el usuario "+this.getId()+" de la persona "+this.getPersonId().getFullName());
    }
}
