package tn.yassin.spring.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import tn.yassin.spring.entities.filee;
import tn.yassin.spring.repository.fileerepository;

@Service
public class fileeservice implements ifilee {
@Autowired
fileerepository filrep;

String path="D:/MySecondWork/takwiraspace-1/src/main/java/tn/yassin/spring/img";

@Override
	public filee uploadfile(MultipartFile filee) throws  IOException {
		
		System.out.println("Original Image Byte Size - " + filee.getBytes().length);
		filee img = new filee(filee.getOriginalFilename(), filee.getContentType(),
				compressBytes(filee.getBytes()));

	 	File f = new File(path+"/"+filee.getName());
        OutputStream fl =new FileOutputStream(f);
	 	fl.close();
	 	return filrep.save(img);
	}


	   
	   
	   public static byte[] compressBytes(byte[] data) {
			Deflater deflater = new Deflater();
			deflater.setInput(data);
			deflater.finish();

			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
			byte[] buffer = new byte[1024];
			while (!deflater.finished()) {
				int count = deflater.deflate(buffer);
				outputStream.write(buffer, 0, count);
			}
			try {
				outputStream.close();
			} catch (IOException e) {
			}
			System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

			return outputStream.toByteArray();
	   }
		

		// uncompress the image bytes before returning it to the angular application
		public static byte[] decompressBytes(byte[] data) {
			Inflater inflater = new Inflater();
			inflater.setInput(data);
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);
			byte[] buffer = new byte[1024];
			try {
				while (!inflater.finished()) {
					int count = inflater.inflate(buffer);
					outputStream.write(buffer, 0, count);
				}
				outputStream.close();
			} catch (IOException ioe) {
			} catch (DataFormatException e) {
			}
			return outputStream.toByteArray();
		}
		
	   }
			
	
	
	
	
	
	
	




	
	

	
	

