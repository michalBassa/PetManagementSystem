package pet.management.system;

import java.util.ArrayList;
import java.util.List;

public class PetClinic {


    static void examineAllPetsByAllVeterinarians(List<Pet> pets, List<Veterinarian> veterinarians) {
        // כל וטרינר בודק את כל חיות המחמד
        for (Veterinarian vet : veterinarians) {
            System.out.println("Examination by " + vet.getName() + ":");
            for (Pet pet : pets) {
                System.out.println(pet);
                System.out.println(vet.examinePet(pet));
            }
        }
    }
    public static void main(String[] args) {
        List<Pet> pets = new ArrayList<>();
        pets.add(new Dog("Buddy", 3, "Dog", "Golden Retriever"));
        pets.add(new Cat("Whiskers", 2, "Cat", "Tabby"));
        pets.add(new Dog("Max", 5, "Dog", "German Shepherd"));

        List<Veterinarian> veterinarians = new ArrayList<>();
        veterinarians.add(new GeneralVeterinarian("Dr. Smith"));
        veterinarians.add(new SpecialistVeterinarian("Dr. Jones", "Cardiology"));

        examineAllPetsByAllVeterinarians(pets,veterinarians);
    }

}
