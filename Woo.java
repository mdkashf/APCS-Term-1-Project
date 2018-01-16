
import java.util.Scanner;
public class Woo
{
    //Initialization of Game

   public static boolean game = true;
    
    //GameMode: Player v. Computer or Player v. Player
    public static int[][] board = new int[5][5];

    //Game Representation
    public static String toString2()
    {
	String boardRep = " |";
	for (int x = 0; x < 5; x++)
	    {
		for (int y = 0; y< 5; y++)
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

	for(int x = 4; x >= 0; x--){
	    if(board[x][column - 1] == 0){
		board[x][column - 1] = player;
		break;
	    }
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
