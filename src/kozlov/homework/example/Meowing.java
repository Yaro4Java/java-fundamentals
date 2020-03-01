package kozlov.homework.example;

public interface Meowing extends Acoustics {
    @Override
    default String sound() {
        return "'meow'";
    }
}
