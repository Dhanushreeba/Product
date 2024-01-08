public class HeadPhones{
	String brand;
	boolean onHead;
	boolean ofHead;
	int volumeHigh;
	int volumeLow;
	boolean tangled;
	
	static void Listening(){
		System.out.println("listening to music");
	}
	static void Adjusting(){
		System.out.println("adjusting headphones");
	}
	static void Storing(){
		System.out.println("storing planty songs");
	}
	
	
	 HeadPhones(String brand,boolean onHead,boolean ofHead,int volumeHigh,int volumeLow,boolean tangled){
	
		this.brand=brand;
		this.onHead=onHead;
		this.ofHead=ofHead;
		this.volumeHigh=volumeHigh;
		this.volumeLow=volumeLow;
		this.tangled=tangled;
	
	}
	public void displayHeadPhones(){
			System.out.println("Brand :" +brand);
			System.out.println("OnHead :" +onHead);
			System.out.println("OfHead :" +ofHead);
			System.out.println("VolumeHigh :" +volumeHigh);
			System.out.println("VolumeLow :" +volumeLow);
			System.out.println("Tangled :" +tangled);
	
	}
	public static void main(String [] args){
	

		HeadPhones HP=new HeadPhones("Boat",true,false,89,35,true);
		HP.displayHeadPhones();
		HeadPhones.Storing();
		HeadPhones.Adjusting();
		HeadPhones.Listening();
	
	}	

}



	
	
		
