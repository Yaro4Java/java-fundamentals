package kozlov.homework.example;

public interface Guarding extends Specialization {
    @Override
    default String action() {
        return "protects house";
    }
}
