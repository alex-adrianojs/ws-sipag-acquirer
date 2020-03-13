package br.com.project.wssipagacquirer.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import br.com.project.wssipagacquirer.dto.CommerceDto;
import br.com.project.wssipagacquirer.entity.CommerceEntity;

@Service
public class CommerceMapper {

	public static CommerceDto entityToDto(CommerceEntity entity) {

		ModelMapper mapper = new ModelMapper();

		CommerceDto commerce = mapper.map(entity, CommerceDto.class);
		return commerce;

	}

	public static CommerceEntity dtoToEntity(CommerceDto commerce) {

		ModelMapper mapper = new ModelMapper();

		CommerceEntity entity = mapper.map(commerce, CommerceEntity.class);

		return entity;

	}
	
}
