package inheritance;

public class Superhero extends Person {
    private String superPower;
    private String superName;

    public Superhero(
            String firstName,
            String lastName,
            String superName,
            String superPower
    ) {
        super(firstName, lastName);
        this.superName = superName;
        this.superPower = superPower;
    }

    public String alterEgo() {
        return super.fullName();
    }

    @Override
    public String fullName() {
        return superName;
    }
}