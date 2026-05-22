package com.Authentication.JwtProject.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.lang.RuntimeException;

import com.Authentication.JwtProject.models.College;
import com.Authentication.JwtProject.models.Student;
import com.Authentication.JwtProject.repositories.CollegeRepository;
import com.Authentication.JwtProject.repositories.StudentRepository;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

	@Autowired
	private StudentRepository stu_repo;
	
	@Autowired
	private CollegeRepository col_repo;
	
	@PostMapping("/save/{id}")
	public void saveStudent(@RequestBody Student stu, @PathVariable Long id) {

	    College col = col_repo.findById(id)
	            .orElseThrow(() -> new RuntimeException("College not Found"));

	    stu.setCollege(col);

	    stu_repo.save(stu);
	}
	
	@GetMapping("/getcolleges")
	public List<Student> getAllStudent(){
		return stu_repo.findAll();
	}
		
	@GetMapping("/{id}/college")
	public College getCollegeByStudentId(@PathVariable Long id) {
		    Student stu = stu_repo.findById(id)
		            .orElseThrow(() -> new RuntimeException("Student not found"));
		    return stu.getCollege();
			
		
	}
}

