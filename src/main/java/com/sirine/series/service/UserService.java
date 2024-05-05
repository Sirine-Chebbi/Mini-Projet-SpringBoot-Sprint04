package com.sirine.series.service;

import com.sirine.series.entities.Role;
import com.sirine.series.entities.User;

public interface UserService {
	
	void deleteAllusers();
	void deleteAllRoles();
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);

}
