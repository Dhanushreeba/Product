public class Book1{
	String open;
	String closed;
	String torn;
	String dogEared;
	boolean dusty;
	String bookMark;
	
	static void reading(){
		System.out.println("reading a book");
	}
	static void writting(){
		System.out.println("writting in a book");
	}
	static void bookMarking(){
		System.out.println("marking a important points");
	}
	
	
	 Book1(String open,String closed,String torn,String dogEared,boolean dusty,String bookMark){
	
		this.open=open;
		this.closed=closed;
		this.torn=torn;
		this.dogEared=dogEared;
		this.dusty=dusty;
		this.bookMark=bookMark;
	
	}
	public void displayBook1(){
			System.out.println("Open :" +open);
			System.out.println("Closed :" +closed);
			System.out.println("Torn :" +torn);
			System.out.println("DogEared :" +dogEared);
			System.out.println("is it Dusty :" +dusty);
			System.out.println("BookMark :" +bookMark);
	
	}
	public static void main(String [] args){
	

		Book1 book=new Book1("RidingACycle","HavingAFlatTire","SmoothAndWellMaintained","CareAndAttension",true,"MotionOfCycle");
		book.displayBook1();
		Book1.reading();
		Book1.writting();
		Book1.bookMarking();
	
	}	

}



	
	
		
