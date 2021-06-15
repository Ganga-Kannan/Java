import java.io.*;

class Person
{
	String Name;
    char Gender;
    String 	Address; 
	int Age;
	
	Person(String n,char gen,String add,int age)
	{
		Name = n;
        Gender = gen;
    	Address = add; 
		Age = age;
	}
}
	
class Employee extends Person
{
	int Empid;
	String Company_name, Qualification;
	float Salary;
	
	Employee(String n,char gen,String add,int age,int emp,String comp, String qual,float sal)
	{
		super(n,gen,add,age);
		 Empid = emp;
	    Company_name = comp;
		Qualification = qual;
	     Salary = sal;
	}
}

class Teacher extends Employee
{
	 String Subject,Department;
	 int Teacherid;
	 
	 Teacher(String n,char gen,String add,int age,int emp,String comp, String qual,float sal,String sub,String depart,int teachid)
	 {
		 super(n,gen,add,age,emp,comp,qual,sal);
		 Subject = sub;
		  Department = depart;
	      Teacherid = teachid;
	 }
	 
	 void display()
	 {
		 System.out.println(" Name: " + Name);
		 System.out.println("Gender: "+Gender);
		 System.out.println("Address: "+ Address);
		 System.out.println("Age: "+ Age);
		 System.out.println("Employee Id :"+ Empid);
		 System.out.println("Company  Name: "+ Company_name);
		 System.out.println("Employee Qualification :"+ Qualification);
		 System.out.println("Employee Salary : "+ Salary);
		  System.out.println("Teacher Subjects : "+ Subject);
		 System.out.println("Teacher Department : "+ Department);
		 System.out.println("Teacher ID : "+ Teacherid);
	 }
}
	
class InheritPersonDemo
{
public static void main(String args[]) throws IOException
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the no of teachers details to be entered:");
	int n = Integer.parseInt(br.readLine());
	Teacher teach[] = new Teacher[n];
    for(int i=0;i<n;i++)
	{ 
		System.out.println("\n"+" "+"Enter  Details " + (i+1));
		System.out.println("Enter the Name: ");
		String  Name = br.readLine();
		System.out.println("Enter the Gender:");
		char Gender = br.readLine().charAt(0);
		System.out.println("Enter the  Address: ");
		 String  Address = br.readLine();
		System.out.println("Enter the Age: ");
		int  Age = Integer.parseInt(br.readLine());
		System.out.println("Enter the Employee Id: ");
		int Empid =Integer.parseInt(br.readLine());
		System.out.println("Enter Company  Name: ");
		 String Company_name =  br.readLine();
		 System.out.println(" Enter Employee Qualification: ");
		String Qualification = br.readLine();
		 System.out.println(" Enter Employee Salary: ");
		 float Salary = Float.parseFloat(br.readLine());
		  System.out.println(" Enter Teacher Subjects ");
		   String Subject = br.readLine();
		  System.out.println("Enter Teacher Department:");
		  String Department = br.readLine();
		 System.out.println("Enter Teacher ID ");
		 int Teacherid = Integer.parseInt(br.readLine());
		
		teach[i] = new Teacher(Name,Gender,Address,Age,Empid,Company_name,Qualification,Salary,Subject,Department,Teacherid);
		System.out.println();
		System.out.println("\nDisplaying  Details " + (i+1));
		System.out.println("--------------------------------------");
		teach[i].display();
	}

}

}
