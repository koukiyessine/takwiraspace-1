package tn.yassin.spring.service;

import java.io.IOException;

import org.springframework.web.multipart.MultipartFile;

import tn.yassin.spring.entities.filee;

public interface ifilee {

	
	
public filee uploadfile(MultipartFile filee) throws IOException;	
	
}
