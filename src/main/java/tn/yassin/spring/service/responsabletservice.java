package tn.yassin.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.yassin.spring.entities.responsabledeterrain;
import tn.yassin.spring.repository.responsabletrepository;


@Service
public class responsabletservice implements ireponsabledeterrain {

	
	@Autowired
	responsabletrepository rtr;
	
	@Override
	public responsabledeterrain addrespontr(responsabledeterrain rdt) {
		// TODO Auto-generated method stub
		return  rtr.save(rdt);
	}

	
	
	
}
