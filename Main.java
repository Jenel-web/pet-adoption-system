package LearningOOP.PetAdoption;

import java.util.*;

public class Main
{
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        ArrayList<Pet> pets = new ArrayList<>();
        int age;
        System.out.print("How many pets are in the center? ");
        int n = in.nextInt();
        in.nextLine();

        System.out.println("Enter the details of the pets.\n");
        while(pets.size() < n)
        {
            System.out.print("Name : ");
            String name = in.nextLine();

            try{
                System.out.print("Age : ");
                age = in.nextInt();
                in.nextLine();
            } catch(InputMismatchException e)
            {
                System.out.println("Only numbers are allowed!Try again.\n");
                in.nextLine();
                continue;

            }
        
            System.out.print("Type : ");
            String type = in.nextLine();

            if(type.equalsIgnoreCase("Dog"))
            {
                System.out.print("Breed : ");
                String breed = in.nextLine();
                System.out.println();

                pets.add(new Dog(name, age, breed, "Dog"));
            }

            else if(type.equalsIgnoreCase("Cat"))
            {
                System.out.print("Color : ");
                String color = in.nextLine();
                System.out.println();

                pets.add(new Cat(name, age, color, "Cat"));
            }
            else
            {
                System.out.println("Invalid pet type! Try again.\n");
                continue;   
            }
        }

        //ask for the details of the adopter.
        System.out.println("What is the name of the adopter : ");
        String name = in.nextLine();

        Adopter adopter = new Adopter(name);
        int index = 0;
        int adoptedPets = 0;
        
        outerLoop: // label the loop so that the compiler will not get confused;
        while(true)
        {   
            //prints the pets in the shop
            
            if(adoptedPets < n)
            {

            
            System.out.println("These are the the pets in the center: \n\n"); 
            for(Pet pet : pets)
            {   
                if(!pet.isAdopted)
                {
                    System.out.println(index + ". " + pet + " (Available)");
                }
                else
                {
                    System.out.println(index + ". " + pet + " (Not Available)");
                }
                index++;
            }   
            index = 0;
            int choice;
            try{
                System.out.print("\nWhich pet do you want to adopt? ");
                choice = in.nextInt();
                in.nextLine();
            

            if(choice >= pets.size() || choice < 0)
            {
                System.out.println("Invalid pet number. Try inputting again.");
                continue outerLoop;
            }
            }catch(InputMismatchException e )
            {   
                in.nextLine();
                System.out.println("Please enter a number.");
                continue outerLoop;
            }
            Pet chosen = pets.get(choice);

            if(chosen.isAdopted)
            {
                System.out.println("Unfortunately, this pet has been adopted already. Would you like to pick another?(Press y if you want to adopt again).");
                char toContinue = in.nextLine().charAt(0);

                switch(toContinue)
                {
                    case 'y':
                    case 'Y':
                        //System.out.println("Please look at the pets again.");
                        continue outerLoop;
                    
                    default:
                        System.out.println("Thank you for choosing our adoption center. Please come again sometime.");
                        break outerLoop;
                }   
            }
        
            else 
            {
                adopter.adoptPet(chosen);
                chosen.setAdopted(true);
                adoptedPets++;
                System.out.println(chosen.getName() + " adopted successfully.");

            }
                System.out.print("Would you like to adopt another?(Press y if you want to adopt again): ");
                char toContinue = in.nextLine().charAt(0);
                
                switch(toContinue)
                {
                    case 'y':                        case 'Y':
                        //System.out.println("Please look at the pets again.");
                        continue outerLoop;
                    default: 
                        System.out.println("Thank you for choosing our adoption center. Please come again sometime.");
                        break outerLoop;  
                    }
            }
            else
            {
                System.out.println("\n\nUnfortunately, you have adopted all the pets already. Please come again next time.");
                break outerLoop;
            }
        }
        in.close();
    }
}