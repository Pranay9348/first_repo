class A6Q3 {

public static void main (String args []) 
{

int num,temp,rev=0,count=0,n=0;

num=Integer.parseInt (args[0]);
temp = num;
while (temp!=0)
{
rev*= 10;
rev+= temp%10;
temp/= 10;
count++;
}
System.out.println(count);
System.out.println("\n The Number in words \n"); 
while (n<count)
{
   temp =rev%10;

switch(temp)
{
case 1:
     System.out.println("One"); 
     break;
case 2:
     System.out.println("Two"); 
     break;
case 3:
    System.out.println("Three");
    break;
case 4:
      System.out.println("Four");
      break;
case 5: 
      System.out.println("Five");
      break;
case 6:
     System.out.println("Six"); 
     break;
case 7:
     System.out.println("seven");
      break;
case 8: 
      System.out.println("Eight");
      break;
case 9:
      System.out.println("Nine");
      break;
case 0:
      System.out.println("zero");
      break;
}
    n++;
     rev/= 10;
    }
  }
}