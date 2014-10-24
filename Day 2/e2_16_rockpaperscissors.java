import java.util.Scanner;
public class e2_16_rockpaperscissors
{
		private static Scanner scanner=new Scanner(System.in); static{scanner.useDelimiter(System.getProperty("line.separator"));}
	public static void main(String[] args)
	{
//Rock Paper Scissors

int player1score = 0;
int player2score = 0;
int draws = 0;
String play = "";
char player1play = ' ';
char player2play = ' ';
int winner = 0;

System.out.println("Welcome to Paper Scissor rock!");

while (player1score != 3 &&
       player2score != 3){
	System.out.println ("Enter your play!");
	
	//reads play and separate sout
	play = System.console().readLine().toLowerCase();
	player1play = play.charAt(0);
	player2play = play.charAt(1);
	
	
	//determines the winner
	
	if (player1play == player2play){
		winner = 0;
	}else if ((player1play == 'r' && player2play == 's') ||
		  (player1play == 's' && player2play == 'p') ||
		  (player1play == 'p' && player2play == 's')){
		winner = 1;
	}else { winner = 2;
	}
	
	//Displays results
	
	if (winner == 0){
		System.out.println("It's a draw!");
	}else{
		System.out.println("Player " + winner + "wins!");
	
	//adds to appropriate scores
		switch (winner) {
			case 0: draws ++;
				break;
			case 1: player1score ++;
				break;
			case 2: player2score ++;
				break;
		}
	}
	
	System.out.println("The scores stand at:");
	System.out.println("Player 1: " + player1score);
	System.out.println("Player 2: " + player2score);
	System.out.println("Draws: " + draws);
	System.out.println("");
}

System.out.println("");
System.out.println("The winner is " + winner + "!");
	
	
	
	
}}

