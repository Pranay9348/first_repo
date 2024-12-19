class A8Q2
{
public  static void main(String args[])
{
  int rem,cos;
  for(int i=1000;i<=9999;i++)
  {
    rem=(i%100);cos=(i/100);
     if((rem+cos)*(rem+cos)==i)
     System.out.print(" "+i);
    }
  }
}
