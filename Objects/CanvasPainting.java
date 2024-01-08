public class CanvasPainting{
	String blank;
	String inProgress;
	String stretched;
	String rolledUp;
	String stained;
	boolean finished;
	
	static void painting(){
		System.out.println("painting is an art");
	}
	static void storing(){
		System.out.println("storing the paint");
	}
	static void displaying(){
		System.out.println("the art is ready to display");
	}
	
	
	 CanvasPainting(String blank,String inProgress,String stretched,String rolledUp,String stained,boolean finished){
	
		this.blank=blank;
		this.inProgress=inProgress;
		this.stretched=stretched;
		this.rolledUp=rolledUp;
		this.stained=stained;
		this.finished=finished;
	
	}
	public void displayCanvasPainting(){
			System.out.println("Blank :" +blank);
			System.out.println("InProgress :" +inProgress);
			System.out.println("Stretched :" +stretched);
			System.out.println("RolledUp :" +rolledUp);
			System.out.println("Stained :" +stained);
			System.out.println("Finished :" +finished);
	
	}
	public static void main(String [] args){
	

		CanvasPainting paint=new CanvasPainting("NoPainting","Coloring","ReadyToDisplay","BreakForFewMinutes","CreativeStoryTelling",true);
		paint.displayCanvasPainting();
		CanvasPainting.painting();
		CanvasPainting.storing();
		CanvasPainting.displaying();
	
	}	

}



	
	
		
