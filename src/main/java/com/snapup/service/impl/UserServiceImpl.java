package com.snapup.service.impl;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.snapup.model.User;
import com.snapup.service.IUsersService;

@Service
public class UserServiceImpl implements IUsersService {

	@Override
	public User getUserById(int id) {
		
		User user1 = new User(1, "Swaroopa", "hyd");
		User user2 = new User(2,"Chandana","ongole");
		
		Map<Integer, User> userMap = new HashMap<>();
		
		userMap.put(user1.getId(), user1);
		userMap.put(user2.getId(), user2);
		
		
		
		
		return userMap.get(id);
	}

}
