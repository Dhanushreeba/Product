public class Bank{

	public static void main(String args[]){

balance(46,92.5f);
balance(354,50.45f);
balance(700,56.2f);


byte value=56;
withdraw(3.56f,value,'d');
withdraw(value,'g',23.6f);
withdraw('l',34.7f,value);


balance(567l,30,value);
balance('b',30.5f);
balance(34,23.7f,value,238l);
	}

static void balance(int input1,float input2){
	System.out.println("This is 1st method");
}

static void withdraw(int input1,float input2){
	System.out.println("This is 2nd method");
}

static void deposit(int input1,float input2){
	System.out.println("This is 3rd method");
}

static void run(float input1,byte input2,char input3){
	System.out.println("Execute the information");
}

static void run(byte input1,char input2,float input3){
	System.out.println("Passing the value");
}

static void run(char input1,float input2,byte input3){
	System.out.println("Code is executing");
}

static void run(long input1,int input2,byte input3){
	System.out.println("Changing parameters");
}

static void run(char input1,float input2){
	System.out.println("Account information");
}

static void run(int input1,float input2,byte input3,long input4){
	System.out.println("Collecting information");
}

}