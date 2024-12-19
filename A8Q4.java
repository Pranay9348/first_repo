class A8Q4
{
public static void main(String args[])
{
   int num=Integer.parseInt(args[0]);
   while(num>9)
    {
      int rem=0,sum=1;
      while(num>0)
      {
        rem=num%10;
         if(rem!=0)
        sum=sum*rem;
        num=num/10;
       }
      num=sum;
            
      }
    System.out.print(num);
 }
}