package com.wipro.service;

import com.wipro.entity.User;

public interface UserService {

	public User saveUser(User user);

	public void removeSessionMessage();

}
