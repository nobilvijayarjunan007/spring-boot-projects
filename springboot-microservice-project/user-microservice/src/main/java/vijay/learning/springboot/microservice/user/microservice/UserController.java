package vijay.learning.springboot.microservice.user.microservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

	@GetMapping("/message")
	public String getMessage() {
		return "Hello from user microservice";
	}
}
