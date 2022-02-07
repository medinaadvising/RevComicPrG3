package com.revature.services;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

import java.util.Optional;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.exceptions.NewUserHasNonZeroIdException;
import com.revature.exceptions.RegistrationUnsuccessfulException;
import com.revature.exceptions.UsernameNotUniqueException;
import com.revature.models.Users;
import com.revature.repositories.UserDAO;

public class AuthServiceTest {
	
	private static AuthService authService;
	private static UserService userService;
	private static UserDAO userDAO;
	
	
	private Users USER_TO_REGISTER;
	private Users GENERIC_User_1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		authService = new AuthService();
		userService = mock(UserService.class);
		userDAO = mock(UserDAO.class);
	}
	
    public Optional<Users> exampleRetrieveCurrentUser() {
        return Optional.empty();
    }
	@Before
	public void setUp() throws Exception {
	
		GENERIC_User_1 = new Users(1, "genericUser1", "genericPassword", userRole.Users);
		
		public void testRegisterFailsWhenUsernameIsTaken() {
			when(userService.getByUsername(anyString())).thenReturn(Optional.of(GENERIC_User_1));
			
			assertThrows(UsernameNotUniqueException.class,
				() -> authService.register(USER_TO_REGISTER)
			);

			verify(userService).getByUsername(USER_TO_REGISTER.getUsername());
			verify(userDAO, never()).create(USER_TO_REGISTER);
		}
		
		@Test
		public void testRegisterPassesWhenUsernameIsNotTaken() {
			when(userService.getByUsername(anyString())).thenReturn(Optional.empty());
			when(userDAO.create(anyObject())).thenReturn(GENERIC_User_1);
			
			assertEquals(GENERIC_User_1, authService.register(USER_TO_REGISTER));

			verify(userService).getByUsername(USER_TO_REGISTER.getUsername());
			verify(userDAO).create(USER_TO_REGISTER);
		}
		
		@Test
		public void testRegisterFailsWhenRegistrationIsUnsuccessful1() {
			when(userDAO.create(anyObject())).thenThrow(new RegistrationUnsuccessfulException());

			assertThrows(RegistrationUnsuccessfulException.class,
					() -> authService.register(USER_TO_REGISTER)
					);
		}
		@Test
		public void testRegisterFailsWhenRegistrationIsUnsuccessful() {
			when(userDAO.create(anyObject())).thenThrow(new RegistrationUnsuccessfulException());

			assertThrows(RegistrationUnsuccessfulException.class,
					() -> authService.register(USER_TO_REGISTER)
			);
		}

		@Test
		public void testRegisterFailsWhenIdIsNonZero() {
			USER_TO_REGISTER.setId(1000);

			assertThrows(NewUserHasNonZeroIdException.class,
					() -> authService.register(USER_TO_REGISTER)
			);
		}
	@Test
	public void testLoginPassesWhenUsernameDoesExistAndPasswordMatches() {
		when(UserService.getUserById(anyString())).thenReturn(Optional.of(GENERIC_User_1));
	
		assertEquals(GENERIC_User_1, authService.login(GENERIC_User_1.getUsername(),GENERIC_User_1.getPassword()));
	}
	
	
	

}
