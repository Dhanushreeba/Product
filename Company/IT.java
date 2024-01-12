public class IT extends Company{
	String projectManagementTools;
	boolean iscyberSecurity;
	Software software;
	Data data;
	
	void recruits(){
		System.out.println("Recruits new pepole");
	}
	void collaboration(){
		System.out.println("Collaborates with other companies");
	}
	IT(){
		
	}
	IT(String projectManagementTools,boolean iscyberSecurity,Software software,Data data){
		this.projectManagementTools=projectManagementTools;
		this.iscyberSecurity=iscyberSecurity;
		this.software=software;
		this.data=data;
	}

}