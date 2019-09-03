package com.fuud.hunger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
* The Hunger application that returns a list of restaraunts based
* upon the location given.
*
* @author  Brandon Heiss
* @version 1.0
* @since   2019-09-01 
*/
@SpringBootApplication
public class HungerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HungerApplication.class, args);
	}

}
