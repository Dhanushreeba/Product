public class Wallet{
	String brand;
	int full;
	int empty;
	int cluttered;
	int organized;
	int wornOut;
	
	static void paying(){
		System.out.println("paying money");
	}
	static void sorting(){
		System.out.println("sorting the things and money");
	}
	static void storing(){
		System.out.println("storing cards and other things");
	}
	
	 Wallet(String brand,int full,int empty,int cluttered,int organized,int wornOut){
	
		this.brand=brand;
		this.full=full;
		this.empty=empty;
		this.cluttered=cluttered;
		this.organized=organized;
		this.wornOut=wornOut;
	
	}
	public void displayWalletDetails(){
			System.out.println("Brand :" +brand);
			System.out.println("Full :" +full);
			System.out.println("Empty :" +empty);
			System.out.println("Cluttered :" +cluttered);
			System.out.println("Organized :" +organized);
			System.out.println("WornOut :" +wornOut);
	
	}
	public static void main(String [] args){
	

		Wallet wallet=new Wallet("Titan",100,0,75,90,40);
		wallet.displayWalletDetails();
		Wallet.paying();
		Wallet.sorting();
		Wallet.storing();
	
	}	

}



