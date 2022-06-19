package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import userregistration.UserRegistration;

public class UserTests {
    @Test
    public void testValidName_Happy() {
        boolean validUserName = UserRegistration.isValidUserName();
        Assertions.assertTrue(validUserName);
    }

    @Test
    public void testValidName_Sad() {
        boolean inValidUserName = UserRegistration.isInValidUserName();
        Assertions.assertFalse(inValidUserName);
        System.out.println("Error :Enter the First name starts with Cap and has minimum 3 characters");

    }

    @Test
    public void testValidLastName_Happy() {
        boolean validUserLastName = UserRegistration.isValidUserLastName();
        Assertions.assertTrue(validUserLastName);
    }

    @Test
    public void testValidLastName_Sad() {
        boolean inValidUserLastName = UserRegistration.isInValidUserLastName();
        Assertions.assertFalse(inValidUserLastName);
        System.out.println("Error :Enter the Last name starts with Cap and has minimum 3 characters");
    }

    @Test
    public void testValidEmail_Happy() {
        boolean validUserEmail = UserRegistration.isValidUserEmail();
        Assertions.assertTrue(validUserEmail);
    }

    @Test
    public void testValidEmail_Sad() {
        boolean inValidUserEmail = UserRegistration.isInValidUserEmail();
        Assertions.assertFalse(inValidUserEmail);
        System.out.println("Error : Email has 3 mandatory parts (abc, bl & co) "
                + "and 2 optional (xyz & in) with " + "precise @ and . positions");
    }

    @Test
    public void testValidMobileNumber_Happy() {
        boolean validUserMobileNumber = UserRegistration.isValidUserMobileNumber();
        Assertions.assertTrue(validUserMobileNumber);
    }

    @Test
    public void testValidMobileNumber_Sad() {
        boolean inValidUserMobileNumber = UserRegistration.isInValidUserMobileNumber();
        Assertions.assertFalse(inValidUserMobileNumber);
        System.out.println("Error:Enter the Mobile Number with Country code follow 10 digit number");
    }

    @Test
    public void testValidPassword_Happy() {
        boolean validPassword = UserRegistration.isValidPassword();
       Assertions.assertTrue(validPassword);
    }

    @Test
    public void testValidPassword_Sad() {
        boolean inValidPassword = UserRegistration.isInValidPassword();
        Assertions.assertFalse(inValidPassword);
        System.out.println("Enter password \n" + "Hint: minimum 8 Characters, Should have at least 1 Upper Case\n"+
                "Should have at least 1 numeric number in the password, Has exactly 1 Special Character");
    }
}
