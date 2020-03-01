package kozlov.homework.example;

public class Cat extends Pet implements Meowing, MiceHunting {
    @Override
    protected String getName() {
        return "Cat";
    }
}
