package kozlov.homework.generics;

public class UnknownPet implements Acoustics, Specialization {
    @Override
    public String sound() {
        return "unknown sound";
    }

    @Override
    public String action() {
        return "specializes unknown action";
    }
}
