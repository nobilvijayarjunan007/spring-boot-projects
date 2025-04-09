package vijay.learning.springboot.microservice.order_microservice_webclient.builder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders-microservice-webclient-builder")
public class Controller {
	
	private final WebClient.Builder builder;

	public Controller(Builder builder) {
		this.builder = builder;
	}
	
	@GetMapping("/message")
	public String webClientBuilder() {
		String responseWithBlock = builder.build()
		.get()
		.uri("https://user-microservice/users/message")
		.retrieve()
		.bodyToMono(String.class)
		.block();// if use block
		
		Mono<String> monoString = builder.build()
				.get()
				.uri("https://user-microservice/users/message")
				.retrieve()
				.bodyToMono(String.class)
				.map( (response) -> ""+ response);
		
		return "Hello From WebClient.Builder and "+responseWithBlock;
		
	}
	

}
