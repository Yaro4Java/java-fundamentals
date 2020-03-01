package kozlov.homework.example;

public interface Snorting extends Acoustics {
    @Override
    default String sound() {
        return "'frr'";
    }
}
