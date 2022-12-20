package tn.yassin.spring.repository;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.yassin.spring.entities.joueur;
import tn.yassin.spring.entities.rolejoueur;

@Repository
public interface rolejoueurrepository  extends CrudRepository<rolejoueur, Integer>{

	
	
	
	@Query(value="select * from joueur  j join rolejoueur rj on j.idjoueur=rj.idjoueur where idrolej=?1 ",nativeQuery= true)
	joueur findjoueurbyidrolejsaisi(Integer idrolej) ;


	

	
}
