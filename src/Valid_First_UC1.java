import  java.io.*;
public class Valid_First_UC1
{
    public static void main(String[] darsh)throws IOException
    {
        System.out.println("----- Welcome User Registration Problem-----");
        DataInputStream d = new DataInputStream(System.in);
        System.out.println("Enter your first name :");
        String First_Name = d.readLine();
        boolean Check_First_Name = First_Name.matches("[A-Z]{1}[a-z]{2,}");
        if(Check_First_Name == true)
        {
            System.out.println(First_Name+"  Is Valid First Name");
        }
        else
        {
            System.out.println(First_Name+"  Is Not Valid First Name");
        }
    }
}

