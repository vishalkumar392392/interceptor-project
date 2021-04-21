package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.dto.Customer;

@Repository
public interface InterceptorRepository extends JpaRepository<Customer, Integer> {

//	@Query(value = "select * from customer c where c.email=:email", nativeQuery = true)
//	List<Customer> getCustomerByEmail(@Param("email") String email);
	Customer findByEmail(@Param("email") String email);

}
