public class Accounting{
	String payrollProcessing;
	String auditSupport;
	
	Accounting(){
		
	}
	Accounting(	String payrollProcessing,String auditSupport){
		this.payrollProcessing=payrollProcessing;
		this.auditSupport=auditSupport;
	}
	void accountMaintanance(){
		System.out.println("maintain accounts");
	}
	void finance(){
		System.out.println("financial maintainance");
	}

}