class A7Q6{
public static void main(String args[]){ 
int num=Integer.parseInt(args[0]); 
for(int i=2;i<=num; i++)
{
if(num%i==0)
{
int temp=i, flag=1; 
for(int j=2;j<temp;j++)
{
   if(temp%j==0)
   {
     flag=0; 
      break;
    }
} 
 if(flag==1)
       System.out.println(i);
     }
    }
   }
  }