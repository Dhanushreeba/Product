public class Bag{
	boolean full;
	boolean empty;
	String zipped;
	String unZipped;
	String strapped;
	String unStrapped;
	
	static void packing(){
		System.out.println("bag is packed");
	}
	static void unPacking(){
		System.out.println("unpacking a bag");
	}
	static void carrying(){
		System.out.println("carry the bag");
	}
	
	
	 Bag(boolean full,boolean empty,String zipped,String unZipped,String strapped,String unStrapped){
	
		this.full=full;
		this.empty=empty;
		this.zipped=zipped;
		this.unZipped=unZipped;
		this.strapped=strapped;
		this.unStrapped=unStrapped;
	
	}
	public void displayBag(){
			System.out.println("is bag isFull :" +full);
			System.out.println("is bag is Empty :" +empty);
			System.out.println("Zipped :" +zipped);
			System.out.println("UnZipped :" +unZipped);
			System.out.println("Strapped :" +strapped);
			System.out.println("UnStrapped :" +unStrapped);
	
	}
	public static void main(String [] args){
	

		Bag bag=new Bag(true,false,"Yes","No","ClothingInPosition","NotInAPosition");
		bag.displayBag();
		Bag.packing();
		Bag.unPacking();
		Bag.carrying();
	
	}	

}



	
	
		
