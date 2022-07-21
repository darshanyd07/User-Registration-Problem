package com.bridgelabz;

import java.util.Scanner;
public class Registration
{

    public boolean firstName(String name)
    {
        String firstName = "^[A-Z]{1}[A-Za-z]{2,}$";
        if (name.matches(firstName))
        {
            return true;
        }
        return false;
    }

    public static boolean lastName(String lastName)
    {
        String LastName = "[A-Z]{1}[a-z]{3}";
        if(lastName.matches(lastName))
        {
            return true;
        }
        return false;
    }

    public static boolean emailId(String emailId)
    {
        String pattern= "^(abc)[.]{1}[A-Za-z]*[@]{1}(bl.co)(.in)*$";
        if(emailId.matches(pattern))
        {
            return true;
        }
        return false;
    }

    public static boolean mobileNumber(String mobileNumber)
    {
        String mobileNo = "^(91)\\s{1}[7-9]{1}[0-9]{9}$";
        if (mobileNumber.matches(mobileNo))
        {
            return true;
        }
        return false;
    }

    public static boolean password(String password)
    {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        if(password.matches(pattern))
        {
            return true;
        }
        return false;
    }
}