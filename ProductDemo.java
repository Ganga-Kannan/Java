import java.io.*;
class Product
{
String pname;
int pcode,price;

	void read() throws IOException
	{
	  
	      DataInputStream dp = new DataInputStream(System.in);
		  System.out.println("Enter the Product Code");
          pcode = Integer.parseInt(dp.readLine());
          System.out.println("Enter the Product name");
          pname = dp.readLine();
	      System.out.println("Enter the Product Price");
          price = Integer.parseInt(dp.readLine());
	}
	
	void  display()
	{
		System.out.println("PRODUCT CODE ="+pcode);
		System.out.println("PRODUCT NAME ="+pname);
		System.out.println("PRODUCT PRICE ="+price);
	
	}
}
class ProductDemo
{
public static void main(String args[])throws IOException

{
	Product p[] = new Product[3];
	for(int i=0;i<3;i++)
	{
		System.out.println("PRODUCT\t"+(i+1));
	 p[i] = new Product();
	p[i].read();
	}
	int low = 0;
	for(int i=0;i<3;i++)
	{
		if(p[low].price>p[i].price)
		{
			low = i;
		}
	}
	
	System.out.println("The Product with Lowest Price is :");
	p[low].display();
	

}
}