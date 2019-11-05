package construction_management.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.http.ResponseEntity;
import construction_management.Service.UserService;
import construction_management.Entity.User;

public class UserController {
	
	private UserService userService;
	
	@GetMapping("/User/{Id}")
	public ResponseEntity<User> get(@PathVariable("Id") int id){
		User user = userService.getUser(id);
		return ResponseEntity.ok().body(user);
	}
}
