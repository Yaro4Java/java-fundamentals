package kozlov.homework.example;

public class Fish extends Pet implements Silent, Calming {
    @Override
    protected String getName() {
        return "Fish";
    }
}
