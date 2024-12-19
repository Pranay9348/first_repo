import java.util.*;
class A{
    
    int arr[] = new int[5];
    int occ[] = new int [10];
     Scanner sc = new Scanner(System.in);
   public A(){
       
       for(int i=0;i<arr.length;i++)
           arr[i]=0;
       for(int i=0;i<occ.length;i++)
            occ[i]=0; 

      }
 void Display(){
   System.out.println("Value of array after swaping ....");
  for(int i=0;i<arr.length;i++){
        
         System.out.println(arr[i]+"\t");
    }
      System.out.println("Occurrances");
       System.out.println("0 1 2 3 4 5 6 7 8 9 ");
       for(int i=0;i<occ.length;i++)
          System.out.println(occ[i]+" ");
   }
  void Insert(){
  for(int i=0;i<arr.length;i++)
  {
   System.out.println("Enter the" +(i+1)+"th number ");
   arr[i] = sc.nextInt();
  }
}
  int sum()
  {
     int s =0;
     for(int i=0;i<arr.length;i++)
          s +=arr[i]; 
        
  return s;
  }
int average()
{
  int a,p,c=arr.length;
  p=sum();
  a=p/c;
  return a;
}
void swap(){
   int min=9999,max=-9999,c=0,d=0,temp;
      for(int i=0;i<arr.length;i++){
            if(min>arr[i])
                 min=arr[i];
            if(max<arr[i])
                 max=arr[i];
               }
    for(int i=0;i<arr.length;i++){
         if(arr[i]==min)
              c=i;
         if(arr[i]==max)
              d=i;  
  }
  temp=arr[c];
  arr[c]=arr[d];
  arr[d]=temp;
 }
 void occur()
{
for(int i=0;i<arr.length;i++)
{
  if(arr[i]==0)
      occ[0]=occ[0]+1;
  if(arr[i]==1)
      occ[1]=occ[1]+1;
  if(arr[i]==2)
      occ[2]=occ[2]+1;
  if(arr[i]==3)
      occ[3]=occ[3]+1;
  if(arr[i]==4)
      occ[4]=occ[4]+1;
  if(arr[i]==5)
      occ[5]=occ[5]+1;
  if(arr[i]==6)
      occ[6]=occ[6]+1;
  if(arr[i]==7)
      occ[7]=occ[7]+1;
  if(arr[i]==8)
      occ[8]=occ[8]+1;
  if(arr[i]==9)
      occ[9]=occ[9]+1;
    }
  }
}
class A10Q1
{
   public static void main(String args[])
{
    A ob= new A();
      ob.Insert();
   System.out.println("The sum of all digits in the array :"+ob.sum());
    System.out.println("The AVERAGE of all digits in the array :"+ob.average());  
   ob.swap();
   ob.occur();
    ob.Display();
 }
}