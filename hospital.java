import java.util.*;
import java.lang.String;
import java.io.*;

class Details
{
Details()
{
    System.out.print("\t\t\t\t\t ___________________________________________________________________________________________\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                            WELCOME TO E-HEALTH CARE MANAGEMENT SYSTEM                     |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                                                                           |\n");
    System.out.print("\t\t\t\t\t|                                         -Developed by                                     |\n");
    System.out.print("\t\t\t\t\t|                                                   Makhija Ashish                          |\n");
    System.out.print("\t\t\t\t\t|___________________________________________________________________________________________|\n");
}

    Scanner in =new Scanner(System.in);
    String name;
    String address;
    long contact;
    int age;
    long pid;
    String sex;
    String disease;
    

    //Login 
    void login()
    {
        int a;
        String pass;
        
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.print("\n\t\t\t\t\t\t\t\tE-HEALTH CARE MANAGEMENT SYSTEM \n");
        System.out.print("\t\t\t\t\t _______________________________________________________________________________________ \n");
        System.out.println("\n\n\t\t\t\t\t\t\t\t------------------------------");
        System.out.print("\n\t\t\t\t\t\t\t\t\t     LOGIN \n");   
        System.out.print("\t\t\t\t\t\t\t\t------------------------------\n\n");  
        System.out.print("\t\t\t\t\t\t\t\tEnter the Password: ");
        pass=in.next();
        if(pass.equals("a123"))
        {
            System.out.println("\t\t\t Access granted    \n");
            menu();
        }
        else
        {
            System.out.print("\t\t\t Access Denied!!  \n");
            System.out.print("\t\t\t 1. Try Again \n\t\t\t 2.Exit \n");
            System.out.print("\t\t\t Enter from above Options \n");
             a=in.nextInt();
            if(a==1)
            login();
            else if(a==2)
            {
            System.out.print("Exited");
            System.exit(0);
            }
            else
            {
            System.out.print("Enter correct Option \n");
            login();
            }
        }
    }
    void menu()
    {
        System.out.print("Welcome to Menu");
    }
}


public class hospital
{
public static void main (String args[])
{
    Details d=new Details();
    System.out.println("Hello World");
    d.login();
}   
}