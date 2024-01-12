public class Data{
	boolean isProvidingSecurityData;
	int financialData;

	Data(boolean isProvidingSecurityData,int financialData){
		this.isProvidingSecurityData=isProvidingSecurityData;
		this.financialData=financialData;
	}
	Data(){
		
	}
	void giveData(){
		System.out.println("give data");
	}
	void maitenance(){
		System.out.println("maintain information");
	}
}