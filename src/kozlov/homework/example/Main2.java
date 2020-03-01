package kozlov.homework.example;

public class Main2 {
    public static void main(String[] args) {
        printLanguageDescription(getLanguageByName(args[0]));
    }

    private static Pet getLanguageByName(String name) {
        switch (name.toLowerCase()) {
            case "cat":
                return new Cat();
            case "dog":
                return new Dog();
            case "hedgehog":
                return new Hedgehog();
            case "goldfish":
            case "fish":
                return new Fish();
            default:
                return new UnknownPet(name);
        }
    }

    private static void printLanguageDescription(Pet pet) {
        System.out.println(pet.getDescription());
    }
}
