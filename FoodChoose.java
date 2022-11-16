//This program will help select a restaurant for those who spend more time looking for a place to eat than actually eating!

import java.util.Scanner;
import java.util.Random;

//main method
public class FoodChoose {
   public static void main (String [] args){
   
   // Display Welcome Message and meal time options 
   System.out.printf("Hello ! I heard you were hungry...in that case, let me help you out a bit!\n\nWhat time of day is it right now?\n1. breakfast time\n2. lunch or dinner time\n");
   
   // declare timeChoice and take user input 
   Scanner input = new Scanner (System.in);
   System.out.print("Please type in the corresponding number: ");
     int timeChoice = input.nextInt();
      
      //conditional to call lunch or breakfast method 
      if (timeChoice == 1) { 
         System.out.println("Breakfast time huh? Great Choice.");
         
         //call breakfast method
         Breakfast();
         }
      else if (timeChoice == 2) {
         System.out.print("Dinner or lunch: I can't wait!");
         
         //call lunch/dinner method 
         Linner();
         }
      else { System.out.print("Weird it looks like you didn't pick a possbile option, let's try that again."); }
   
   }



//Breakfast Method:
public static void Breakfast(){

Scanner input = new Scanner (System.in);

//Message 
System.out.println("Now let's get to the real question... where we going to eat...I can feel my stomach rumbling..\n\n ");

// create array of possible breakfast locations
String [] breakfastOptions = {"IHop","First Watch","The Wine House", "Dunkin Donuts","Swiss Bakery", "Starbucks", "McDonalds"};
int size = breakfastOptions.length;

// Declare variables 
String c = "no";
int count = 0;

//loop to display breakfast options
while (count < 1) {

   // generate random breakfast option from array
   Random rand = new Random();
   int Rand_item = rand.nextInt(size);
   System.out.println("How about " + breakfastOptions[Rand_item] + " ?");
   
   // Print message for confirmation
   System.out.println("Type yes to confirm or no to print another option.");
   
	// take user input 
    String breakchoice1 = input.next(); 
  
      // conditional to continue/ discontinue loop
      if (breakchoice1.equals(c)){}
         else {
            System.out.println(" Great! enjoy :) "); count++;
            } 
      }
   }


//Lunch/Dinner Method 

   public static void Linner() {
    
    Scanner input = new Scanner(System.in);
    String cusinechoice;
    
    // Print out Cuisine options and take user input choice 
    System.out.printf("\n\nPlease select a cuisine option:\n1. Asian\n2. Italian\n3. American\n4. Latin\n5. Fine Dining\n6. choose for me.\n ");
    int cuisinechoice = input.nextInt();
    
    // switch based on user input choice
    switch (cuisinechoice){
    case 1: String [] asianOptions = {"Peking Cafe","Iron Age KBBQ","Bonchon", "Suny Sushi", "Sushi Queen"};
            int size = asianOptions.length;

            // Declare variables
            String n = "no";
            int count = 0;
            
            // loop to control choice of asian cuisine options
            while (count < 1) {
            
                  //generate random option from array
                  Random rand = new Random();
                   int Rand_item = rand.nextInt(asianOptions.length);
                   System.out.println("\nHow about " + asianOptions[Rand_item] + " ?");
                   
                   // Print restaurant confirmation
                   System.out.println("Type yes to confirm or no to print another option.");
                   
	                // take user input 
                    String asianchoice1 = input.next(); 
                    
                     // conditional to continue/ discontinue loop
                       if (asianchoice1.equals(n)){}
                            else{ 
                                 System.out.println("Great! enjoy :)"); count++;
                                 } 
             }
             break;

    case 2: String [] italianOptions = {"Olive Garden","Paisano's Pizza","Alta Strada", "Maggiano's", "Bertucci's Italian Restaurant"};
            int itsize = italianOptions.length;

            // Declare variable “confirmation”
            String itn = "no";
            int itcount = 0;
            
            // loop to control choice of italian cuisine options
            while (itcount < 1) {
                  Random rand = new Random();
                   int Rand_item = rand.nextInt(itsize);
                   System.out.println("\nHow about " + italianOptions[Rand_item] + " ?");
                   
                   // Print resturant confirmation
                   System.out.println("Type yes to confirm or no to print another option.");
                   
	                // take user input 
                    String itchoice1 = input.next();
                    // conditional to continue or discontinue loop  
                       if (itchoice1.equals(itn)){}
                            else{ 
                                 System.out.println("Yay! Sounds great! Enjoy! "); itcount++;
                                 } 
             }
             break;
    case 3: String [] americanOptions = {"IHop","McDonalds","Red Robin", "Silver Diner", "Johnny Rockets", "JukeBox Diner", "HardRock Cafe"};
            int amsize = americanOptions.length;

            // Declare variable “confirmation”
            String amn = "no";
            int amcount = 0;
            
            // loop to control choice of american cuisine options
            while (amcount < 1) {
                  Random rand = new Random();
                   int Rand_item = rand.nextInt(amsize);
                   System.out.println("\nHow about " + americanOptions[Rand_item] + " ?");
                   
                   // Prnt to see if it is okay 
                   System.out.println("Type yes to confirm or no to print another option.");
                   
	                // take user input 
                    String amchoice1 = input.next(); 
                       if (amchoice1.equals(amn)){}
                            else{ 
                                 System.out.println("yay! Glad we could find you a place to eat!"); amcount++;
                                 } 
             }
             break;
    case 4: String [] latinOptions = {"Taco Bell","Super Pollo","Dona Bessys Pupuseria", "Guapos", "Anitas", "Los Hermanos"};
            int lsize = latinOptions.length;

            // Declare variable “confirmation”
            String ln = "no";
            int lcount = 0;
            
            // loop to control choice of latin cuisine options
            while (lcount < 1) {
                  Random rand = new Random();
                   int Rand_item = rand.nextInt(lsize);
                   System.out.println("\nHow about " + latinOptions[Rand_item] + " ?");
                   
                   // Prnt to see if it is okay 
                   System.out.println("Type yes to confirm or no to print another option.");
                   
	                // take user input 
                    String lchoice1 = input.next(); 
                       if (lchoice1.equals(ln)){}
                            else{ 
                                 System.out.println("Sounds great! Enjoy!"); lcount++;
                                 } 
             }
             break;
    case 5: String [] fineOptions = {"Barmini","Fiola","Marcel's", "Rasika","1789 Restaurant and Bar"};
            int fsize = fineOptions.length;

            // Declare variables
            String fn = "no";
            int fcount = 0;
            
            // loop to control choice of fine dining cuisine options
            while (fcount < 1) {
                  Random rand = new Random();
                   int Rand_item = rand.nextInt(fsize);
                   System.out.println("\nHow about " + fineOptions[Rand_item] + " ?");
                   
                   // Print message for confirmation
                   System.out.println("Type yes to confirm or no to print another option.");
                   
	                // take user input 
                    String fchoice1 = input.next();
                    
                     // conditional to continue or discontinue loop
                       if (fchoice1.equals(fn)){}
                            else{ 
                                 System.out.println("Sounds great! Enjoy!"); fcount++;
                                 } 
             }
             break;
    case 6: String [] allOptions = {"Barmini","Fiola","Marcel's", "Rasika","1789 Restaurant and Bar", "Taco Bell","Super Pollo",
                                    "Dona Bessys Pupuseria", "Guapos", "Anitas", "Los Hermanos", "IHop","McDonalds","Red Robin", 
                                    "Silver Diner", "Johnny Rockets", "JukeBox Diner", "HardRock Cafe", "Olive Garden","Paisano's Pizza",
                                    "Alta Strada", "Maggiano's", "Bertucci's Italian Restaurant", "Peking Cafe","Iron Age KBBQ","Bonchon", 
                                    "Suny Sushi", "Sushi Queen" };
            int allsize = allOptions.length;

            // Declare variable “confirmation”
            String alln = "no";
            int allcount = 0;
            
            // loop to control choice of random options
            while (allcount < 1) {
                  Random rand = new Random();
                   int Rand_item = rand.nextInt(allsize);
                   System.out.println("\nHow about " + allOptions[Rand_item] + " ?");
                   
                   // Print confirmation message of restaurant
                   System.out.println("Type yes to confirm or no to print another option.");
                   
	                // take user input 
                    String allchoice1 = input.next(); 
                    
                    // conditional to conitinue/ discontinue loop
                       if (allchoice1.equals(alln)){}
                            else{ 
                                 System.out.println("yay! Enjoy your meal! "); allcount++;
                                 } 
             }
             break;
    default: System.out.println("hmmm it doesn't look like that is a valid option");
    
    }
    
    } 
}
