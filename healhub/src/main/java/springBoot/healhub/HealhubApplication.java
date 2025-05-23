package springBoot.healhub;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("springBoot.entity") 
public class HealhubApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealhubApplication.class, args);
	}

}
