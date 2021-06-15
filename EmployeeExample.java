import java.io.*;
class Employee
{
String eName;
int eNo,eSalary;

	void read() throws IOException
	{
	  
	      DataInputStream dp = new DataInputStream(System.in);
		  System.out.println("Enter the Employee Number");
          eNo = Integer.parseInt(dp.readLine());
          System.out.println("Enter the Employee Name");
          eName = dp.readLine();
	      System.out.println("Enter the Employee Salary");
          eSalary = Integer.parseInt(dp.readLine());
	}
	
	void display()
	{
		System.out.println("Employee Name = "+eName);
		System.out.println("Employee Number = "+eNo);
		System.out.println("Employee Salary = "+eSalary);
	
	}
}
class EmployeeExample
{
public static void main(String args[])throws IOException

{
	DataInputStream dp = new DataInputStream(System.in);
	System.out.println("Enter the no of objects:");
	int n = Integer.parseInt(dp.readLine());
	Employee e[] = new Employee[n];
	for(int i=0;i<n;i++)
	{
		System.out.println("\nEMPLOYEE "+(i+1));
	    e[i] = new Employee();
	    e[i].read();
	}
	System.out.println("\nEnter the Employee No you want search?:");
	int srch = Integer.parseInt(dp.readLine());
	for(int i=0;i<n;i++)
	{
		if(e[i].eNo == srch)
		{
		System.out.println("\nThe Employee you searched is :");
		e[i].display();
		 break;
		}
	}
}
}