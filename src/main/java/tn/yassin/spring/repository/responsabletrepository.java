package tn.yassin.spring.repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.yassin.spring.entities.responsabledeterrain;


@Repository
public interface responsabletrepository extends CrudRepository<responsabledeterrain, Integer> {





}
