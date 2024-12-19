class Assignment4Q3
{
public static void main(String args[])
{
 int v=Integer.parseInt(args[0]);
 int n=Integer.parseInt(args[1]);
 


 //1st swap
 v=n^v;
 n=v^n;
 v=v^n;
 System.out.println("v="+v+" n="+n);
 
 //2nd swap
 v=n+v;
 n=v-n;
 v=v-n;
 System.out.println("v="+v+" n="+n);
  }
}