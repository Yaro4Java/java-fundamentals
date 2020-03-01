package kozlov.homework.generics;

public class Main3 {
    public static void main(String[] args) {
        Pet pet = getLanguageByName(args[0]);
        System.out.println(pet.getDescription());
        System.out.println(pet.toString());
    }

    private static Pet getLanguageByName(String name) {
        switch (name.toLowerCase()) {
            case "dog":
                return new Pet("Dog", () -> "'woof'", () -> "protects house");
            case "fish":
            case "goldfish":
                return new Pet("Fish", () -> "nothing", () -> "calms nerves");
            case "cat":
                return new Pet("Cat", () -> "'meow'", () -> "catches mice");
            case "hedgehog":
                return new Pet("Hedgehog",() -> "'frr'", () -> "catches mice");
            default:
                return new Pet(name, new UnknownPet(), new UnknownPet());
        }
    }
}
