package com.example.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Login;

@Repository
public interface UserDaoImp extends JpaRepository<Login, String>{
	
	public Login findByUsernameAndPassword(String username, String password);

}