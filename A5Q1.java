class A5Q1
{
public static void main(String args[])
{
 double bs=Double.parseDouble(args[0]);
 double gross;
if(bs<12000)
  gross=bs+(bs*0.2)+(bs*1.15);
else
  gross=bs+(bs*0.15)+(bs*.9);
System.out.println("Gross salary :"+gross);
 }
}                                                               