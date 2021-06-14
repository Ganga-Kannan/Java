 import java.util.*;
class StringManipulations
{
  public static void main(String args[])
     {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Length of a string");
		System.out.println("---------------");
		System.out.println("Enter a string: ");
		String str1=sc.next();
		System.out.println(str1.length());
		System.out.println("String Concatenation");
        System.out.println("---------------");
		System.out.println("Enter string1: ");
		String s1=sc.next();
		System.out.println("Enter string2: ");
		String s2=sc.next();
		String s3=s1+s2;
		System.out.println(s3);
		System.out.println("String Character Extraction");
		System.out.println("---------------");
		System.out.println("Enter a string: ");
		String string1=sc.next();
		System.out.println("Enter character position: ");
		int n=sc.nextInt();
		char ch=string1.charAt(n-1);
		System.out.println("character: "+ch);
		System.out.println("String Equals");
		System.out.println("---------------");
		System.out.println("Enter string1: ");
		String st1=sc.next();
		System.out.println("Enter string2: ");
		String st2=sc.next();
		System.out.println(st1.equals(st2));
		System.out.println("Upper case and Lower case");
		System.out.println("---------------");
		System.out.println("Enter a string: ");
		String stg=sc.next();
		String lower=stg. toLowerCase();
		System.out.println(lower);
		String upper=stg. toUpperCase();
		System.out.println(upper);
		
	 }
}
