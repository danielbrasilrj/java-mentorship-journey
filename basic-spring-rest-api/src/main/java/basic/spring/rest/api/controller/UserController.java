package basic.spring.rest.api.controller;

import basic.spring.rest.api.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public final class UserController {

	@GetMapping("/{id}")
	public ResponseEntity<User> getUser(@PathVariable String id) {
		User user = new User();
		user.setId( id );
		user.setName( "User " + id );
		user.setEmail( "test@email.com" );

		return ResponseEntity
				.ok()
				.body(user);
	}
}
