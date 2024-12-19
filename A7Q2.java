class A7Q2
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
int temp = n ;
int sum=0; while(n!=0)
{
sum+=(n%10);
n/=10;
}
int temp_t, count=0;
temp_t=temp; 
while (sum!= 0)
{
int s=sum%10;
sum/= 10 ;
temp=temp_t; 
count=0;
while(temp!=0)
{
int t=temp%10;
temp/=10;
if (t==s)
count++;
} 
System.out.println(s+" Occurs: "+count+" times");
}
}
}