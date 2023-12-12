public class Time{

 public static void main(String args[])
 {

  add(30,20);
  mul(3.5f,6.5f);
  div(7.5,9.0);
  name('D');
  bool(true);
  addition(5342,9576);
  

 }


 static int add(int input1,int input2)
 {
    int sum=input1+input2;
    System.out.println("sum of two inputs="+sum);
    return sum;
 }

 static float mul(float num1, float num2)
 {
  float prod=num1*num2;
  System.out.println("Multiplication="+prod);
  return prod;
 }

 static double div(double num1,double num2)
 {
  double d=num1/num2;
  System.out.println("Division="+d);
  return d;
 }

 static char name(char char1)
 {
  char n=char1;
  System.out.println("Character="+n);
  return n;
 }



 static boolean bool(boolean b1)
 {
  boolean b=b1;
  System.out.println(b);
  return b;
 }

 static long addition(long s,long n)
 {
  long add=s+n;
  System.out.println(add);
  return add;
 }


}
