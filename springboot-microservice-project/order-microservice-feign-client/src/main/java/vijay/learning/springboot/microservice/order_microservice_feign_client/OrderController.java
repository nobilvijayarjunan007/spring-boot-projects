package vijay.learning.springboot.microservice.order_microservice_feign_client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
	private final UserServiceClient userServiceClient;
	
	public OrderController(UserServiceClient userServiceClient) {
		this.userServiceClient = userServiceClient;
	}


    @GetMapping("/message")
	public String getMessage() {
		
		return "Hi Vijay order is ready and "+userServiceClient.getMessageFromUserMicroService();
	}
}
