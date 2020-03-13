package br.com.project.wssipagacquirer.util;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import br.com.project.wssipagacquirer.dto.AdressDto;
import br.com.project.wssipagacquirer.dto.CommerceDto;

public class Test {

	 public static void main(String[] args) {
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
		
		System.out.println(gson.toJson(commerce));
	}
}
