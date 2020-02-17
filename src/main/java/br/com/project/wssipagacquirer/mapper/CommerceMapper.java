package br.com.project.wssipagacquirer.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.project.wssipagacquirer.dto.Commerce;
import br.com.project.wssipagacquirer.entity.CommerceEntity;

@Service
public class CommerceMapper {

	public static Commerce entityToDto(CommerceEntity entity) {

		ModelMapper mapper = new ModelMapper();

		Commerce commerce = mapper.map(entity, Commerce.class);
		return commerce;

	}

	public static CommerceEntity dtoToEntity(Commerce commerce) {

		ModelMapper mapper = new ModelMapper();

		CommerceEntity entity = mapper.map(commerce, CommerceEntity.class);

		return entity;

	}
	
}
