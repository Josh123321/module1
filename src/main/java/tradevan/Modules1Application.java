package tradevan;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.practice")
public class Modules1Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Modules1Application.class);
		app.setDefaultProperties(Collections.singletonMap("server.port", "5555"));
		app.run(args);
	}

}
