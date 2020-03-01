package kozlov.homework.generics;

public class Pet<A extends Acoustics, S extends Specialization> implements ObjectsWithAcousticsAndBehavior {
    private String name;
    private A acoustics;
    private S specialization;

    public Pet(String name, A acoustics, S specialization) {
        this.name = name;
        this.acoustics = acoustics;
        this.specialization = specialization;
    }

    String getDescription() {
        return name + " says " + acoustics.sound() + " and " + specialization.action()   + ".";
    }

    @Override
    public A getAcoustics() {
        return acoustics;
    }

    @Override
    public S getSpecialization() {
        return specialization;
    }

    @Override
    public String toString() {
        return "Pet<" + acoustics.getClass().getName() + "," + specialization.getClass().getName() + ">";
    }
}
