package com.gokul.quickblood.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gokul.quickblood.model.Donar;

public interface DonarRepository extends JpaRepository<Donar, Long> {

	Donar findByGroup(String group);

}
