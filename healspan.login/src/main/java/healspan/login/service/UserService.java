package healspan.login.service;

import java.util.ArrayList;
import java.util.List;

import healspan.login.Constants;
import healspan.login.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import healspan.login.entity.User;
import healspan.login.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	public User findBy(String um_username, String um_password) {
		try {
			User user =userRepository.findByUsernameAndPassword(um_username,um_password);
			System.out.println("User Record: " + user.toString());
			if (um_username.equalsIgnoreCase(user.getUsername()) && um_password.equals(user.getPassword()) ) {
				return user;
			}
			else return null;
		} catch (Exception ex) {
			throw new ResourceNotFoundException(Constants.LOGIN_FAILED);
		}
	}

	public List<User> getAllUser() {
		List<User> user = new ArrayList<User>();
		userRepository.findAll().forEach(user1 -> user.add(user1));
		return user;
	}
}