public class Games{
	
	public static void main(String[] args){
	
	//upcasting
	
	
    byte value=107;
	short number=value;
	System.out.println("short number" +number);
	
	short value1=3546;
	int number1=value1;
	System.out.println("int number1" +number1);
	
	int num=15348256;
	long val=num;
	System.out.println("long val" +num);
	
	float num1=2.345f;
	double val1=num1;
	System.out.println(val1);
	
	char value2='B';
	int number2=value2;
	System.out.println(number2);
	
	int number3=95;
	char value3=(char)number3;
	System.out.println(value3);
	
	//downcasting
	
	long longvalue=2364533264l;
	int intnumber=(int) longvalue;
	System.out.println(longvalue);
	
	int intvalue1=8765;
	short shortnumber1=(short) intvalue1;
	System.out.println(intvalue1);
	
	short shortval=13546;
	byte bytenum=(byte) shortval;
	System.out.println(bytenum);
	
	double doubleval1=34.876534;
	float floatnum1=(float) doubleval1;
	System.out.println(floatnum1);

	
	int intnum2=57;
	char charval2=(char) intnum2;
	System.out.println(charval2);
	
	char val3='c';
	int  intnum3=(int) val3;
	System.out.println( intnum3);
	} 
}