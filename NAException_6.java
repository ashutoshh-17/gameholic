import java.util.*;
class NAException_6
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num1,num2,q;
try
{
System.out.println("\nEnter the value of first integer: ");
num1 = Integer.parseInt(sc.next());
System.out.println("\nEnter the value of second integer: ");
num2=Integer.parseInt(sc.next());
q = num1/num2;
System.out.println("\nQuotient is: "+q);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
catch(ArithmeticException e)
{
System.out.println(e);
}
}
}

/*Output-

c:\>javac NAexception.java

c:\>java NAexception

Enter the value of first integer:
2

Enter the value of second integer:
2


Quotient is: 1

c:\>java NAexception

Enter the value of first integer:
2

Enter the value of second integer:
0
java.lang.ArithmeticException: / by zero
*/