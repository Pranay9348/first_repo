class A8Q1d
{
public static void main(String args[])
{
int n=Integer.parseInt(args[0]);
double sum=0.0,res=1;
for(int i=2;i<=n;i++)
   { sum=1;
     if(i%2==0)
       sum=i*i*i*sum;
     else if(i%2!=0)
       sum=i*i*sum;
  res=res+sum;
    }
 System.out.println(res);
 }
}
