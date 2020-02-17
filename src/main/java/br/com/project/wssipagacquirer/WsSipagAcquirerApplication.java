package br.com.project.wssipagacquirer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = {"br.com.project.wssipagacquirer","br.com.project.wssipagacquirer.mapper" })
public class WsSipagAcquirerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WsSipagAcquirerApplication.class, args);
	}

}
