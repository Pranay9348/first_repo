class A5Q4
{
public static void main(String args[])
{
int a=Integer.parseInt(args[0]);
int b=Integer.parseInt(args[1]);
int c=Integer.parseInt(args[2]);
if(a==b && b==c)
  System.out.println("Equilateral Traingle");
else if(a!=b && b!=c && c!=a)
   System.out.println("Scalene Triangle"); 
else if (a==b || b==c ||c==a)
   System.out.println("IsoScalene Traingle");
 }
}