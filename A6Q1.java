class A6Q1
{
public static void main(String args[])
{
int roll_no,avg;
String name;
name=args[1];
roll_no=Integer.parseInt(args[0]);
int sub1=Integer.parseInt(args[2]);
int sub2=Integer.parseInt(args[3]);
int sub3=Integer.parseInt(args[4]);
int sub4=Integer.parseInt(args[5]);
int sub5=Integer.parseInt(args[6]);
String grade;

avg=(sub1+sub2+sub3+sub4+sub5)/5;
avg=avg/10;
      switch(avg)
     { //for 100
       case 10:
        // for >= 90
        case 9:
           grade = "O";
           break;
        // for >= 80 and <90
        case 8:
           grade = "E";
           break;
        // for >= 70 and <80
        case 7:
           grade = "A";
           break;
        // for >= 60 and <70
        case 6:
           grade = "B";
           break;
        // for >= 50 and <60
        case 5:
           grade = "C";
           break;
        // for  >=40 and <50
        case 4:
            grade= "D";
            break;
       // for <40 
        case 3:
            grade="Fail";
            break;
           
        default:
           grade = "invalid input";
           break;
      }
      
      // display result
      System.out.println("Grade = " + grade);
   }
}