package inheritance;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void changeFirstName(final String newFirstName) {
        //newFirstName = "something else";
    }

    public String fullName() {
        return String.format("%s %s", firstName, lastName);
    }
}
