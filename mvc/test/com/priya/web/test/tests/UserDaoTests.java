package com.priya.web.test.tests;

import static org.junit.Assert.*;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.priya.web.dao.User;
import com.priya.web.dao.UsersDao;

@ActiveProfiles("dev")
@ContextConfiguration(locations = { "classpath:com/priya/web/beans/beans.xml",
		"classpath:com/priya/web/beans/beans-security.xml",
		"classpath:com/priya/web/test/config/beans.xml" })

@RunWith(SpringJUnit4ClassRunner.class)
public class UserDaoTests {
	
	@Autowired
	private UsersDao usersDao;
	
	@Autowired
	private DataSource dataSource;
	
	@Before
	public void init(){
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.execute("delete from user");
		jdbcTemplate.execute("delete from authorities");
	}
	
	@Test
	public void testCreateUser(){
		User user = new User("priyaks24","Priya@123","priya@gmail.com",true,"user");
		assertTrue("User creation should return true",usersDao.create(user));
		
		List<User> users = usersDao.getAllUsers();
		assertEquals("Number of users should be 1",1,users.size());
		
		assertTrue("User should exist", usersDao.exists(user.getUsername()));
		
		assertEquals("Created user should be identical to the retrieved user", user, users.get(0));
	}
}
