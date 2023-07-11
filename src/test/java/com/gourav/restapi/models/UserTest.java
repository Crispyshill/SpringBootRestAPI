package com.gourav.restapi.models;

import static org.junit.Assert.*;
import org.bson.types.ObjectId;
import org.junit.Test;

public class UserTest {
	
	User user = new User();
	
	@Test
	public void testSetId(){
		user.setId("myTestId");
		assertTrue(user.getId().equals("myTestId"));
	}
	
	@Test
	public void testSetUsername(){
		user.setUsername("user1");
		assertTrue(user.getUsername().equals("user1"));
	}
	
	@Test
	public void testSetEmail(){
		user.setEmail("test@testing.com");
		assertTrue(user.getEmail().equals("test@testing.com"));
	}
	
	@Test
	public void testSetPassword(){
		user.setPassword("mySecret");
		assertTrue(user.getPassword().equals("mySecret"));
	}
}
