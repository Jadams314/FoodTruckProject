package com.skilldistillery.foodtruck;

public class FoodTruck {
	private String name;
	private String foodType;
	private double rating;
	private int truckId = 1;
	private static int numTruck;
/* When a FoodTruck is created, its constructor assigns its 
 * id field the current value of a static field (such as (nextTruckId) 
 * and then increments the static field.
 */

	public FoodTruck() {}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = numTruck;
		numTruck++;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFoodType() {
		return foodType;
	}
	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getTruckId() {
		return truckId;
	}
	public double getAvg() {
		double avg = rating / numTruck;
		
		
		return avg;
	}
	public String toString() {
		return "FoodTruck Name: " + name + ", FoodType: " + foodType + ", Rating: " + rating + ", Truck ID Number: " + truckId;
	}
	
}

