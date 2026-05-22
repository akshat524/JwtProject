package com.Authentication.JwtProject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Authentication.JwtProject.models.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Long>{

}
