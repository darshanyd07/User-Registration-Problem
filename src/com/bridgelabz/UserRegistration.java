package com.bridgelabz;
import java.util.regex.Pattern;

public class UserRegistration
{
    private static final String NAME = "^[A-Z]{1}[a-z]{2,}$";
    private static final String EMAIL = "^(abc)[.0-9+-]*(@)[0-9a-z]{1,}(.com){1,}(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.net){1}$";
    private static final String PHONE_NUMBER = "^(91)[\\s]{1}[1-9]{1}[0-9]{9}$";
    private static final String PASSWORD = "^(?=.*[A-Z])(?=.*[a-z])(?=[^!@#$%^&+=]*[!@#$%^&+=][^!@#$%^&+=]*$)(?=.*[0-9]).{8,}$";

    public UserRegistrationInterface firstNameValidate = fName ->
    {
        boolean result = Pattern.matches(NAME, fName);
        if (result)
        {
            return result;
        } else
        {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_FIRST_NAME,
                    "Invalid Firsrt Name");
        }
    };

    public UserRegistrationInterface lastNameValidate = lName ->
    {
        boolean result = Pattern.matches(NAME, lName);
        if (result)
        {
            return result;
        } else
        {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_LAST_NAME,
                    "Invalid Last Name");
        }
    };

    public UserRegistrationInterface emailValidate = email ->
    {
        boolean result = Pattern.matches(EMAIL, email);
        if (result)
        {
            return result;
        } else
        {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_EMAIL, "Invalid Email");
        }
    };

    public UserRegistrationInterface phoneNumberValidate = phNum ->
    {
        boolean result = Pattern.matches(PHONE_NUMBER, phNum);
        if (result)
        {
            return result;
        }
        else
        {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PHONE_NUMBER,
                    "Invalid Phone Number");
        }
    };

    public UserRegistrationInterface passwordValidate = pw ->
    {
        boolean result = Pattern.matches(PASSWORD, pw);
        if (result)
        {
            return result;
        } else
        {
            throw new InvalidUserInputException(InvalidUserInputException.ExceptionType.INVALID_PASSWORD,
                    "Invalid Password");
        }
    };
}