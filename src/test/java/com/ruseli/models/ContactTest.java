package com.ruseli.models;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ContactTest {
	
	
	Contact newguy = new Contact("Jason", "Russo", "www.dkdkdk.com", "dkdk@dkdk.com", ContactType.EXTERNAL_RECRUITER);

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	@DisplayName("Testing first name is present")
	void firstNameTest() {
		
		String expected = "Jason";
		assertEquals(newguy.getFirstName(), expected);
	}
	
	@Test
	@DisplayName("Testing enum works")
	void enumTest() {
		
		String expected = "EXTERNAL_RECRUITER";
		assertEquals(newguy.getType().toString(), expected);
	}

}
