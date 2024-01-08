public class Puzzle{
	String inProgress;
	String missingPieces;
	String scatteredPieces;
	String fresh;
	String wornOut;
	boolean completed;
	
	static void solving(){
		System.out.println("solving the puzzle");
	}
	static void sorting(){
		System.out.println("sorting the game");
	}
	static void storing(){
		System.out.println("storing the puzzle");
	}
	
	
	 Puzzle(String inProgress,String missingPieces,String scatteredPieces,String fresh,String wornOut,boolean completed){
	
		this.inProgress=inProgress;
		this.missingPieces=missingPieces;
		this.scatteredPieces=scatteredPieces;
		this.fresh=fresh;
		this.wornOut=wornOut;
		this.completed=completed;
	
	}
	public void displayPuzzle(){
			System.out.println("InProgress :" +inProgress);
			System.out.println("MissingPieces :" +missingPieces);
			System.out.println("ScatteredPieces :" +scatteredPieces);
			System.out.println("Fresh :" +fresh);
			System.out.println("WornOut :" +wornOut);
			System.out.println("Completed :" +completed);
	
	}
	public static void main(String [] args){
	

		Puzzle puzz=new Puzzle("PiecesAreComingTogether","GapInThePuzzle","WaitingToBeOrganized","UnTouched","AssembliesAndDisAssemblies",false);
		puzz.displayPuzzle();
		Puzzle.solving();
		Puzzle.sorting();
		Puzzle.storing();
	
	}	

}



	
	
		
