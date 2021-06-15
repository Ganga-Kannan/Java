
import java.io.*;

class Employee
{
	int Empid;
	String  Name,Address;
	float Salary ; 
	
	Employee(int e,String n,String a,float s)

	{
		Empid = e;
		Name = n;
		Address = a;
		Salary = s;
	}
}
class Teacher extends Employee
{
	String Department;
     String Subjects;
	 
	 Teacher(int e,String n,String a,float s,String d,String st)
	 {
		 super(e,n,a,s);
		 Department = d;
		 Subjects = st;
	 }
	 
	 void display()
	 {
		 
		 System.out.println("Employee Id "+ Empid);
		 System.out.println("Employee Name"+ Name);
		 System.out.println("Employee Address"+ Address);
		 System.out.println("Employee Salary"+ Salary);
		 System.out.println("Employee Department"+ Department);
		 System.out.println("Employee Subjects"+ Subjects);
	 }
}

class InheritanceEmployeeDemo
{
public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the no of teachers details to be entered:");
	int n = Integer.parseInt(br.readLine());
	Teacher teach[] = new Teacher[n];
    for(int i=0;i<n;i++)
	{ 
		System.out.println("\n"+" "+"Enter Employee Details " + (i+1));
		System.out.println("Enter the Employee Id: ");
		int Empid = Integer.parseInt(br.readLine());
		System.out.println("Enter the Employee Name: ");
		String  Name = br.readLine();
		System.out.println("Enter the Employee Address: ");
		String  Address = br.readLine();
		System.out.println("Enter the Employee Salary: ");
		float Salary =Float.parseFloat(br.readLine());
		System.out.println("Enter the Employee Department: ");
		String Department = br.readLine();
		System.out.println("Enter the Employee Subjects: ");
		String Subjects = br.readLine();
		
		teach[i] = new Teacher(Empid,Name,Address,Salary,Department,Subjects);
		System.out.println();
		System.out.println("\nDisplaying Employee Details " + (i+1));
		System.out.println("--------------------------------------");
		teach[i].display();
	}
}
}
