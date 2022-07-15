import  java.io.*;
public class Registration
{
    public static void main(String[] darsh)throws IOException
    {
        System.out.println("----- Welcome User Registration Problem-----");
        DataInputStream d = new DataInputStream(System.in);

        System.out.println("Enter your First Name :");
        String First_Name = d.readLine();

        System.out.println("Enter your Last Name :");
        String Last_Name = d.readLine();

        boolean Check_First_Name = First_Name.matches("^[A-Z]{1}[a-z]{2,}");
        boolean Check_Last_Name = Last_Name.matches("^[A-Z]{1}[a-z]{2,}");


        if(Check_First_Name == true && Check_Last_Name == true  )
        {
            System.out.println(First_Name+" "+Last_Name+ "  Is Valid First Name  Last Name Email ");
        }
        else
        {
            System.out.println(First_Name+" "+Last_Name+"  Is  Valid First Name  Last Name Email");
        }

        System.out.println("Enter your  Email Id :");
        String Email = d.readLine();
        boolean Check_Email = Email.matches("^[A-Z a-z](.+){1}[A-Za-z]*+@{1}[bl](.+)[co](.+)[in]$");

        if (Check_Email == true)
        {
            System.out.println(Email+"   Email Id is Valid");
        }
        else
        {
            System.out.println(Email+"   Email Is Not Valid");
        }

        System.out.println("Enter your Phone Number :");
        String Phone_Number = d.readLine();
        boolean Check_Phone_Number = Phone_Number.matches("^(91)\\s{1}[7-9]{1}[0-9]{9}$");

        if (Check_Phone_Number == true)
        {
            System.out.println(Phone_Number+"  Phone_Number Id is Valid");
        }
        else
        {
            System.out.println(Phone_Number+"  Phone_Number Is Not Valid");
        }

        System.out.println("Enter your PassWord :");
        String Password = d.readLine();
        boolean Check_Password = Password.matches("(?=.*?[A-Z])(?=.*?[a-z])(?=.*?[0-9]).{8,}");

        if (Check_Password == true)
        {
            System.out.println(Password+"  Password Format is Valid");
        }
        else
        {
            System.out.println(Password+" Password Format Is Not Valid");
        }

        System.out.println("Enter your Email Id :");
        String Email_Id = d.readLine();
        boolean Check_Email_Id = Password.matches("^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.com){1,}(.au)*$|^(abc)[0-9+-]*(@)[0-9a-z]{1,}(.net){1}$");

        if (Check_Email_Id == true)
        {
            System.out.println(Email_Id+"  Password Format is Valid");
        }
        else
        {
            System.out.println(Email_Id+" Password Format Is Not Valid");
        }
    }
}

