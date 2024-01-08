public class Umbrella{
	boolean open;
	boolean closed;
	boolean broken;
	boolean wet;
	boolean dry;
	boolean folded;
	
	static void Shielding(){
		System.out.println("umbrella is shielding");
	}
	static void Folding(){
		System.out.println("folding umbrella");
	}
	static void Drying(){
		System.out.println("umbrella is completly dried");
	}
	
	
	 Umbrella(boolean open,boolean closed,boolean broken,boolean wet,boolean dry,boolean folded){
	
		this.open=open;
		this.closed=closed;
		this.broken=broken;
		this.wet=wet;
		this.dry=dry;
		this.folded=folded;
	
	}
	public void displayUmbrella(){
			System.out.println("Open :" +open);
			System.out.println("Closed :" +closed);
			System.out.println("Broken :" +broken);
			System.out.println("Wet :" +wet);
			System.out.println("Dry :" +dry);
			System.out.println("Folded :" +folded);
	
	}
	public static void main(String [] args){
	

		Umbrella umb=new Umbrella(true,true,false,false,true,false);
		umb.displayUmbrella();
		Umbrella.Shielding();
		Umbrella.Folding();
		Umbrella.Drying();
	
	}	

}



	
	
		





