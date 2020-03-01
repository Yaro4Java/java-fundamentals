package kozlov.homework.example;

public class UnknownPet extends Pet {

    private String name;

    UnknownPet(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    @Override
    protected String getName() {
        return name;
    }

    @Override
    public String sound() {
        return "unknown sound";
    }

    @Override
    public String action() {
        return "specializes unclear action";
    }
}
