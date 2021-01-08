package com.esprit.microservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@EnableDiscoveryClient
public class PubliciteApplication {

	public static void main(String[] args) {
		SpringApplication.run(PubliciteApplication.class, args);
	}

	
	@Autowired
	private PubliciteRepository repository;
	
	@Bean
	ApplicationRunner init() {
		return (args) -> {
			// save			
			/*repository.save(new Publicite(1 ,"Marfvdiem", "Ch", "a.jpg", "3-05-2011", "3-02-2012"));
			repository.save(new Publicite( 2 , "Sarra", "ab", "dfv.jpg", "3-05-2015", "3-02-2020"));
			repository.save(new Publicite(3 ,  "Mohamed", "ba", "mon.jpg", "3-05-2019", "3-02-2021"));
			// fetch
			
			repository.findAll().forEach(System.out::println);
*/
		};
	}
	
	
}


















	
	


