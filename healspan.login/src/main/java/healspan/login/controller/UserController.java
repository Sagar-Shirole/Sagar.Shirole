package healspan.login.controller;

import healspan.login.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import healspan.login.service.UserService;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	// get User By Id
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<String> getUser(@RequestParam String username, @RequestParam String password) {
		System.out.println("Request Params: " + username + ", " + password);
		User user = userService.findBy(username, password);
		if (username.equalsIgnoreCase(user.getUsername()) && password.equals(user.getPassword())) {
			return new ResponseEntity<>("Welcome " , HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Invalid Credential ", HttpStatus.BAD_REQUEST);
		}
	}

	//Get All Details
	@GetMapping("/user")
	private List<User> getAllUser() {
		return userService.getAllUser();
	}
}

