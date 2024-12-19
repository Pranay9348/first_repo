class A8Q1a
{
public static void main(String args[])
{
int num=Integer.parseInt(args[0]);
double sum=0.0,temp=0.0;
for(int i=1;i<=num;i++)
 {
  temp=1/(double)i;
  sum=sum+temp;
  }
  System.out.println(sum);
 }
}
