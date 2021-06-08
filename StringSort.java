import java.io.*;
class StringSort
{
	public static void main(String args[])throws IOException
	{
		int n,i,j;
		DataInputStream dp = new DataInputStream(System.in);
		System.out.println("Enter the no of strings: ");
		n = Integer.parseInt(dp.readLine());
		String str[]= new String[n];
		System.out.println("Enter the strings to be sorted: ");
		for(i=0;i<n;i++)
			str[i] = dp.readLine();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				
				if(str[i].compareTo(str[j])>0)
				{
					String temp = str[i];
					str[i]=str[j];
					str[j]=temp;
				}
			}
		}
		
		System.out.println("STRINGS IN SORTED ORDER : ");
		System.out.println("----------------------- ");
		for(i=0;i<n;i++)
	    System.out.print(str[i]+" ");
	}
}
		
		