package View;

import Entity.Abtract.ABaseEntity;
import Entity.Implement.Person;
import Entity.Implement.User;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person();
        person.setFullName("Pepito Mendieta");
        person.DeleteById((long) 1);

        User user = new User();
        user.setPersonId(person);
        user.DeleteById((long) 10);
    }
}