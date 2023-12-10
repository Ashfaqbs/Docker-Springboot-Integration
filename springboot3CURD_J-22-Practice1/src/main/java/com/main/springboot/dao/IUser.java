/**
 * Code developed by Ashfaq (© [Year])
 * GitHub: https://github.com/DarkSharkAsh
 */

package com.main.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.main.springboot.model.User;

public interface IUser extends JpaRepository<User, Long> {

}
