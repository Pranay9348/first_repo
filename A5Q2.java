class A5Q2
{
public static void main(String args[])
{
int amount=Integer.parseInt(args[0]);
int amt_2000=0,amt_500=0,amt_200=0,amt_100=0,amt_50=0,amt_20=0,amt_10=0,amt_5=0,amt_2=0,amt_1=0;
if(amount>=2000)
{
 amt_2000=(int)amount/2000;
 amount=amount%2000;
}
if(amount>500)
{
 amt_500=(int)amount/500;
 amount=amount%500;
}
if(amount>200)
{
 amt_200=(int)amount/200;
 amount=amount%200;
}
if(amount>100)
{
 amt_100=(int)amount/100;
 amount=amount%100;
}
if(amount>50)
{
 amt_50=(int)amount/50;
 amount=amount%50;
}
if(amount>20)
{
 amt_20=(int)amount/20;
 amount=amount%20;
}
if(amount>10)
{
 amt_10=(int)amount/10;
 amount=amount%10;
}
if(amount>5)
{
 amt_5=(int)amount/5;
 amount=amount%5;
}
if(amount>2)
{
 amt_2=(int)amount/2;
 amount=amount%2;
}
if(amount==1)
  amt_1=1;
System.out.println("2000 :" +amt_2000+ "500 :"+amt_500+ "200 :"+amt_200+ "100 :"+amt_100+ " 50 :"+amt_50+ "10 :"+amt_10+ " 5 :"+amt_5+ " 2 :"+amt_2+ "1 :"+amt_1);
 }
}