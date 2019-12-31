package com.rto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(scanBasePackages = {"com.rto"})
@EnableSwagger2
public class AtoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtoappApplication.class, args);
	}
	
	@Bean
	public Docket swaggerConfiguration() {
		
		return new Docket(DocumentationType.SWAGGER_2)
						.select()
						.paths(PathSelectors.ant("/api/*"))
						.apis(RequestHandlerSelectors.basePackage("com.rto"))
						.build()
						.apiInfo(getDetails());
		
		
	}

	private ApiInfo getDetails() {
		return new ApiInfo(
					"RTO Application API",
					"RTO API return complete vehicle details",
					"Input to this API is Vehicle Registration Number",
					"version 1.0",
					"Free to User",
					"uri:http://localhost:8181/api/vehicleNo?regnNum=",
					"Developed by R.Paripoorna Chander"
					);
		
	}
}
