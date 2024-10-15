package pet.management.system;

public class SpecialistVeterinarian extends GeneralVeterinarian{

    private String specialty;

    public SpecialistVeterinarian(String name, String specialty) {
        super(name);
        this.specialty = specialty;
    }
    @Override
    public String examinePet(Pet pet) {
        return "Specialized examination for " + specialty + " by " + getName() + ": "
                + pet.getName() + " needs further evaluation.";
    }
}
