package com.Authentication.JwtProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Authentication.JwtProject.models.Student;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findByCollegeId(Long c_id);

}
