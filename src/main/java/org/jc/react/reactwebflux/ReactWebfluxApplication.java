package org.jc.react.reactwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReactWebfluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ReactWebfluxApplication.class, args);
		
		GreetingWebClient gwc = new GreetingWebClient();
		System.out.println(gwc.getResult());
	}

}
