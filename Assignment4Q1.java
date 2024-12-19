class Assignment4Q1
{
public static void main(String args[])
{
    int v = Integer.parseInt(args[0]);   
    int n = Integer.parseInt(args[1]);
    v=v>>n;
    System.out.println(">>"+v);
    v=v<<n;
    System.out.println("<<"+v);
    v=v>>>n;
    System.out.println(">>>"+v);
    }  
}  
  