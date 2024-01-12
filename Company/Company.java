public class Company{
	String companyType;
	String companyName;
	Employee employee;
	Manager manager;
	
	void jobs()
	{
		System.out.println("Company provide jobs");
	}
	void giveSalary(){
		System.out.println("It gives salary");
	}
	Company()
	{
		
	}
	Company(String companyType,String companyName,Employee employee,Manager manager){
		this.companyType=companyType;
		this.companyName=companyName;
		this.employee=employee;
		this.manager=manager;
	}

}