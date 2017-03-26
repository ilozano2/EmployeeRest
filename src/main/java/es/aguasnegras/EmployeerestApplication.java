package es.aguasnegras;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeerestApplication {

    private static Logger logger = Logger.getLogger(EmployeerestApplication.class);

    public static void main(String[] args) {
		SpringApplication.run(EmployeerestApplication.class, args);
		logger.info("App init");
	}
}
