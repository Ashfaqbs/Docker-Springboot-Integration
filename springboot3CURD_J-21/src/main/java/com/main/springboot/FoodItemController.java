/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.main.springboot;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class FoodItemController {

	@Autowired
	IFoodRecepe foodRecepe;

	@PostMapping("/foods")
	public FoodRecipie addFoodRecepie(@RequestBody FoodRecipie foodrecepie) {
		System.out.println("Post : " + foodrecepie);
		foodRecepe.save(foodrecepie);

		return foodrecepie;

	}

	@GetMapping("/foods/{id}")
	public FoodRecipie getFoodRecepie(@PathVariable  long id) {
		FoodRecipie findById = foodRecepe.findById(id).get();
		System.out.println("id : "+ id);
		return findById;
	}

	@GetMapping("/foods")
	public List<FoodRecipie> getALLFoodRecepie() {
		List<FoodRecipie> findAll = foodRecepe.findAll();
		return findAll;
	}

}
