/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.main.springboot.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.springboot.dao.IUser;
import com.main.springboot.model.User;

@Service
public class UserService {

	private static Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private IUser iUser;

	public User addUser(User user) {

		try {
			if (user != null) {
				iUser.save(user);

			}

		} catch (Exception e) {
			System.out.println("Unable to add user");
		}

		return user;
	}

	public boolean removeUser(long id) {
		boolean br = false;
		try {

			iUser.deleteById(id);
			br = true;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return br;
	}

	public User UpdateUser(long id, User user) {
		User user2 = null;
		try {

			user2 = iUser.findById(id).get();
			if (user2 != null) {
				user2 = user;

			}
			iUser.save(user2);

		} catch (Exception e) {
			// TODO: handle exception
		}
		return user2;
	}

	public List<User> getAllUsers() {
		List<User> userList = null;
		try {

			userList = iUser.findAll();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return userList;
	}

	public User getUsers(long id) {
		User user = null;
		try {

			user = iUser.findById(id).get();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return user;
	}

}
