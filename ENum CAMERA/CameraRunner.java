public class  CameraRunner{
	
	String brandName;
	int price;
	float resolution;
	CameraType type1;
	BatteryType type2;
	ChargingType type3;
	DisplayType type4;
	int modelYear;
	String[] features;
	
	CameraRunner(){
		System.out.println("no param");
	}


	CameraRunner(String brandName,int price,float resolution,CameraType type1,BatteryType type2,ChargingType type3,DisplayType type4,int modelYear,String[] features){
		
		this.brandName=brandName;
		this.price=price;
		this.type1=type1;
		this.type2=type2;
        this.type3=type3;
		this.type4=type4;
		this.modelYear=modelYear;
		this.features=features;
	
	}
	public void displayCameraDetails(){
		
		System.out.println("Camera BrandName:" +brandName);
		System.out.println("Camera Price:" +price);
		System.out.println("Camera cameraType:" +type1);
		System.out.println("Camera batteryType:" +type2);
		System.out.println("Camera chargingType:" +type3);
		System.out.println("Camera displayType:" +type4);
		System.out.println("Camera ModelYear:" +modelYear);
		System.out.println("Features:");
		
	}
}