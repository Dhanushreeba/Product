public class Quality{
	boolean doesTeamWork;
	boolean haveTechnicalProficiancy;
	
	Quality(){
		
	}
	Quality(boolean doesTeamWork,boolean haveTechnicalProficiancy){
		this.doesTeamWork=doesTeamWork;
		this.haveTechnicalProficiancy=haveTechnicalProficiancy;
	}
	void leadership(){
		System.out.println("leadership quality");
	}
	void timeManagement(){
		System.out.println("managing time");
	}
}