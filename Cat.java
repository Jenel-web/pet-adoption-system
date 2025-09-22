package LearningOOP.PetAdoption;

public class Cat extends Pet{

     String color;
     String type;

    Cat(String name, int age, String color, String type)
    {
        super(name, age);
        this.color = color;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public void makeSound()
    {
        System.out.println("Meow! Meow!");
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Color : " + color);
    }

    public String toString()
    {
       return super.toString() + " || Type : " + type + " || Color : " + color; 
    }
}
