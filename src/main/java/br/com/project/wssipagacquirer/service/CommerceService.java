package br.com.project.wssipagacquirer.service;

import org.springframework.stereotype.Service;

import br.com.project.wssipagacquirer.dto.CommerceDto;
import br.com.project.wssipagacquirer.entity.CommerceEntity;

@Service
public class CommerceService {
	
	public CommerceEntity setCommerceUpdade(CommerceEntity record, CommerceDto commerce) {
		
		/*
		 * record.setId(commerce.getId());
		 * record.setNameCommerce(commerce.getNameCommerce());
		 * record.setEmail(commerce.getEmail()); record.setCnpj(commerce.getCnpj());
		 * record.setFone(commerce.getFone());
		 */
			
		return record;
		
	} 

}
