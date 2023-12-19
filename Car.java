public class Car
{
    String brandName;
	String colour;
	int mileage;
	int engineCapacity;
	int noOfAirBags;
	int topSpeed;
	boolean havingAc;





 Car(String brandName,String colour,int mileage,int engineCapacity,int noOfAirBags,int topSpeed,boolean havingAc)
{
    this.brandName=brandName;
	this.colour=colour;
	this.mileage=mileage;
	this.engineCapacity=engineCapacity;
	this.noOfAirBags=noOfAirBags;
	this.topSpeed=topSpeed;
	this.havingAc=havingAc;
	




}
public static void main(String[] args)
{
    Car object=new Car("Kia","Brown",18,1482,6,167,true);

	
	System.out.println(object.brandName);
	System.out.println(object.colour);
	System.out.println(object.mileage);
	System.out.println(object.engineCapacity);
	System.out.println(object.noOfAirBags);
	System.out.println(object.topSpeed);
	System.out.println(object.havingAc);
	
	
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!");
	
	
	Car object1=new Car("Ferrari","Blue",8,6496,6,249,true);
	
	System.out.println(object1.brandName);
	System.out.println(object1.colour);
	System.out.println(object1.mileage);
	System.out.println(object1.engineCapacity);
	System.out.println(object1.noOfAirBags);
	System.out.println(object1.topSpeed);
	System.out.println(object1.havingAc);
	
	
    System.out.println("!!!!!!!!!!!!!!!!!!!!");
	
	
	Car object2=new Car("RollsRoyce","White",9,6749,8,250,true);
	
	System.out.println(object2.brandName);
	System.out.println(object2.colour);
	System.out.println(object2.mileage);
	System.out.println(object2.engineCapacity);
	System.out.println(object2.noOfAirBags);
	System.out.println(object2.topSpeed);
	System.out.println(object2.havingAc);
	
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!");
	
	
	Car object3=new Car("Mercedes-Benz","Black",23,1496,7,220,true);
	
	System.out.println(object3.brandName);
	System.out.println(object3.colour);
	System.out.println(object3.mileage);
	System.out.println(object3.engineCapacity);
	System.out.println(object3.noOfAirBags);
	System.out.println(object3.topSpeed);
	System.out.println(object3.havingAc);
	
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!");
	
	Car object4=new Car("BMW","NavyBlue",11,2988,6,235,true);
	
	System.out.println(object4.brandName);
	System.out.println(object4.colour);
	System.out.println(object4.mileage);
	System.out.println(object4.engineCapacity);
	System.out.println(object4.noOfAirBags);
	System.out.println(object4.topSpeed);
	System.out.println(object4.havingAc);
	
	
	System.out.println("!!!!!!!!!!!!!!!!!!!!");

}

}