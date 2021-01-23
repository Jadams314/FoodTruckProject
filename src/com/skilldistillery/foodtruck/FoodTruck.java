package com.skilldistillery.foodtruck;

public class FoodTruck {
	public String name;
	public String foodType;
	public double rating;
	public int truckId;
/* When a FoodTruck is created, its constructor assigns its 
 * id field the current value of a static field (such as (nextTruckId) 
 * and then increments the static field.
 */
	
	public FoodTruck() {}

	public FoodTruck(String name, String foodType, double rating) {
		this.name = name;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = truckId++;
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
	public double getAverage() {
		return 0.0;
	}
}
