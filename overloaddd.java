import java.io.*;

class Numbers
{

	void calculate(int n, char ch)
	{
		if(ch == 's')
		{
			int square = n*n;
			System.out.println("SQUARE = "+square);
		}
		else
		{
			int cube = n*n*n;
			System.out.println("CUBE = "+cube);
		
		}
	}
	
     void calculate(int n, int m, char ch)
	{
			  if(ch == 'p')
		{
			int product =  n*m;
			System.out.println("PRODUCT = "+product);
		}
		else
		{
			int add = n+m;
			System.out.println("ADD = "+add);
		}
	}
		void calculate(String str1,String str2)
	{
			  if(str1.equals(str2))
		{
			System.out.println("Both the strings are equal");
		}
		else
		{
			System.out.println("Both the strings are not equal");
		}
	}
}	

class overloaddd
{
public static void main(String args[])throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Numbers n = new Numbers();
    
		System.out.println("Enter a number: ");
		int num = Integer.parseInt(br.readLine());
		System.out.println("Enter your choice ('s' for Square,else cube) : ");
		char ch = (char)br.readLine().charAt(0);
		n.calculate(num,ch);
		
		System.out.println("Enter first  number: ");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("Enter the second  number: ");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("Enter your choice ('p' for Product ,else sum): ");
		char ch1 = (char)br.readLine().charAt(0);
		n.calculate(num1,num2,ch1);
		
		System.out.println("Enter the first String: ");
		String str11 = br.readLine();
		System.out.println("Enter the second String: ");
		String str12 = br.readLine();
		n.calculate(str11,str12);
	}
}
		
		 
		 
		 
		 
		 
		 
		 