package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest
{
    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue()
    {
        try
        {
            boolean result = userRegistration.firstNameValidate.userEntries("Darshan");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }


    @Test
    public void givenLastName_whenProper_ShouldReturnTrue()
    {
        try
        {
            boolean result = userRegistration.lastNameValidate.userEntries("Mhatre");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }



    @Test
    public void givenEmail_whenProper_ShouldReturnTrue()
    {
        try
        {
            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.co.in");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void givenEmail_whenNotProper_ShouldReturnFalse()
    {
        try
        {
            boolean result = userRegistration.emailValidate.userEntries("abc.xyz@bl.in");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenProper_ShouldReturnTrue()
    {
        try
        {
            boolean result = userRegistration.phoneNumberValidate.userEntries("91 9863632323");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void givenPhone_whenNotProper_ShouldReturnFalse()
    {
        try
        {
            boolean result = userRegistration.phoneNumberValidate.userEntries("9123723");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenProper_ShouldReturnTrue()
    {
        try {
            boolean result = userRegistration.passwordValidate.userEntries("Darsh@8520");
            Assert.assertTrue(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }

    @Test
    public void givenPassword_whenNotProper_ShouldReturnFalse()
    {
        try
        {
            boolean result = userRegistration.passwordValidate.userEntries("Dar231#%");
            Assert.assertFalse(result);
        } catch (InvalidUserInputException e)
        {
            System.out.println(e);
        }
    }
}