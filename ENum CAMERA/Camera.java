public static void main(String[] args){
		
		String[] features = {"Resolution","GPS"};
		CameraRunner camera=new CameraRunner("CANON",40000,45.6f,CameraType.MIRRORLESS,BatteryType.REMOVABLE,ChargingType.USB,DisplayType.LED,2021,features);
		camera.displayCameraDetails();
		
		switch (camera.type1){
			case MIRRORLESS:
				System.out.println("Camera type is MIRRORLESS ");
				break;
			case CINEMACAMERA:
				System.out.println("Camera type is CINEMACAMERA");
				break;
			case DIGITALSLRCAMERA:
				System.out.println("Camera type is DIGITALSLRCAMERA");
				break;
		}
		
	}