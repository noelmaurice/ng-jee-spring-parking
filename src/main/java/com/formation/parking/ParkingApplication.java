package com.formation.parking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


/*
 * Application multi-couche :
 * La couche Contrôleur ne peut appeler que la couche Service qui ne peut appeler que la couche DAO
 */

/*
 * Annotations remplacées par @SpringBootApplication :
 * 
 * @Configuration -> ParkingApplication est une classe de configuration dans laquelle on peut définir des Bean de configuration
 * @EnableAutoConfiguration -> la configuration de l'application est appliquée : notamment Spring Boot ici au lieu de properties
 * @ComponentScan -> recherche les composants de la configuration dans les packages, composants à instancier et à injectés
 */
@SpringBootApplication
public class ParkingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkingApplication.class, args);
	}

	@Bean 
	RestTemplate restTemplate(RestTemplateBuilder builder)
	{
		return builder.build();
	}
}
