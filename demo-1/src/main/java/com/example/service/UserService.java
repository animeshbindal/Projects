package com.example.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.UserDaoImp;
import com.example.model.Login;

@Service
@Transactional
public class UserService {
	
	@Autowired
	UserDaoImp userDao;
	
	public Login findByUsernameAndPassword(String username, String password) {
		return userDao.findByUsernameAndPassword(username, password);
	}

}