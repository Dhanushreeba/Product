public class Phone{
      public static void main(String[] args)
	  {
	   int returnedValue=press();
	   System.out.println(returnedValue);
	   
	    char charValue=key();
		System.out.println(charValue);
		
		float floatValue=run();
		System.out.println(floatValue);
		
		double doubleValue=bank();
		System.out.println(doubleValue);
		
		short shortValue=machine();
		System.out.println(shortValue);
		
		long longValue=adharNumber();
		System.out.println(longValue);
		
		boolean booleanValue=check();
		System.out.println(returnedValue);
		
		byte byteValue=percentage();
		System.out.println(byteValue);
		
	    
	  }
	  static int press(){
	  int value=900;
	  return value;
	  }
	  static char key(){
	  char value='e';
	  return value;
	  }
	  static float run(){
	  float value=46.3f;
	  return value;
	  }
	  static double bank(){
	  double value=30000.60;
	  return value;
	  }
	  static short machine(){
	  short value=4567;
	  return value;
	  }
	  static long adharNumber(){
	  long value=897695003l;
	  return value;
	  }
	  static boolean check(){
	  boolean value=true;
	  return value;
	  }
	  static byte percentage(){
	  byte value=46;
	  return value;
	  }
	  
	  
}