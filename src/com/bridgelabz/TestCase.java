package com.bridgelabz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCase
{

    Registration ur = new Registration();

    @Test
    void testFirstName()
    {
        assertTrue(ur.firstName("Darshan"));
    }

    @Test
    void testLastName()
    {
        assertTrue(ur.lastName("Mhatre"));
    }

    @Test
    void testEmailID()
    {
        assertTrue(ur.emailId("abc.dar@bl.co.in"));
    }

    @Test
    void testMobileNumber()
    {
        assertTrue(ur.mobileNumber("91 7517691977"));
    }

    @Test
    void testPassword()
    {
        assertTrue(ur.password("Darshan@07"));
    }

}