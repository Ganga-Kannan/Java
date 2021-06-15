
import java.io.*;

class Publisher
{
	String Name,Location;
	int ISBN_number;
	
	void read()throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter Publisher Details ");
		System.out.println("Enter the Name : ");
		  Name = br.readLine();
		System.out.println("Enter the  location: ");
          Location = br.readLine();
		System.out.println("Enter the  ISBN Number: ");
          ISBN_number = Integer.parseInt(br.readLine());
	}
	void display()
	{
		System.out.println("Displaying  Publisher Details ");
		System.out.println("Name:"+ Name);
		System.out.println("Location:"+ Location);
		System.out.println("ISBN Number:"+ ISBN_number);
	}
}
         

class Book extends Publisher
{
	 String Author ,Title,Publisher,Category;
	 int Price ;
	void read()throws IOException
	{
		super.read();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("Enter Book Details ");
		System.out.println("Enter the Author name : ");
		  Author = br.readLine();
		System.out.println("Enter the  Title: ");
          Title = br.readLine();
		System.out.println("Enter the  Price: ");
          Price = Integer.parseInt(br.readLine());
		 System.out.println("Enter the  Publisher: ");
          Publisher = br.readLine();
		 System.out.println("Enter the Category:(Literature or Fiction )");
          Category = br.readLine();
	}
		
	void display()
	{
		super.display();
		System.out.println("\nDisplaying  Book  Details ");
		System.out.println("Author Name:"+Author);
		System.out.println("Title:"+Title);
		System.out.println("Price:"+Price);
		System.out.println("Publisher:"+Publisher);
		System.out.println("Category:"+Category);
	}
}	



class BookDemo
{
	public static void main(String args[]) throws IOException
	{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the no of objects to be created:");
	int n = Integer.parseInt(br.readLine());
	Book f[] = new Book[n];
    for(int i=0;i<n;i++)
	{
	f[i] = new Book();
	f[i].read();
	System.out.println();
    }
	for(int i=0;i<n;i++)
	{
	System.out.println("Enter the category to be viewed:");
	 System.out.println("\nLiterature or Fiction");
	  String ch = br.readLine();
	 for(int j=0;j<n;j++)
	  if(ch.equalsIgnoreCase(f[j].Category))
		{
			System.out.println("Displaying Details of Book with Category:"+ch+" "+(j+1)+"\n");
			f[j].display();
			System.out.println();
		}
		
    }
}
}
	
