package vijay.learning.springboot.microservice.order_microservice_rest_template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class OrderMicroserviceRestTemplateApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderMicroserviceRestTemplateApplication.class, args);
	}
	
//	@Bean // this one also work without AppConfig class.
//	public RestTemplate restTemplate() {
//		return new RestTemplate();
//	}

}
