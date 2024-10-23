import Entity.Implement.Category;
import Entity.Implement.Person;

public class Main {
    public static void main(String[] args) {



        System.out.println("Hello world!");

        Person person = new Person();
        person.Save();

        Category category = new Category();
        category.Save();
    }
}