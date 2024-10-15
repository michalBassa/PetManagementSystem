package pet.management.system;

public class GeneralVeterinarian implements Veterinarian{
    private String name;

    public GeneralVeterinarian(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String examinePet(Pet pet) {
        return "General examination by " + name + ": " + pet.getName() + " seems healthy.";
    }
}
