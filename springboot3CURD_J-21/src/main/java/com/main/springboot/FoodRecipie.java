/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.main.springboot;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Food_Recepe_Table")
public class FoodRecipie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String foodName;

	private double foodCost;

	private String foodLocation;

	public FoodRecipie(long id, String foodName, double foodCost, String foodLocation) {
		this.id = id;
		this.foodName = foodName;
		this.foodCost = foodCost;
		this.foodLocation = foodLocation;
	}

	public FoodRecipie() {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public double getFoodCost() {
		return foodCost;
	}

	public void setFoodCost(double foodCost) {
		this.foodCost = foodCost;
	}

	public String getFoodLocation() {
		return foodLocation;
	}

	public void setFoodLocation(String foodLocation) {
		this.foodLocation = foodLocation;
	}

	@Override
	public String toString() {
		return "FoodRecipie [id=" + id + ", foodName=" + foodName + ", foodCost=" + foodCost + ", foodLocation="
				+ foodLocation + "]";
	}

}
