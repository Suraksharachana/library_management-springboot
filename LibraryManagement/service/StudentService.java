package com.bootproject.LibraryManagement.service;

import org.apache.tomcat.util.http.fileupload.impl.FileUploadIOException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.bootproject.LibraryManagement.dto.Student;

@Service
public class StudentService 
{
	public String signup(Student student,String date,MultipartFile pic) throws IOException
	{
		student.setDob(LocalDate.parse(date));
		byte[] picture=new byte[pic.getInputStream().available()];
		pic.getInputStream().read(picture);
		student.setPicture(picture);
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String token=encoder.encode(stduent.getName());
		student.setToken(token);
		return null;
	}
  
}
