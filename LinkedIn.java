public class LinkedIn
{
    LinkedIn()
	
{
    System.out.println(" Having no parameters");
	
}
   
    LinkedIn(int num,float val)
	
{
     System.out.println(val);
	
}
    LinkedIn(short val,int num)
	
{
    System.out.println(num);
	
}
    LinkedIn(int val,long num)
	
{
    System.out.println(num);
	
}


public static void main(String[]args)
{
	
   short value=6548;
   new LinkedIn();
   new LinkedIn(34,6.956f);
   new LinkedIn(value,26578);
   new LinkedIn(9567,54819852l);
   
}
}