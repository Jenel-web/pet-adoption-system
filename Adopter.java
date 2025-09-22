package LearningOOP.PetAdoption;

import java.util.ArrayList;

public class Adopter
{
    private String name;
    ArrayList<Pet> adoptedPets = new ArrayList<>();

    Adopter(String name)
    {
        this.name = name;
    }

    public void setAdoptedPets(ArrayList<Pet> adoptedPets) {
        this.adoptedPets = adoptedPets;
    }

    public ArrayList<Pet> getAdoptedPets() {
        return adoptedPets;
    }


    public void adoptPet(Pet pet)
    {
        adoptedPets.add(pet);
    }



    


}