package com.skilldistillery.foodtruck;

import java.util.Arrays;
import java.util.Scanner;


public class FoodTruckApp {
private int numTrucks = 0;
private int MAX_Trucks = 5;
public FoodTruck[] fTruck;


static Scanner kb = new Scanner(System.in);




/*User Story #1
	 *	The user is prompted to input the name, food type, and rating for up to five food trucks.
	 *	 For each set of input, a FoodTruck object is created, its fields set to the user's input,
	 *	  and it is added to the array. The truck id is not input by the user, but instead assigned 
	 *	  automatically in the FoodTruck constructor from a static field that is incremented as each 
	 *    truck is created.
	 */	

// make user method to build food truck..... will ask the user for the name,food type and their rating
	// after each truck ask if they would like to add another. they must be able to quit out of adding 
	// the truck during the name phase by typing quit.
	

/* User Story #3
	After input is complete, the user sees a menu from which they can choose to:

	List all existing food trucks.
	See the average rating of food trucks.
	Display the highest-rated food truck.
	Quit the program.
 * 	
 */
	
// make print menu method with a switch
	// think about adding another button to add another food truck if the user hasn't met the max entry's
		// whether or not I add the option to add more trucks I need to have a counter for the number
		// of trucks the user has added.
//	for (int i = 0; i < fTruck.length; i++) {
//		
//	}
	public FoodTruck buildTruck() {				// getting truck info to send to FoodTruck()
		
			System.out.println("What is the name of the food truck?");
			String	name = kb.next();
			System.out.println("What type of food does " + name + " have?");
			String	foodType = kb.next();
			System.out.println("On a scale of 1-5, how would you rate the food at " + name);
			double	rating = kb.nextDouble();

			FoodTruck fTruck = new FoodTruck (name, foodType, rating);
			addTruckToFleet(fTruck);
			return fTruck;
	}
	public FoodTruck [] addTruckToFleet(FoodTruck newTruck) {
	FoodTruck[] fTruck = new FoodTruck [numTrucks];
	numTrucks++;
	return fTruck;
	}
	public void printTrucks(FoodTruck[] newTruck) {
		System.out.println(Arrays.toString(fTruck));
		
		System.out.println();
	}
	public void avgRating() {

		
	}
	public void highestRated() {
		
	}
	
	public void printMenu() {
		System.out.println("Welcome to the Menu");
		System.out.println();
		System.out.println("1) List all existing food trucks ");
		System.out.println("2) See the average rating of food trucks ");
		System.out.println("3) Disply the highest rated food truck ");
		System.out.println("4) Quit the program ");
		menuSwitch();
	}
	
	public void menuSwitch() {
		System.out.println("What would you like to do?");
		int result = kb.nextInt();
		
		switch (result) {
		case 1:
			System.out.println("Ok, here is the list of trucks stored");
			printTrucks(fTruck);
			break;
		case 2:
			avgRating();
			break;
		case 3:
			highestRated();
			break;
		case 4:
			System.out.println("You have chosen to quit");
			System.out.println("	Goode Bye");
			System.exit(result);
		}
		
	}
	
	
	public static void main(String[] args) {
		FoodTruckApp user = new FoodTruckApp();
		
		user.buildTruck();
		user.addTruckToFleet(null);
		user.printMenu();
		kb.close();
	}
}
