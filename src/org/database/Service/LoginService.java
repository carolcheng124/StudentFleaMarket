package org.database.Service;

import org.database.Beam.User;

public interface LoginService {
	boolean verifyLogin(User user);
	User getUser(User user);
}
