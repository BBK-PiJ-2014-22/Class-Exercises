
public class ChessBoard{

	int[][] board = new int[8][8];
	ChessBoard nextBoard;
	ChessBoard lastBoard;
	
	public ChessBoard(){
		
	}
	
	public ChessBoard(int x, int y){
		
	}
	
	
	public int boardCount() {
		if (this.nextBoard == null){
			return 1;
		}else{
			return this.getNextBoard().boardCount()+1;
		}
	}
	
	public void addBoard(ChessBoard newBoard) {
		if (this.getNextBoard() == null){
			this.nextBoard = newBoard;
			this.nextBoard.lastBoard = this;
		}else{
			this.getNextBoard().addBoard(newBoard);
		}
	}
	
	public void removeBoard(){
		this.lastBoard.nextBoard = this.nextBoard;
	}
	
	
	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

	public ChessBoard getNextBoard() {
		return nextBoard;
	}

	private void setNextBoard(ChessBoard newBoard){
		this.nextBoard = newBoard;
	}

	public ChessBoard getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}


	public void generateBoards() {
		// TODO Auto-generated method stub

	}
	

	
	public void setNext(){
		
	}

}
