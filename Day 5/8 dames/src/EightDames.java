
public class EightDames {

	public int[][] board;
	
	public EightDames(){
		board = new int[8][8];
	}
	
	public EightDames(int x, int y){
		board = new int[8][8];
		board[x][y] = 1;
	}	
	
	
	public boolean canTakeRight(int x, int y){		
		if (this.board[x][y] == 1){
			return true;
		}else if(x == 7){
			return false;
		}else{
			return canTakeRight(x+1, y);
		}	
	}
	
	public boolean canTakeLeft(int x, int y){		
		if (this.board[x][y] == 1){
			return true;
		}else if(x == 0){
			return false;
		}else{
			return canTakeLeft(x-1, y);
		}	
	}

	public boolean canTakeHorizontal(int x, int y){
		if (canTakeRight(x, y) ||
			canTakeLeft(x,y)){
			return true;
		}else{
			return false;
		}
	}
}