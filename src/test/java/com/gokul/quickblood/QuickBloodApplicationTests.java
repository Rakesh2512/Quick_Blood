package com.gokul.quickblood;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.gokul.quickblood.Controller.DonarRestController;
import com.gokul.quickblood.model.Donar;
import com.gokul.quickblood.repo.DonarRepository;


@SpringBootTest
class QuickBloodApplicationTests {
	
	@Autowired
	private DonarRestController controller;
	
	@Autowired
	private DonarRepository repo;

	@Test
	void contextLoads() {
		
	}
	
	//@Test
//	public void getAllDonarsTest() {
//		assertTrue(getAllDonars(null));
//	}
	
	@Test
	public void saveDonarTest() {
		Donar donar = new Donar(5,"Gaurav",22,"B+","Noida","678798765");
		when(repo.save(donar)).thenReturn(donar);
		assertEquals(donar,controller.getAllDonars());
	}

}
