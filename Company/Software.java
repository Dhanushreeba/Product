public class Software {
	String softwareType;
	boolean isItSoftware;
	
	Software(){
		
	}
	
	Software(String softwareType,boolean isItSoftware){
		this.softwareType=softwareType;
		this.isItSoftware=isItSoftware;
	}
	void programming(){
		System.out.println("does programming");
	}
	void changeVersionsOfSoftware(){
		System.out.println("changes a version of software");
	}

}