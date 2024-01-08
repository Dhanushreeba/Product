public class Bicycle{
	String riding;
	String flatTire;
	String oiled;
	String rusty;
	boolean parked;
	String pedaling;
	
	static void cycling(){
		System.out.println("riding a cycle");
	}
	static void repairing(){
		System.out.println("repair the cycle");
	}
	static void locking(){
		System.out.println("lock the cycle");
	}
	
	
	 Bicycle(String riding,String flatTire,String oiled,String rusty,boolean parked,String pedaling){
	
		this.riding=riding;
		this.flatTire=flatTire;
		this.oiled=oiled;
		this.rusty=rusty;
		this.parked=parked;
		this.pedaling=pedaling;
	
	}
	public void displayBicycle(){
			System.out.println("Riding :" +riding);
			System.out.println("FlatTire :" +flatTire);
			System.out.println("Oiled :" +oiled);
			System.out.println("Rusty :" +rusty);
			System.out.println("is it Parked :" +parked);
			System.out.println("Pedaling :" +pedaling);
	
	}
	public static void main(String [] args){
	

		Bicycle cycle=new Bicycle("RidingACycle","HavingAFlatTire","SmoothAndWellMaintained","CareAndAttension",true,"MotionOfCycle");
		cycle.displayBicycle();
		Bicycle.cycling();
		Bicycle.repairing();
		Bicycle.locking();
	
	}	

}



	
	
		
