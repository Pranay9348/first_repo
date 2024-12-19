class Assignment3Q2
{
public static void main(String args[])
{
 double pie=3.14159;
 double radius=Double.parseDouble(args[0]);
 double area=4*pie*radius*radius;
 double volume=((pie*radius*radius*radius)*4)/3;
 System.out.println("Area="+area+" Volume="+volume);
 }
}