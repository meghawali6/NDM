package com.smithsnews.ndm.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@EnableDiscoveryClient
@SpringBootApplication
//@EnableAutoConfiguration(exclude = DataSourceAutoConfiguration.class)
public class ManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManagementServiceApplication.class, args);
	}
	
	 @Bean
	  public OpenAPI ndmManagementAPI() {
	    return new OpenAPI().info(new Info().title("NDM").description(" National Distribution Monitor")
	        .version("v0.0.1").license(new License().name("SmithsNews").url("https://www.ctepl.com/")));
	  }

}
