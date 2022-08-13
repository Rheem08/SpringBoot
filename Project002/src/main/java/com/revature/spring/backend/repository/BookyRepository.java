package com.revature.spring.backend.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.revature.spring.backend.model.Booky;

public interface BookyRepository extends JpaRepository<Booky, Integer>{
	
	
//	@Query(value = "SELECT * FROM Booky b WHERE b.username = ?1 , b.p_word =?2", nativeQuery = true)
//	  Booky findByUsernameAndP_word(String username, String P_word);
	
	
	
	
	

}
