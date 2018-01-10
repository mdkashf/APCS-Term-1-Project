public class Woo
{
    //Initialization of Game
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
    public static void userUpdate ( int rows , int player)
    {
	//takes the column from user imput and updates the board according to the number of the player

	
	int colm = 0;

	while ( board [colm][rows] == 0 && rows < 4 )
	    {
		    
		colm++;
		       
	    }
	    
	board [colm][rows] = player;
    }


    //Victory Checker


    //AI


    //main
    public static void main(String [] args)
    {
	System.out.println(" Clean Baord");
	System.out.println(toString2());

	System.out.println("User Input Test");
	userUpdate( 2 , 1);
	System.out.println(toString2());
    }
}
