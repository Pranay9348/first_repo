class A8Q1b
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
double x=Double.parseDouble(args[1]);
double sum=0.0,temp=0.0;
for(int i=1;i<=n;i++)
   {  temp=1/Math.pow(x,i);
     sum=sum+temp;
   }
  System.out.println(sum);
 }
}