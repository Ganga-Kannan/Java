 import java.io.*;
import java.util.Scanner;
class testoverload
{   
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        overload obj = new overload();
        Scanner sc = new Scanner(System.in); 
        System.out.println(" ");
		System.out.print("Enter your choice ('s' for square,else cube) : ");
        char ch1 = sc.next().charAt(0);
	    System.out.print("Enter a number: ");
        int n = in.nextInt();
        obj.calculate(n, ch1);
        System.out.println(" ");
		
        System.out.print("Enter the first number: ");
        n = in.nextInt();
        System.out.print("Enter the second number: ");
        int m = in.nextInt();
        System.out.print("Enter your choice ('p' for product,else sum) : ");
        char ch2 = sc.next().charAt(0);
        obj.calculate(n, m, ch2);
        System.out.println( " ");
        
	System.out.println("Enter the first string:");
	String str1=in.next();
	System.out.println("Enter the second string:");
	String str2=in.next();
	obj.calculate(str1,str2);
	
        
    }
}

class overload
{
    public void calculate(int n, char ch) 
    {
        if (ch == 's') 
	{
                System.out.println("The square of the number is:");
		System.out.println(n*n);
	}
           
        else 
	{
                System.out.println("The cube of the number is:");
		System.out.println(n*n*n);
        }
    }
     public void calculate(int n, int m, char ch) 
    {
        if (ch == 'p')
         {
            System.out.println("Product of two numbers:");
	    System.out.println(n*m);
          }
        else
          {
            System.out.println("Sum of two numbers :");
	    System.out.println(n+m);
          }
    }
    public void calculate(String str1, String str2)
	 {
       if(str1.equals(str2) == true)
       {
            System.out.println("The Strings are equal");
	}
	else
       {
            System.out.println("The Strings are not equal");
	}
    }
}
