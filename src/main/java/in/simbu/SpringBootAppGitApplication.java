package in.simbu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.simbu.beans.Car;

@SpringBootApplication
public class SpringBootAppGitApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootAppGitApplication.class, args);
		context.getBean(Car.class);
		int a =50;
		
	}

}
