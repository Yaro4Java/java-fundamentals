package kozlov.homework.example;

public abstract class Pet implements Acoustics, Specialization {
    protected abstract String getName();

    String getDescription() {
        return getName() + " says " + sound() + " and " + action() + ".";
    }
}
