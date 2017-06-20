package com.epam.tolstolutskyi.task9.registration;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

import com.epam.tolstolutskyi.task9.servlet.bean.UserRegistrationBean;
import com.epam.tolstolutskyi.task9.validation.Validator;

public class RegistrationTest {

	@Test
	public void testRegistrationWithIncorrectName() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("wrong name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("name"));
		errors.clear();
		
		bean.setName("");
		errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("name"));
	}
	
	@Test
	public void testRegistrationWithIncorrectCompanyName() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("wrong company name");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("companyName"));
		errors.clear();
		
		bean.setCompanyName("");
		errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("companyName"));
	}
	
	@Test
	public void testRegistrationWithIncorrectEmail() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("wrong email");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("email"));
		errors.clear();
		
		bean.setEmail("");
		errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("email"));
	}
	
	@Test
	public void testRegistrationWithIncorrectPassword() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("too short");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("password"));
		errors.clear();
		
		bean.setPassword("");
		errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("password"));
	}
	
	@Test
	public void testRegistrationWithIncorrectAddress() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("wrong address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("address"));
		errors.clear();
		
		bean.setAddress(null);
		errors = Validator.validate(bean);
		assertEquals(false, errors.containsKey("address"));
	}
	
	@Test
	public void testRegistrationWithIncorrectCountry() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("wrong country");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("country"));
		errors.clear();
		
		bean.setCountry("");
		errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("country"));
	}
	
	@Test
	public void testRegistrationWithIncorrectCity() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("wrong city");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("city"));
		errors.clear();
		
		bean.setCity(null);
		errors = Validator.validate(bean);
		assertEquals(false, errors.containsKey("city"));
	}
	
	@Test
	public void testRegistrationWithIncorrectNumCode() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("wrong num code");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("numCode"));
		errors.clear();
		
		bean.setNumCode(null);
		errors = Validator.validate(bean);
		assertEquals(false, errors.containsKey("numCode"));
	}
	
	@Test
	public void testRegistrationWithIncorrectPhoneNumber() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("wrong phone number");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.containsKey("phoneNumber"));
		errors.clear();
		
		bean.setPhoneNumber(null);
		errors = Validator.validate(bean);
		assertEquals(false, errors.containsKey("phoneNumber"));
	}
	
	@Test
	public void testRegistrationWithAllCorrectFields() throws IllegalArgumentException, IllegalAccessException, InstantiationException {
		UserRegistrationBean bean = new UserRegistrationBean();
		bean.setName("Name");
		bean.setCompanyName("Company");
		bean.setEmail("izhenya7@gmail.com");
		bean.setPassword("dfhgjhfdgjgfdfg");
		bean.setAddress("Address");
		bean.setCountry("UK");
		bean.setCity("City");
		bean.setNumCode("380");
		bean.setPhoneNumber("660001213");
		
		Map<String, String> errors = Validator.validate(bean);
		assertEquals(true, errors.isEmpty());
	}

}
