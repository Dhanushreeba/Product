public class Computer 
{
    Computer()
	
{
    System.out.println("default constructor");
	System.out.println("no parameters");
	
}
   
    Computer(float val,double num)
	
{
     System.out.println(num);
	
}
    Computer(short val,int num)
	
{
    System.out.println(val);
	
}
    Computer(int num,float val)
	
{
    System.out.println(num);
	
}


public static void main(String[]args)
{
    short value=190;
   new Computer();
   new Computer(87.84f,1654);
   new Computer(value,9534);
   new Computer(6646,7.082f);
   
   
}
}