package com.skilldistillery.foodtruck;

import java.util.Iterator;
import java.util.Scanner;

public class FoodTruckApp {
	private int numTrucks = 0;
	private int MAX_Trucks = 5;
	public FoodTruck[] fleet;
	public FoodTruck info = new FoodTruck();
	static Scanner kb = new Scanner(System.in);

	public void buildTruck() { // getting truck info to send to FoodTruck()

		if (numTrucks < 5) {
			System.out.println("What is the name of the food truck?");
			String name = kb.next();
			if (name.equalsIgnoreCase("quit")) {
				System.out.println("You have chosen to quit");
				System.out.println("---------------");
				printMenu();
			}
			System.out.println("What type of food does " + name + " have?");
			String foodType = kb.next();
			System.out.println("On a scale of 1-5, how would you rate the food at " + name);
			double rating = kb.nextDouble();
			FoodTruck fTruck = new FoodTruck(name, foodType, rating);
			addTruckToFleet(fTruck);
		} else if (numTrucks == 5) {
			System.out.println("Sorry but you have reached your limit of food trucks");
			System.out.println();
			printMenu();
		}
	}

	public void addTruckToFleet(FoodTruck newTruck) {
		fleet[numTrucks] = newTruck;
		numTrucks++;

	}

	public void printTrucks(FoodTruck[] fTruck) {
		for (FoodTruck foodTruck : fTruck) {
			if (foodTruck != null) {
				System.out.println(foodTruck);
			}
		}
	}

	public void avgRating() {

		double sum = 0; 
		for (int i = 0; i < numTrucks; i++) {
			sum += fleet[i].getRating();
		}
		double avg = sum / numTrucks;

		System.out.println(avg);

	}

	public void highestRated() {

		String name = " ";
		double max = 0;
		for (int i = 0; i < numTrucks; i++) {
			if (fleet[i].getRating() > max) {
				max = fleet[i].getRating();
				name = fleet[i].toString();
			}
		}
		System.out.println("The highest rated food truck is " + name);
	}

	public void printMenu() {
		System.out.println("--------MENU----------");
		System.out.println("1) Add a Food Truck ");
		System.out.println("2) List all existing food trucks ");
		System.out.println("3) See the average rating of food trucks ");
		System.out.println("4) Display the highest rated food truck ");
		System.out.println("5) Quit the program ");
		System.out.println("----------------------");
		menuSwitch();
	}

	public void menuSwitch() {
		System.out.println("What would you like to do?");
		int result = kb.nextInt();

		switch (result) {
		case 1:
			System.out.println("Ok, Lets add a foodTruck");
			buildTruck();
			printMenu();
			menuSwitch();
			break;
		case 2:
			System.out.println("Ok, here is the list of trucks stored");
			printTrucks(fleet);
			printMenu();
			menuSwitch();
			break;
		case 3:
			System.out.println("Here is the average rating of the Food Trucks we have stored");
			avgRating();
			printMenu();
			menuSwitch();
			break;
		case 4:
			highestRated();
			printMenu();
			menuSwitch();
			break;
		case 5:
			System.out.println("You have chosen to quit");
			System.out.println("	Goode Bye");
			System.exit(result);
		}

	}

	public static void main(String[] args) {
		FoodTruckApp app = new FoodTruckApp();
		app.fleet = new FoodTruck[5];

		System.out.println("Welcome to the Food Truck App");
		app.printMenu();
		kb.close();
	}
}
