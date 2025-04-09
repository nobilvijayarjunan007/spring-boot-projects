package vijay.learning.springboot.microservice.order_microservice_feign_client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;


@FeignClient(name = "user-microservice")
public interface UserServiceClient {
	@GetMapping("/users/message")
	String getMessageFromUserMicroService();

}
