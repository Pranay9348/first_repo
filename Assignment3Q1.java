class Assignment3Q1
{
   
    public static void main(String args[])
    {
      
        double fahrenheit =Double.parseDouble(args[0]) ;

        double celsius = ((fahrenheit - 32)*5) /9;
 
        System.out.println("value of temperature in celsius:" + celsius);
    }
}