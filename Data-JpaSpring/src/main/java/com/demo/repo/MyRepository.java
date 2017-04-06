package com.demo.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.jpa.Emp;
import java.lang.String;
import java.util.List;

import javax.persistence.criteria.Predicate;

import com.demo.jpa.Dept;

@Repository
public interface MyRepository extends CrudRepository<Emp,Integer> {

	@Query("select e from Emp e where e.salary >50000")
	public List<Emp> getAllEmp500();
	
   
	List<Emp> findByDept(Dept dept);
	
	
	
}
