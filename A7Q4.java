class A7Q4 {

    public static void main(String[] args)
    {
        int num=Integer.parseInt(args[0]);
        int Number,remain,result=0;

        Number=num;
    while(Number!=0)
    {
        remain=Number%10;
        remain=result+remain*remain*remain;
        Number=Number/10;
    }
  if(result==num)
     System.out.println(num+" is an Armstrong number.");
  else
     System.out.println(num+"is not an Armstrong number.");
  }
}