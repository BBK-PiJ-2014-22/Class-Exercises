
public class ArrayChessBoard implements ChessBoard {

	int[][] board = new int[8][8];
	ChessBoard nextBoard;
	
	@Override
	public int boardCount() {
		if (this.nextBoard == null){
			return 1;
		}else{
			return this.getNextBoard().boardCount()+1;
		}
	}
	
	@Override
	public void addBoard(ArrayChessBoard newBoard) {
		if (this.getNextBoard() == null){
			this.getNextBoard().setNextBoard(newBoard);
		}else{
			this.getNextBoard().addBoard(newBoard);
		}
	}
	
	public void removeBoard(){
		if (this.)
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

	public void setNextBoard(ChessBoard newBoard){
		this.nextBoard = newBoard;
	}
	@Override
	public ChessBoard getNext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void generateBoards() {
		// TODO Auto-generated method stub

	}
	

	
	public void setNext(){
		
	}

}
