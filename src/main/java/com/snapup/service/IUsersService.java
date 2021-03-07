package com.snapup.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.snapup.model.User;


public interface IUsersService {

	public User getUserById(int id);
}
