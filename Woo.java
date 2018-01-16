
import java.util.Scanner;
public class Woo
{
    //Initialization of Game

    private static boolean game = true;
    private static int turn;
    
    //GameMode: Player v. Computer or Player v. Player
    private static int[][] board = new int[6][7];

    //Defualt Constructors
    private Woo(){
	turn = 0;
    }
    
    //Game Representation
    public static String toString2()
    {
	String boardRep = " |";
	for (int x = 0; x < 6; x++)
	    {
		for (int y = 0; y < 7; y++)
		    {
		        boardRep += board [x][y] + "|";
		    }

		boardRep += "\n |";
	    }
	return  boardRep.substring(0, boardRep.length() - 1);
    }

    public static boolean horizontalWin(){
	for(int x = 5; x > 0; x--){
	    for(int y = 0; y < 3; y++){
		if(board[x][y] == 0){
		    return false;
		}
		else{
		    if((board[x][y] == board[x][y + 1]) && (board[x][y + 1] == board[x][y + 2]) && (board[x][y + 2] == board[x][y + 3])){
			return true;
		    }
		}
	    }
	}
	return false;
    }
	
    public static boolean verticalWin(){
	for(int x = 5; x > 0; x--){
	    for(int y = 0; y < 3; y++){
		if(board[x][y] == 0){
		    return false;
		}
		else{
		    if((board[x][y] == board[x - 1][y]) && (board[x - 1][y] == board[x - 2][y]) && (board[x - 2][y] == board[x - 3][y])){
			return true;
		    }
		}
	    }
	}
	return false;
    }
    /*
    public static boolean diagonalRightWin(){
	for(int x = 0; x < 2; x++){
	    for(int y = 0; y < 6; y++){
		if((board[x][y] == board[x + 1][y + 1]) && (board[x + 1][y + 1] == board[x + 2][y + 2]) && (board[x + 2][y + 2] == board[x + 3][y + 3])){
		    return true;
		}
	    }
	}
	return false;
    }

    public static boolean diagonalLeftWin(){
	for(int x = 0; x < 2; x++){
	    for(int y = 0; y < 6; y++){
		if((board[x][y] == board[x][y + 1]) && (board[x][y + 1] == board[x][y + 2]) && (board[x][y + 2] == board[x][y + 3])){
		    return true;
		}
	    }
	}
	return false;
    }
    */
    public static boolean winConditionMet(){
	if(horizontalWin() || verticalWin()){
	    return true;
		}
	return false;
    }
    
    //User inputs
    public static void userUpdate(int column, int player){
	//takes the column from user imput and updates the board according to the number of the player

	if (column > 7 || column < 0){
	    column = 0;
	}
        for(int x = 5; x >= 0; x--){
	    if(board[x][column - 1] == 0){
		board[x][column - 1] = player;
		turn += 1;
		if(winConditionMet() && (board[x][column - 1] == player) && (turn > 3)){
		    System.out.println("Player " + player + " wins!");
		    System.exit(0);
		}
		break;
	    }
	}
	//ends the game in a draw if the board is filled and there is no victor
	if(turn == 42){
	    System.out.println("The game is a tie. Better luck next time!");
	    System.exit(0);
	}
    }

    //main
    public static void main(String [] args)
    {
	System.out.println(" Clean Baord");
	System.out.println(toString2());

	while (game == true)
	    {
		System.out.println("New Game");
		System.out.println(toString2());
		System.out.println("Turn: Player One \n Enter a column number:");
		Scanner sc = new Scanner( System.in);
		int input_1 = sc.nextInt();
		userUpdate(input_1 , 1);
		System.out.println(toString2());
		System.out.println("Turn: Player Two \n Enter a column number:");
		int input_2 = sc.nextInt();
		userUpdate(input_2 , 2);
		System.out.println(toString2());

	    }
    }
}

