import java.io.*;
class SearchDemo
{
public static void main(String args[])throws IOException
{
	int i,n;
	int flag=0;
	DataInputStream dp = new DataInputStream(System.in);
	System.out.println("Enter the limit");
	n = Integer.parseInt(dp.readLine());
	int a[] = new int[n];
	System.out.println("Enter the elements ");
	for(i=0;i<n;i++)
	{
		a[i]=Integer.parseInt(dp.readLine());
	}
	System.out.println("Enter the element to be searched?");
	int find = Integer.parseInt(dp.readLine());
	for(i=0;i<n;i++)
	{
		if(a[i]==find)
		{
			flag=1;
			break;
		}
	}
	if(flag==1)
	{
		System.out.println("Element found at position: "+(i+1));
	}
	else
	{
		System.out.println("Element not found");
	}
}
}
