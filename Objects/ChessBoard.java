public class ChessBoard{
	String setUp;
	String inPlay;
	String checkMate;
	String piecesScattered;
	String playingNew;
	String worn;
	
	static void Playing(){
		System.out.println("Playing chess");
	}
	static void Resetting(){
		System.out.println("setting chessboard");
	}
	static void Analyzing(){
		System.out.println("analyzing game strategy");
	}
	
	
	 ChessBoard(String setUp,String inPlay,String checkMate,String piecesScattered,String playingNew,String worn){
	
		this.setUp=setUp;
		this.inPlay=inPlay;
		this.checkMate=checkMate;
		this.piecesScattered=piecesScattered;
		this.playingNew=playingNew;
		this.worn=worn;
	
	}
	public void displayChessBoard(){
			System.out.println("SetUp :" +setUp);
			System.out.println("InPlay :" +inPlay);
			System.out.println("CheckMate :" +checkMate);
			System.out.println("PiecesScattered :" +piecesScattered);
			System.out.println("PlayingNew :" +playingNew);
			System.out.println("Worn :" +worn);
	
	}
	public static void main(String [] args){
	

		ChessBoard chess=new ChessBoard("Order","Strategy","Defeat","Opportunity","Beginning","Experience");
		chess.displayChessBoard();
		ChessBoard.Playing();
		ChessBoard.Resetting();
		ChessBoard.Analyzing();
	
	}	

}



	
	
		
