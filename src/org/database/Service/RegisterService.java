package org.database.Service;



import org.database.Beam.Store;
import org.database.Beam.User;

public interface RegisterService {
	boolean registration(User user, Store store);
}
