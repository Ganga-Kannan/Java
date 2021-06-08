import java.io.*;
class MatrixAdd
{
	public static void main(String args[])throws IOException
	{
		
		int i,j,m,n,p,q;
		int sum[][]=new int [10][10];
		DataInputStream dp = new DataInputStream(System.in);
		System.out.println("First Matrix");
		System.out.println("Enter the no of rows:");
		m = Integer.parseInt(dp.readLine());
		System.out.println("Enter the no of columns:");
		n = Integer.parseInt(dp.readLine());
		int a[][]=new int [m][n];
		System.out.println("Enter the elements of first matrix:");
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				a[i][j] = Integer.parseInt(dp.readLine());
		System.out.println("Second Matrix");
		System.out.println("Enter the no of rows:");
		p = Integer.parseInt(dp.readLine());
		System.out.println("Enter the no of columns:");
		q = Integer.parseInt(dp.readLine());
		int b[][]=new int [p][q];
		System.out.println("Enter the elements of second matrix:");
		for(i=0;i<p;i++)
			for(j=0;j<q;j++)
				b[i][j] = Integer.parseInt(dp.readLine());
		if(m==p && n==q)
		{
			for(i=0;i<m;i++)
			{
			  for(j=0;j<n;j++)
			  {
				   sum[i][j]=a[i][j]+b[i][j];
			  }
			 
			}
			System.out.println("Sum of matrix: ");
			for(i=0;i<p;i++)
			{
				for(j=0;j<q;j++)
				
				{
		      
					System.out.print(" " + sum[i][j]+"   ");
				}
					System.out.println();
			}
		}
		else
		{
			System.out.println("The rows and columns of two matrices are not same");
		}
	}
}
		
			  
			
		
		
		
		
		
