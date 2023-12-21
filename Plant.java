public class Plant{
	
	String plantName;
	String scientificName;
	int thickness;
	

    Plant(){
		this("Grass");
		System.out.println("having no parameters");
		
		
	}
	Plant(String plantName){
		this(26,"Grass","poaceae");
		System.out.println(plantName);
		
	}
	Plant(int thickness,String plantName,String scientificName){
		System.out.println(thickness);
		System.out.println(scientificName);
		
	}
	Plant(String scientificName,String plantName){
		this("poaceae");
		System.out.println(scientificName);
		
		
		
	}
	Plant(String plantName,String scientificName,int thickness){
		
		this.plantName=plantName;
    	this.scientificName=scientificName;
		this.thickness=thickness;
	    
		
	}
	


public static void main(String[] args){
	
	Plant Plant=new Plant();
	
	
	
}

}