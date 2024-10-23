package Entity.Implement;

import Entity.Abtract.ABaseEntity;

import java.util.List;
import java.util.Optional;

public class Person extends ABaseEntity {
    private String typeDocument;
    private String numberDocument;
    private String fullName;
    private String phone;

    public String getTypeDocument() {
        return typeDocument;
    }

    public void setTypeDocument(String typeDocument) {
        this.typeDocument = typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }

    public void setNumberDocument(String numberDocument) {
        this.numberDocument = numberDocument;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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
        System.out.printf("Eliminanda la persona "+id+"\n");
    }
}
