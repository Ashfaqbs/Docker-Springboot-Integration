/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.main.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.springboot.model.User;
import com.main.springboot.service.UserService;

@RestController
@RequestMapping("/api/v1")
public class MainController {

	@Autowired
	private UserService uService;

	@GetMapping("/users")
	public List<User> getAllUsers() {

		return uService.getAllUsers();
	}

	@GetMapping("/users/{id}")
	public User getUsers(@PathVariable("id") long id) {

		return uService.getUsers(id);
	}

	@DeleteMapping("/users/{id}")
	public boolean deleteUsers(@PathVariable("id") long id) {

		return uService.removeUser(id);
	}

	@PostMapping("/users")
	public User addUsers(@RequestBody User user) {

		return uService.addUser(user);
	}

	@PutMapping("/users/{id}")
	public User addUsers(@PathVariable("id") long id, @RequestBody User user) {

		return uService.UpdateUser(id, user);
	}

}
