
import java.util.Scanner;
public class Woo
{
    //Initialization of Game

    public static boolean game = true;
    public static int turn;
    
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
 
    
    //User inputs
    public static void userUpdate ( int column , int player)
    {
	//takes the column from user imput and updates the board according to the number of the player
	
        for(int x = 5; x >= 0; x--){
	    if(board[x][column - 1] == 0){
		board[x][column - 1] = player;
		turn += 1;
		break;
	    }
	}
	if(turn == 42){
	    System.out.println("The game is a tie. Better luck next time!");
	    game = false;
	}
    }


    //Victory Checker
    


    //AI


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
