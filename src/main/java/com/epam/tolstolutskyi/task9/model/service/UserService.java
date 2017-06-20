package com.epam.tolstolutskyi.task9.model.service;

import com.epam.tolstolutskyi.task9.model.domain.User;

public interface UserService {
	boolean register(User user);

	User selectUserByLoginAndPassword(String login, String password);
}
