class A7Q3 {
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int temp=n,m=0;
while(temp!=0)
{
  int k=temp%10;
  m=(m*10)+k;
  temp=temp/10;
}
if(m==n)
    System.out.println("palindrom");
else
   System.out.println("Not palindrom");
}
}