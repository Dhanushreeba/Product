public class Telephone 
{
    Telephone()
	
{
    System.out.println("1st Constructor");
	
}
   
    Telephone(int num,double value)
	
{
     System.out.println(value);
	
}
    Telephone(float value,int num)
	
{
    System.out.println(num);
	
}
    Telephone(int num,float value)
	
{
    System.out.println(value);
	
}


public static void main(String[]args)
{
   
   new Telephone();
   new Telephone(87,16.3154d);
   new Telephone(8.056f,614);
   new Telephone(6646,5.82f);
   
   
}
}