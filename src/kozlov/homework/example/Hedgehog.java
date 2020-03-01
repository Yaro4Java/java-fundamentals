package kozlov.homework.example;

public class Hedgehog extends Pet implements Snorting, MiceHunting {
    @Override
    protected String getName() {
        return "Hedgehog";
    }
}
