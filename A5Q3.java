class A5Q3
{
public static void main(String args[])
{ 
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);

double d=(b*b)-(4*a*c);
if(d<0)
  System.out.println("Root is imaginary");
else if(d==0)
  System.out.println("Roots are equal so only one root");
else 
  System.out.println("Rational and Squared/Not Squared ");
 }
}
 