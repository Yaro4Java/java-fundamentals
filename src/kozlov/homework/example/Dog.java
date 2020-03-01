package kozlov.homework.example;

public class Dog extends Pet implements Woofing, Guarding {
    @Override
    protected String getName() {
        return "Dog";
    }
}
