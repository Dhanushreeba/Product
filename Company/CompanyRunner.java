public class CompanyRunner{

public static void main(String[] args){
	Employee employee=new Employee(40000,132);
	Manager manager=new Manager(154732,"xyz@gmail.com");
	Company company=new Company("Product","SAP",employee,manager);
	company.jobs();
	company.giveSalary();
	company.employee.attendMeeting();
	company.manager.leading();
	
	Software software=new Software("System Software",true);
	Data data=new Data(false,2300000);
	IT it=new IT("Asana",false,software,data);
	it.recruits();
	it.software.programming();
}
}