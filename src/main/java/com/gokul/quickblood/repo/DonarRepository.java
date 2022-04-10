package com.gokul.quickblood.repo;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokul.quickblood.model.Donar;

public interface DonarRepository extends JpaRepository<Donar, Long> {


	List<Donar> findAllByBloodgroupAndLocation(String bloodgroup, String location);

	

	

}
