package br.com.project.wssipagacquirer.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.project.wssipagacquirer.dto.Commerce;
import br.com.project.wssipagacquirer.entity.CommerceEntity;
import br.com.project.wssipagacquirer.mapper.CommerceMapper;
import br.com.project.wssipagacquirer.repository.CommerceRepository;
import br.com.project.wssipagacquirer.service.CommerceService;

@RestController
@RequestMapping("/")
public class CommerceController {

	@Autowired
	CommerceRepository commerceRp;

	@Autowired
	CommerceService commerceSv;

	@GetMapping("commerces")
	public List getAllCommerces() {
		return commerceRp.findAll();
	}

	@GetMapping("commerce/{id}")
	public ResponseEntity<Commerce> getCommerceById(@PathVariable(value = "id") Integer commerceId) {

		return commerceRp.findById(commerceId)
				.map(record -> ResponseEntity.ok().body(CommerceMapper.entityToDto(record)))
				.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping("create-commerce")
	public ResponseEntity<Commerce> createCommerce(@RequestBody Commerce commerce) {

		CommerceEntity entity = CommerceMapper.dtoToEntity(commerce);

		commerceRp.save(entity);

		return ResponseEntity.ok().body(commerce);
	}

	@PutMapping(value = "update-commerce")
	public ResponseEntity<Commerce> updateCommerce(@RequestBody Commerce commerce) {

		return commerceRp.findById(commerce.getId()).map(record -> {
			commerceRp.save(commerceSv.setCommerceUpdade(record, commerce));
			return ResponseEntity.ok().body(CommerceMapper.entityToDto(record));
		}

		).orElse(ResponseEntity.notFound().build());

	}

	@DeleteMapping(value = "delete-commerce/{id}")
	public ResponseEntity<Commerce> deleteCommerce(@PathVariable(value = "id") Integer commerceId) {

		return commerceRp.findById(commerceId).map(record -> {
			commerceRp.deleteById(record.getId());
			;
			return ResponseEntity.ok().body(CommerceMapper.entityToDto(record));
		}

		).orElse(ResponseEntity.notFound().build());

	}

}
