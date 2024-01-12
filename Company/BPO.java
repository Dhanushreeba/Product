public class BPO extends Company{
	String communicationSkills;
	boolean timeManagment;
	Accounting accounting;
	Quality quality;
	
	void solvingProblems(){
		System.out.println("solves customer problems");
	}
	void task(){
		System.out.prntln("achive tasks");
	}
	BPO(String communicationSkills,boolean timeManagment,Accounting accounting,Quality quality){
		this.communicationSkills=communicationSkills;
		this.timeManagment=timeManagment;
		this.accounting=accounting;
		this.quality=quality;
	}
	BPO(){
		
	}

}