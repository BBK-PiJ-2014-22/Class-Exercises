//Strategy:
//Generate all possible boards 
//(Possibly: with restrictions. E.g. No need to generate ones with 2 on the same row/column
// Check each possibility to see if it is valid
// if valid add it to the 

//Need: 
//Board Class
//int[8][8] ; boolean valid ; board nextBoard
//Methods: print ; isValid
//
//Algorithm:
//Check square. 
// If square == 1 then:
// Check if any threatened square are 1
// if not






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