package pet.management.system;

public class Cat extends Pet{

    private String color;

    public Cat(String name, int age, String species, String color) {
        super(name, age, species);
        this.color = color;
    }

    @Override
    public String makeSound() {
        return "Meow!";
    }

    @Override
    public String eat() {
        return "Cats eat cat food.";
    }

    @Override
    public String toString() {
        return super.toString()+ // שימוש ב-super לקריאה ל-toString במחלקה האבסטרקטית
                "Cat {" +
                "color='" + color + '\'' +
                '}';
    }
}
