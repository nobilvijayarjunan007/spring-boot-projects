package vijay.learning.springboot.microservice.order_microservice_feign_client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMicroserviceFeignClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMicroserviceFeignClientApplication.class, args);
	}

}
