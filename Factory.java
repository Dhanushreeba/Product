public class Factory{

	public static void main(String[] args)
	{
	String val="Dhanushree";
	boolean result=val.isEmpty();
	System.out.println(result);
	
	
	String val1 = "    Language   ";
	System.out.println(val1.trim());
	System.out.println(val1);
	System.out.println("  ");
	
	float val2=20.5f;
	String s=String.valueOf(val2);
	System.out.println(10.6f);
	System.out.println("  ");
	
	String val3= new String("This is java");
         String substring = val3.substring(6);
         System.out.println(substring);
         System.out.println("   ");

         String Str = new String(" blue grey");
         String replaceFirst = Str.replaceFirst("blue","White");
         System.out.println(replaceFirst);
         System.out.println("   ");

         String val5 = "Dhanu";
         String val6 = "dhanu";
         boolean isEqualIgnoreCase = val5.equalsIgnoreCase(val6);
         System.out.println(isEqualIgnoreCase);
         System.out.println("   ");

         String str1 = "Thomas,Edison";
         boolean endsWith = str1.endsWith("edison");
         boolean startsWith = str1.startsWith("Thomas");
         System.out.println(startsWith);
         System.out.println(endsWith);
         System.out.println("   "); 
       
         String str2 = "Dhanushree";
         String upperCase = str2.toUpperCase();
         String lowerCase = str2.toLowerCase();
         System.out.println(upperCase);
         System.out.println(lowerCase);

    }
}
