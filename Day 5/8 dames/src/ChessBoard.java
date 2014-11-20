
public interface ChessBoard {
	
	int boardCount();
	/** Counts the number of boards in the list*/
		
	void addBoard(ChessBoard newboard);
	/** adds a newboard to thelist*/
	
	ChessBoard getNext();
	/** returns the next board in the list*/
	
	boolean isValid();
	/**Checks if the board is a valid 8 dames entry*/
	
	void generateBoards();
	/** generates all boards*/
	
	void removeBoard();
	/** removes a board from the list*/
	
	
}
