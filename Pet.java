package LearningOOP.PetAdoption;

public class Pet {

    private String name;
    private int age;
    boolean isAdopted;
    
    
    public Pet(String name, int age)
    {
        this.name = name;
        this.age = age;
        this.isAdopted = false; // false when declared
    }
    
    public boolean isAdopted() // will check if the pet is already adopted.
    {
        return isAdopted;
    }

    public void setAdopted(boolean adopted)
    {
        this.isAdopted = adopted;    
    
    }
    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public void makeSound()
    {
        System.out.println("Overwrite me!");
    }
    
    void displayInfo()
    {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }

    public String toString()
    {
        return "Name : " + name + " || Age : " + age;
    }

}

