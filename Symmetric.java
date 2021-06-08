import java.io.*;

class Symmetric
{
public static void main(String args[])throws IOException
{
	int m,n,i,j;
	int b[][]=new int[10][10];
	DataInputStream dp = new DataInputStream(System.in);
	System.out.println("Enter the no of rows: ");
	m = Integer.parseInt(dp.readLine());
	System.out.println("Enter the no of columns: ");
	n = Integer.parseInt(dp.readLine());
	int a[][] = new int[m][n];
	System.out.println("Enter the Elements of the matrix: ");
	for(i=0;i<m;i++)
		for(j=0;j<n;j++)
			a[i][j] = Integer.parseInt(dp.readLine());

	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			if(a[i][j]==a[j][i])
			{
					b[i][j]=a[j][i];
			}
			else
			{
				System.out.println(" The Given Matrix Is Not Symmetric!!!");
				System.exit(1);
		    }
		}
	}
	System.out.println("The Given Matrix Is Symmetric");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println();
	}
}
}
	
	