import java.util.Scanner;
class A7Q5{

public static void main(String args[]){ 
Scanner s = new Scanner(System.in);

int max=0,min=100;

System.out.println("Enter 10 numbers: ");

int i = 10 ; 
while(i!= 0)
{

int n =s.nextInt();

if(n>max)      max=n ;

if(n<min)    min=n ;

i--;

}

System.out.println("Max is: "+max+" Min is: "+min);
 }
}
