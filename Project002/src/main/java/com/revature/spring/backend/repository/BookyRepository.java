package com.revature.spring.backend.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.revature.spring.backend.model.Booky;

public interface BookyRepository extends JpaRepository<Booky, Integer>{
	
	//@Query("SELECT username, p_word FROM Booky b WHERE b.id=14")
	//public Optional<Booky> findByBId();
	@Query(value = "SELECT * FROM Booky b WHERE b.username = ?1", nativeQuery = true)
	  Booky findByEmailAddress(String username);
	
	
	

}
