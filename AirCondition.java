public class AirCondition{
    
	public static void main(String[] args){
        AirConditioner AC =new AirConditioner("LG",2,"White",34500,true,1);
		AC.display();
		System.out.println("---------------------");
		
        AirConditioner AC1=new AirConditioner("Samsung",4,"Black",35000,false);
		AC1.display();
		System.out.println("---------------------");
		
        AirConditioner AC2=new AirConditioner("Panasonic",1,"Blue",34500);
		AC2.display();
		System.out.println("---------------------");
		
        AirConditioner AC3=new AirConditioner("BlueStar",3,"Gold");
		AC3.display();
		System.out.println("---------------------");
		
        AirConditioner AC4=new AirConditioner("Hitachi",2);
		AC4.display();
		System.out.println("---------------------");
		
        AirConditioner AC5=new AirConditioner("Voltas");
		AC5.display();
		
    		
	
	
	}

}