package tn.yassin.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.yassin.spring.entities.role;
import tn.yassin.spring.repository.rolerepository;

@Service
public class servicerole implements irole{

	
	@Autowired
	rolerepository rol;
	@Override
	public role addrole(role rl) {
		// TODO Auto-generated method stub
		return rol.save(rl) ;
	}

	
	
}
