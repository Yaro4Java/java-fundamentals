package kozlov.homework.example;

public interface Silent extends Acoustics {
    @Override
    default String sound() {
        return "nothing";
    }
}
