package br.com.project.wssipagacquirer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.project.wssipagacquirer.dto.Commerce;
import br.com.project.wssipagacquirer.entity.CommerceEntity;

@Repository
public interface CommerceRepository extends JpaRepository<CommerceEntity, Integer> {

}
