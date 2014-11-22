
public class eightDamesTest {

	public static void main(String[] args) {
	
		edTestTakeRight(0,1, 0,2,false,"takeRight test 1 failed");
		edTestTakeRight(0,1, 1,1,true,"takeRight test 2 failed");
		edTestTakeRight(3,2, 0,2,false,"takeRight test 3 failed");
		edTestTakeRight(7,2, 0,2,false,"takeRight test 4 failed");
		
		edTestTakeLeft(0,1, 0,2,false ,"takeLeft test 1 failed");
		edTestTakeLeft(0,1, 1,1,false,"takeLeft test 2 failed");
		edTestTakeLeft(3,2, 2,2,true,"takeLeft test 3 failed");
		edTestTakeLeft(0,0, 2,0,false,"takeLeft test 4 failed");
		
		edTestTakeHorizontal(0,1, 0,2,false ,"takeHorizontal test 1 failed");
		edTestTakeHorizontal(0,1, 1,1,true,"takeHorizontal test 2 failed");
		edTestTakeHorizontal(3,2, 2,2,true,"takeHorizontal test 3 failed");
		edTestTakeHorizontal(0,0, 2,0,true,"takeHorizontal test 4 failed");
		edTestTakeHorizontal(7,0, 2,0,true,"takeHorizontal test 5 failed");
		
		ChessBoard cb = new ChessBoard();
		
		cb.addBoard(new ChessBoard());
		cb.addBoard(new ChessBoard());
		cb.addBoard(new ChessBoard());
		
		System.out.println(cb.boardCount());
		
		System.out.println("Tests complete");
	}

	
	public static void edTestTakeRight(int x, int y, int x2, int y2, boolean expected, String message){
		EightDames ed = new EightDames(x2,y2);
		boolean result = ed.canTakeRight(x,y);
		
		if (result != expected){
			System.out.println(message);
		}
	}
	
	public static void edTestTakeLeft(int x, int y, int x2, int y2, boolean expected, String message){
		EightDames ed = new EightDames(x2,y2);
		boolean result = ed.canTakeLeft(x,y);
		
		if (result != expected){
			System.out.println(message);
		}
	}
	
	public static void edTestTakeHorizontal(int x, int y, int x2, int y2, boolean expected, String message){
		EightDames ed = new EightDames(x2,y2);
		boolean result = ed.canTakeHorizontal(x,y);
		
		if (result != expected){
			System.out.println(message);
		}
	}
}

