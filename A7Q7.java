class A7Q7{
public static void main(String args[]){ 
int n=Integer.parseInt(args[0]); 
int a=0,b=1; 
for(int i=0;i<n;i++)
 {
  System.out.println(a);
  b=a+b; a=b-a;
  }
 }
}