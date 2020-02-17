package br.com.project.wssipagacquirer.service;

import org.springframework.stereotype.Service;

import br.com.project.wssipagacquirer.dto.Commerce;
import br.com.project.wssipagacquirer.entity.CommerceEntity;

@Service
public class CommerceService {
	
	public CommerceEntity setCommerceUpdade(CommerceEntity record, Commerce commerce) {
		
		record.setId(commerce.getId());
		record.setNameCommerce(commerce.getNameCommerce());
		record.setEmail(commerce.getEmail());
		record.setCnpj(commerce.getCnpj());
		record.setFone(commerce.getFone());
		record.setZipCode(commerce.getZipCode());
		record.setStreet(commerce.getStreet());
		record.setDistrict(commerce.getDistrict());
		record.setCity(commerce.getCity());
		record.setState(commerce.getState());
		record.setNumber(commerce.getNumber());
		record.setComplement(commerce.getComplement());
		
		return record;
		
	} 

}
