package kozlov.homework.example;

public interface MiceHunting extends Specialization {
    @Override
    default String action() {
        return "catches mice";
    }
}
