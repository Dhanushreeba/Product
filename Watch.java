public class Watch
{
    Watch()
	
{
    System.out.println(" Having no parameters");
	
}
   
    Watch(int num,byte value)
	
{
     System.out.println(value);
	
}
    Watch(float value,int num)
	
{
    System.out.println(num);
	
}
    Watch(int num,double value)
	
{
    System.out.println(value);
	
}


public static void main(String[]args)
{
	
   byte val=120;
   new Watch();
   new Watch(87,val);
   new Watch(2.876f,56);
   new Watch(9567,8.19852d);
   
}
}