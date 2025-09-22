package LearningOOP.PetAdoption;

public class Dog extends Pet {

    String breed;
    String type;

    Dog(String name, int age, String breed, String type)
    {
        super(name, age);
        this.breed = breed;
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public String getType() {
        return type;
    }
    public void makeSound()
    {
        System.out.println("Arf! Arf!");
    }

    void displayInfo()
    {
        super.displayInfo();
        System.out.println("Breed : " + breed);
    }

    public String toString()
    {
       return super.toString() + " || Type : " + type + " || Breed : " + breed; 
    }
}
