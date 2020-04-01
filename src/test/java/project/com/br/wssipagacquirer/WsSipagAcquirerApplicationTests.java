package project.com.br.wssipagacquirer;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;

import br.com.project.wssipagacquirer.WsSipagAcquirerApplication;
import br.com.project.wssipagacquirer.controller.CommerceController;
import br.com.project.wssipagacquirer.dto.AdressDto;
import br.com.project.wssipagacquirer.dto.CommerceDto;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = WsSipagAcquirerApplication.class)
class WsSipagAcquirerApplicationTests {
	
	private static final String URL_CREATE_COMMERCE = "create-commerce";
	
	@LocalServerPort
	private int port;

	private URL base;

	@Autowired
	private TestRestTemplate template;

	@Autowired
	CommerceController commerceCt;
	
	@Before
	public void setUp() throws Exception {
		base = new URL("http://localhost:" + port + "/");
	}
		
	@Test
	void contextLoads() {
	}
	
	@Test
	public void createCommerce() {
		
		ResponseEntity<CommerceDto> response = template.postForEntity(base.toString() + URL_CREATE_COMMERCE, getCommerceDto(), CommerceDto.class);
		Assert.assertEquals(HttpStatus.OK, response.getStatusCodeValue());
		
		
	}

	
	public String getCommerce() {
		
		CommerceDto commerce = new CommerceDto();
		commerce.setNameCommerce("Cafeteria");
		commerce.setCnpj(123456789);
		
		List<String> email = new ArrayList<String>();
		email.add("cafeteria@gmail");
		commerce.setEmail(email);
		
		List<String> fones = new ArrayList<String>();
		fones.add("6199876543");
		fones.add("6234562415");
		commerce.setFones(fones);
		
		AdressDto adress = new AdressDto();
		adress.setCity("Taguatinga");
		adress.setComplement("Edificio");
		adress.setDistrict("Norte");
		adress.setNumber(102);
		adress.setState("DF");
		adress.setZipCode(71110130);
		adress.setStreet("Rua");
		
		commerce.setAdress(adress);
		
		Gson gson = new Gson();
		
		return gson.toJson(commerce);
	}	
	
	public CommerceDto getCommerceDto() {
		
		CommerceDto commerce = new CommerceDto();
		commerce.setNameCommerce("Cafeteria");
		commerce.setCnpj(123456789);
		
		List<String> email = new ArrayList<String>();
		email.add("cafeteria@gmail");
		commerce.setEmail(email);
		
		List<String> fones = new ArrayList<String>();
		fones.add("6199876543");
		fones.add("6234562415");
		commerce.setFones(fones);
		
		AdressDto adress = new AdressDto();
		adress.setCity("Taguatinga");
		adress.setComplement("Edificio");
		adress.setDistrict("Norte");
		adress.setNumber(102);
		adress.setState("DF");
		adress.setZipCode(71110130);
		adress.setStreet("Rua");
		
		commerce.setAdress(adress);
		
		return commerce;
	}	
}
