package com.skilldistillery.foodtruck;

public class FoodTruckFleet {
	private int numTrucks = 0;
	private int MAX_Trucks = 5;
	public FoodTruck[] truck;
	
	public FoodTruckFleet() {
		truck = new FoodTruck[MAX_Trucks]; 

	}
	
	public void addTruck(FoodTruck t) {
		truck[numTrucks] = t;
		numTrucks++;
	}
	
	public FoodTruck[] getTruck() {
		FoodTruck [] alltrucks;
		alltrucks = new FoodTruck[numTrucks];
		for (int i = 0; i < numTrucks; i++) {
			alltrucks[i] = truck[i];
			System.out.println(alltrucks);
		}
		return alltrucks;
	}
}
