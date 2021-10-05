import java.io.*;
import java.util.Scanner;


class Authenticate
{
String name,pass;
void read()throws UserException
{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the username: ");
	name = s.nextLine();
	System.out.println("Enter the password: ");
	pass = s.nextLine();
	if(!name.equals("user") && !pass.equals("user"))throw new UserException();
	else if(name.equals("user") && !pass.equals("user"))throw new UserException();
	else if(!name.equals("user") && pass.equals("user"))throw new UserException();
	else
	{
		System.out.println("SUCCESSFULLY AUTHENTICATED :)");
	}
}
public static void main(String args[])
{
	Authenticate obj1=new Authenticate();
	try
	{
		obj1.read();
    }
	catch(UserException u)
	{
		u.show();
	}
}
}

class UserException extends Exception
{
void show()
  {
     System.out.println("Authentication Failed");
  }
}
