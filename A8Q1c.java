class A8Q1c
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
double sum=0.0,temp=0.0,fact=1.0;
for(int i=1;i<=n;i++)
  {
     fact=fact*i;
     temp=1/fact;
     sum=sum+temp;
  }
 System.out.println(sum);
 }
}