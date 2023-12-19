public class Jupiter 
{
    Jupiter()
	
{
    System.out.println("This is a default constructor");
	System.out.println("no parameters");
	
}
   
    Jupiter(byte val,int num)
	
{
     System.out.println(val);
	
}
    Jupiter(float value,int num)
	
{
    System.out.println(value);
	
}
    Jupiter(int num,float value)
	
{
    System.out.println(num);
	
}


public static void main(String[]args)
{
	byte value=30;
   new Jupiter();
   new Jupiter(value,1654);
   new Jupiter(12.87f,953);
   new Jupiter(9807,18.2f);
   
   
}
}