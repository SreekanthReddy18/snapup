package com.snapup.service.impl;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.snapup.model.User;
import com.snapup.service.IUsersService;

@Service
public class UserServiceImpl implements IUsersService {

	static Map<Integer, User> userMap = new HashMap<>();
	
	static {
		User user1 = new User(1, "Swaroopa", "hyd");
		User user2 = new User(2,"Chandana","ongole");
		
		
		
		userMap.put(user1.getId(), user1);
		userMap.put(user2.getId(), user2);
	}
	
	@Override
	public User getUserById(int id) {
		
		return userMap.get(id);
	}

}
