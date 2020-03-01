package kozlov.homework.example;

public interface Woofing extends Acoustics {
    @Override
    default String sound() {
        return "'woof'";
    }
}
