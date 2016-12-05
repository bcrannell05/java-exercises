package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Person luis = new Person("Luis", "Montealegre");
        Person superman = new Superhero(
                "Clark",
                "Kent",
                "Superman",
                "He can fly"
        );

        List<Person> students = new ArrayList<>();
        students.add(luis);
        students.add(superman);

        printStudents((ArrayList<Person>) students);
    }

    public static void printStudents(ArrayList<Person> students)
    {
        for (Person student: students) {
            System.out.println(student.fullName());
        }
    }

    public static void printSuperheroes(ArrayList<Superhero> superheroes)
    {
        for (Superhero superhero: superheroes) {
            System.out.println(superhero.alterEgo());
        }
    }
}
