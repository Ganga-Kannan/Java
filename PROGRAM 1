import java.util.*;  
public class StackPushPop   
{  
public static void main(String args[])   
{  
  
Stack <Integer> s = new Stack<>();  
System.out.println("stack: " + s);  
 
push(s, 20);  
push(s, 13);  
push(s, 89);  
push(s, 90);  
push(s, 11);  
push(s, 45);  
push(s, 18);  
 
pop(s);  
pop(s);  

try   
{  
pop(s);  
}   
catch (EmptyStackException e)   
{  
System.out.println("STACK IS EMPTY");  
}  
}  
 
static void push(Stack s, int x)   
{  
     
s.push(new Integer(x));  
System.out.println("push -> " + x);  

System.out.println("stack: " + s);  
}  
  
static void pop(Stack s)   
{  
System.out.print("pop -> ");  
Integer x = (Integer) s.pop();  
System.out.println(x);  
System.out.println("stack: " + s);  
}  
} 
