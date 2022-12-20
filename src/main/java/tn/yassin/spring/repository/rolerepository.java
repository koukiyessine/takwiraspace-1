package tn.yassin.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.yassin.spring.entities.role;
@Repository
public interface rolerepository  extends CrudRepository<role, Long>{
	

}
