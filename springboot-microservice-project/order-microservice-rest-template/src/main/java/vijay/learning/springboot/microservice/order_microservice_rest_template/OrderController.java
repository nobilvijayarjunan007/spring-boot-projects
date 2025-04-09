package vijay.learning.springboot.microservice.order_microservice_rest_template;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/orders-rest-template")
public class OrderController {

//	@Autowired // this one also works but going with construction injection;
//	private  RestController restController;

	private final RestTemplate restTemplate;

	public OrderController(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	@GetMapping("/message")
	@CircuitBreaker(name = "user-microservice", fallbackMethod = "fallBackUserMicroService")
	public String getMessage() {
		System.out.println("+++++OrderController++++");
		String userAPIResponse = restTemplate.getForObject("http://USER-MICROSERVICE/users/message", String.class);
		ResponseEntity<String> userAPIRes = restTemplate.getForEntity("http://USER-MICROSERVICE/users/message", String.class);
		System.out.println("++++++++++++++"+userAPIRes.getBody());
		return "Hi Vijay, your order is ready and " + userAPIRes.getBody() ;
		
		
		
		
	}
	
	public String fallBackUserMicroService(Throwable throwable) {
		return "user-microservice is down from fallback message";
	}

}
