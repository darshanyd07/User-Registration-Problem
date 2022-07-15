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

        boolean Check_First_Name = First_Name.matches("[A-Z]{1}[a-z]{2,}");
        boolean Check_Last_Name = Last_Name.matches("[A-Z]{1}[a-z]{2,}");
        if(Check_First_Name == true && Check_Last_Name == true)
        {
            System.out.println(First_Name+" "+Last_Name+ "  Is Valid First Name And Last Name ");
        }
        else
        {
            System.out.println(First_Name+" "+Last_Name+"  Is Not Valid First Name");
        }
    }
}

