public class Camera{

public static void main(String[] args){
		
		String[] features = {"Resolution","GPS","Display","Storage"};
		CameraRunner c=new CameraRunner("CANON",40000,45.6f,CameraType.MIRRORLESS,BatteryType.REMOVABLE,ChargingType.USB,DisplayType.LED,2021,features);
		c.displayCameraDetails();
		
		
		for(int i=0;i<features.length;i++){
			System.out.println(features[i]);
		}
		
		
		
		switch (c.type1){
			case MIRRORLESS:
				System.out.println("Camera type is MIRRORLESS ");
				break;
			case COMPACTDIGITAL:
				System.out.println("Camera type is COMPACTDIGITAL ");
				break;
			case CINEMACAMERA:
				System.out.println("Camera type is CINEMACAMERA");
				break;
			case DIGITALSLRCAMERA:
				System.out.println("Camera type is DIGITALSLRCAMERA");
				break;
		}
		switch(c.type2){
			case REMOVABLE:
				System.out.println("Battery type is REMOVABLE");
				break;
			case LITHIUMBATTERIES:
				System.out.println("Battery type is LITHIUMBATTERIES");
				break;
			case ALKALINEBATTERIES:
					System.out.println("Battery type is ALKALINEBATTERIES");
					break;
			case RECHARGEABLELION:
					System.out.println("Battery type is RECHARGEABLELION");
					break;
		}
		switch(c.type3){
			case USB:
				System.out.println("Charging type is USB");
				break;
			case USBC:
				System.out.println("Charging type is USBC");
				break;
			case MICROUSB:
					System.out.println("Charging type is MICROUSB");
					break;
			case DCPOWERINPUT:
					System.out.println("Charging type is DCPOWERINPUT");
					break;
		}
		switch(c.type4){
			case LED:
				System.out.println("Display type is LED");
				break;
			case TOUCHSCREEN:
				System.out.println("Display type is TOUCHSCREEN");
				break;
			case FRONTANDREARSCREENS:
					System.out.println("Display type is FRONTANDREARSCREENS");
					break;
			case LCD:
					System.out.println("Display type is LCD");
					break;
		}
		
		System.out.println("---------------------------");
		
	CameraRunner c1=new CameraRunner("PANASONIC",35000,45.6f,CameraType.CINEMACAMERA,BatteryType.ALKALINEBATTERIES,ChargingType.MICROUSB,DisplayType.LCD,2021,features);
	c1.displayCameraDetails();	
	
	for(int i=0;i<features.length;i++){
			System.out.println(features[i]);
		}
		
		switch (c1.type1){
			case MIRRORLESS:
				System.out.println("Camera type is MIRRORLESS ");
				break;
			case COMPACTDIGITAL:
				System.out.println("Camera type is COMPACTDIGITAL ");
				break;
			case CINEMACAMERA:
				System.out.println("Camera type is CINEMACAMERA");
				break;
			case DIGITALSLRCAMERA:
				System.out.println("Camera type is DIGITALSLRCAMERA");
				break;
		}
		switch(c1.type2){
			case REMOVABLE:
				System.out.println("Battery type is REMOVABLE");
				break;
			case LITHIUMBATTERIES:
				System.out.println("Battery type is LITHIUMBATTERIES");
				break;
			case ALKALINEBATTERIES:
					System.out.println("Battery type is ALKALINEBATTERIES");
					break;
			case RECHARGEABLELION:
					System.out.println("Battery type is RECHARGEABLELION");
					break;
		}
		switch(c1.type3){
			case USB:
				System.out.println("Charging type is USB");
				break;
			case USBC:
				System.out.println("Charging type is USBC");
				break;
			case MICROUSB:
					System.out.println("Charging type is MICROUSB");
					break;
			case DCPOWERINPUT:
					System.out.println("Charging type is DCPOWERINPUT");
					break;
		}
		switch(c1.type4){
			case LED:
				System.out.println("Display type is LED");
				break;
			case TOUCHSCREEN:
				System.out.println("Display type is TOUCHSCREEN");
				break;
			case FRONTANDREARSCREENS:
					System.out.println("Display type is FRONTANDREARSCREENS");
					break;
			case LCD:
					System.out.println("Display type is LCD");
					break;
		}
		
	System.out.println("---------------------------");
		
	
	CameraRunner c2=new CameraRunner("NIKON",35000,23.7f,CameraType.COMPACTDIGITAL,BatteryType.RECHARGEABLELION,ChargingType.USB,DisplayType.TOUCHSCREEN,2023,features);
	c2.displayCameraDetails();
	
	for(int i=0;i<features.length;i++){
			System.out.println(features[i]);
		}
		
		switch (c2.type1){
			case MIRRORLESS:
				System.out.println("Camera type is MIRRORLESS ");
				break;
			case COMPACTDIGITAL:
				System.out.println("Camera type is COMPACTDIGITAL ");
				break;
			case CINEMACAMERA:
				System.out.println("Camera type is CINEMACAMERA");
				break;
			case DIGITALSLRCAMERA:
				System.out.println("Camera type is DIGITALSLRCAMERA");
				break;
		}
		switch(c2.type2){
			case REMOVABLE:
				System.out.println("Battery type is REMOVABLE");
				break;
			case LITHIUMBATTERIES:
				System.out.println("Battery type is LITHIUMBATTERIES");
				break;
			case ALKALINEBATTERIES:
					System.out.println("Battery type is ALKALINEBATTERIES");
					break;
			case RECHARGEABLELION:
					System.out.println("Battery type is RECHARGEABLELION");
					break;
		}
		switch(c2.type3){
			case USB:
				System.out.println("Charging type is USB");
				break;
			case USBC:
				System.out.println("Charging type is USBC");
				break;
			case MICROUSB:
					System.out.println("Charging type is MICROUSB");
					break;
			case DCPOWERINPUT:
					System.out.println("Charging type is DCPOWERINPUT");
					break;
		}
		switch(c2.type4){
			case LED:
				System.out.println("Display type is LED");
				break;
			case TOUCHSCREEN:
				System.out.println("Display type is TOUCHSCREEN");
				break;
			case FRONTANDREARSCREENS:
					System.out.println("Display type is FRONTANDREARSCREENS");
					break;
			case LCD:
					System.out.println("Display type is LCD");
					break;
		}
		
	System.out.println("---------------------------");
	
	CameraRunner c3=new CameraRunner("SONY",45000,50.6f,CameraType.DIGITALSLRCAMERA,BatteryType.ALKALINEBATTERIES,ChargingType.USBC,DisplayType.LED,2020,features);
	c3.displayCameraDetails();
	
	for(int i=0;i<features.length;i++){
			System.out.println(features[i]);
		}
		
		switch (c3.type1){
			case MIRRORLESS:
				System.out.println("Camera type is MIRRORLESS ");
				break;
			case COMPACTDIGITAL:
				System.out.println("Camera type is COMPACTDIGITAL ");
				break;
			case CINEMACAMERA:
				System.out.println("Camera type is CINEMACAMERA");
				break;
			case DIGITALSLRCAMERA:
				System.out.println("Camera type is DIGITALSLRCAMERA");
				break;
		}
		switch(c3.type2){
			case REMOVABLE:
				System.out.println("Battery type is REMOVABLE");
				break;
			case LITHIUMBATTERIES:
				System.out.println("Battery type is LITHIUMBATTERIES");
				break;
			case ALKALINEBATTERIES:
					System.out.println("Battery type is ALKALINEBATTERIES");
					break;
			case RECHARGEABLELION:
					System.out.println("Battery type is RECHARGEABLELION");
					break;
		}
		switch(c3.type3){
			case USB:
				System.out.println("Charging type is USB");
				break;
			case USBC:
				System.out.println("Charging type is USBC");
				break;
			case MICROUSB:
					System.out.println("Charging type is MICROUSB");
					break;
			case DCPOWERINPUT:
					System.out.println("Charging type is DCPOWERINPUT");
					break;
		}
		switch(c3.type4){
			case LED:
				System.out.println("Display type is LED");
				break;
			case TOUCHSCREEN:
				System.out.println("Display type is TOUCHSCREEN");
				break;
			case FRONTANDREARSCREENS:
					System.out.println("Display type is FRONTANDREARSCREENS");
					break;
			case LCD:
					System.out.println("Display type is LCD");
					break;
		}
		
	System.out.println("---------------------------");
		
	CameraRunner c4=new CameraRunner("PENTAX",65000,45.6f,CameraType.MIRRORLESS,BatteryType.REMOVABLE,ChargingType.DCPOWERINPUT,DisplayType.FRONTANDREARSCREENS,2022,features);
	c4.displayCameraDetails();
	
	for(int i=0;i<features.length;i++){
			System.out.println(features[i]);
		}
		
		switch (c4.type1){
			case MIRRORLESS:
				System.out.println("Camera type is MIRRORLESS ");
				break;
			case COMPACTDIGITAL:
				System.out.println("Camera type is COMPACTDIGITAL ");
				break;
			case CINEMACAMERA:
				System.out.println("Camera type is CINEMACAMERA");
				break;
			case DIGITALSLRCAMERA:
				System.out.println("Camera type is DIGITALSLRCAMERA");
				break;
		}
		switch(c4.type2){
			case REMOVABLE:
				System.out.println("Battery type is REMOVABLE");
				break;
			case LITHIUMBATTERIES:
				System.out.println("Battery type is LITHIUMBATTERIES");
				break;
			case ALKALINEBATTERIES:
					System.out.println("Battery type is ALKALINEBATTERIES");
					break;
			case RECHARGEABLELION:
					System.out.println("Battery type is RECHARGEABLELION");
					break;
		}
		switch(c4.type3){
			case USB:
				System.out.println("Charging type is USB");
				break;
			case USBC:
				System.out.println("Charging type is USBC");
				break;
			case MICROUSB:
					System.out.println("Charging type is MICROUSB");
					break;
			case DCPOWERINPUT:
					System.out.println("Charging type is DCPOWERINPUT");
					break;
		}
		switch(c4.type4){
			case LED:
				System.out.println("Display type is LED");
				break;
			case TOUCHSCREEN:
				System.out.println("Display type is TOUCHSCREEN");
				break;
			case FRONTANDREARSCREENS:
					System.out.println("Display type is FRONTANDREARSCREENS");
					break;
			case LCD:
					System.out.println("Display type is LCD");
					break;
		}
		
	System.out.println("---------------------------");	
	
	
	CameraRunner c5=new CameraRunner("OLYMPUS",65000,60.5f,CameraType.MIRRORLESS,BatteryType.RECHARGEABLELION,ChargingType.MICROUSB,DisplayType.TOUCHSCREEN,2023,features);
	c5.displayCameraDetails();
	
	for(int i=0;i<features.length;i++){
			System.out.println(features[i]);
		}
		
		switch (c5.type1){
			case MIRRORLESS:
				System.out.println("Camera type is MIRRORLESS ");
				break;
			case COMPACTDIGITAL:
				System.out.println("Camera type is COMPACTDIGITAL ");
				break;
			case CINEMACAMERA:
				System.out.println("Camera type is CINEMACAMERA");
				break;
			case DIGITALSLRCAMERA:
				System.out.println("Camera type is DIGITALSLRCAMERA");
				break;
		}
		switch(c5.type2){
			case REMOVABLE:
				System.out.println("Battery type is REMOVABLE");
				break;
			case LITHIUMBATTERIES:
				System.out.println("Battery type is LITHIUMBATTERIES");
				break;
			case ALKALINEBATTERIES:
					System.out.println("Battery type is ALKALINEBATTERIES");
					break;
			case RECHARGEABLELION:
					System.out.println("Battery type is RECHARGEABLELION");
					break;
		}
		switch(c5.type3){
			case USB:
				System.out.println("Charging type is USB");
				break;
			case USBC:
				System.out.println("Charging type is USBC");
				break;
			case MICROUSB:
					System.out.println("Charging type is MICROUSB");
					break;
			case DCPOWERINPUT:
					System.out.println("Charging type is DCPOWERINPUT");
					break;
		}
		switch(c5.type4){
			case TOUCHSCREEN:
				System.out.println("Display type is TOUCHSCREEN");
				break;
			case LED:
				System.out.println("Display type is LED");
				break;
			case FRONTANDREARSCREENS:
					System.out.println("Display type is FRONTANDREARSCREENS");
					break;
			case LCD:
					System.out.println("Display type is LCD");
					break;
		}
	}
	
}	