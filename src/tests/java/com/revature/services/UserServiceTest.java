package com.revature.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

import java.util.Optional;

import javax.management.relation.Role;

import com.revature.exceptions.NewUserHasNonZeroIdException;
import com.revature.exceptions.RegistrationUnsuccessfulException;
import com.revature.repositories.UserDAO;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.models.Users;
import com.revature.repositories.UserDAO;

public class UserServiceTest {

	    private static UserService userService;
	    private static UserDAO userDAO;

	    private Users GENERIC_User_1;


	    @BeforeClass
	    public static void setUpBeforeClass() throws Exception {
	        userService = new UserService();
	        userDAO = mock(UserDAO.class);
	    }

	    @Before
	    public void setUp() throws Exception {
	        GENERIC_User_1 = new Users(1, "genericUser1", "genericPassword", Role.Users);
	    }

	    @Test
	    public void testGetByUsernamePassesWhenUsernameExists() {
	        when(userDAO.getByUsername(anyString())).thenReturn(Optional.of(GENERIC_User_1));

	      assertEquals(Optional.of(GENERIC_User_1), userService.getUserById(GENERIC_User_1.getUsername()));

	        verify(userDAO).getByUsername(GENERIC_User_1.getUsername());
	    }
	}
}