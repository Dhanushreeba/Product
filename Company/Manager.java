public class Manager{

	int noOfEmployees;
	String gmail;
	
	void maintainance(){
		System.out.println("Maintaining all the work");
	}
	void leading(){
		System.out.println("Lead the employees");
	}
	Manager(){
		
	}
	Manager(int noOfEmployees,String gmail){
		this.noOfEmployees=noOfEmployees;
		this.gmail=gmail;
	}
}