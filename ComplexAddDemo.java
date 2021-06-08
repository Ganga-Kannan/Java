import java.io.*;
class ComplexAdd
{
	int real,imag;
	void read()throws IOException
	{
		DataInputStream dp = new DataInputStream(System.in);
		System.out.println("Enter the real part:");
		 real = Integer.parseInt(dp.readLine());
		System.out.println("Enter the imaginary part:");
		 imag = Integer.parseInt(dp.readLine());
	}
	ComplexAdd  add(ComplexAdd c2)
	{
	    
		ComplexAdd S = new ComplexAdd();		
		S.real = real + c2.real;
		S.imag = imag + c2.imag;
		return (S);
	}
	void display()
	
	{
		
		System.out.println("Sum is" + real + "+" + imag + "i");
		
	}

}
class ComplexAddDemo
{
public static void main(String args[])throws IOException
{
	ComplexAdd c1 = new ComplexAdd();
	c1.read();
	ComplexAdd c2 = new ComplexAdd();
	c2.read();
	ComplexAdd c3 = new ComplexAdd();
	c3=c1.add(c2);
	c3.display();
}
}
	
		
		
		
	
	
