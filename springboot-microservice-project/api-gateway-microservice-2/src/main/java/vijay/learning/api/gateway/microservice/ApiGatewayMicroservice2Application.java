package vijay.learning.api.gateway.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayMicroservice2Application {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayMicroservice2Application.class, args);
	}

}
