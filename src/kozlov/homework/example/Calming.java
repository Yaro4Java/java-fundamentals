package kozlov.homework.example;

public interface Calming extends Specialization {
    @Override
    default String action() {
        return "calms nerves";
    }
}
