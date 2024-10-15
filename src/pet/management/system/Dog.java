package pet.management.system;

public class Dog extends Pet{

    private String breed;

    public Dog(String name, int age, String species, String breed) {
        super(name, age, species);
        this.breed = breed;
    }

    @Override
    public String makeSound() {
        return "Woof!";
    }

    @Override
    public String eat() {
        return "Dogs eat dog food";
    }

    @Override
    public String toString() {
        return super.toString()+ // שימוש ב-super לקריאה ל-toString במחלקה האבסטרקטית
                "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
