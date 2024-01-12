public class Employee{
	int salary;
	int employeeId;
	
	void doesWork(){
		System.out.println("Employees does works");
	}
	void attendMeeting(){
		System.out.println("Employees attend meetings");
	}
	Employee(){
		
	}
	Employee(int salary,int employeeId){
		this.salary=salary;
		this.employeeId=employeeId;
	}

}