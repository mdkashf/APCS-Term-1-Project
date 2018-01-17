
import java.util.Scanner;
public class Woo
{
    //Initialization of Game

    public static boolean game = true;
    public static int turn;
    
    //GameMode: Player v. Computer or Player v. Player
    public static String[][] board = new String[6][7];

    //Defualt Constructors
    public Woo(){
	turn = 0;
    }
    
    //Game Representation
    public static String toString2()
    {
	String boardRep = " |";
	for(int a = 0; a < 6; a++){
	    for(int b = 0; b < 7; b++){
		if(board[a][b] == null){
		    board[a][b] = " ";
		}
	    }
	}
	    
	for (int x = 0; x < 6; x++)
	    {
		for (int y = 0; y < 7; y++)
		    {
		        boardRep += board[x][y] + "|";
		    }

		boardRep += "\n |";
	    }
	boardRep = boardRep.substring(0, boardRep.length() - 1);
	boardRep += " 1 2 3 4 5 6 7 ";
	return boardRep.substring(0, boardRep.length() - 1);
    }

    public static String cashCoders(int player){
	if (player == 1){
	    return "$";
	}
	return "C";
    }
    
        //checks for horizontal victory
    public static boolean horizontalWin(int player){
	for(int x = 5; x > 0; x--){
	    for(int y = 0; y < 4; y++){
		if(board[x][y].equals(cashCoders(player))){
		    if((board[x][y].equals(board[x][y + 1])) && (board[x][y + 1].equals(board[x][y + 2])) && (board[x][y + 2].equals(board[x][y + 3]))){
			return true;
		    }
		}
	    }
	}
	return false;
    }

    //checks for vertical victory
    public static boolean verticalWin(int player){
	for(int x = 5; x > 3; x--){
	    for(int y = 0; y < 7; y++){
		if(board[x][y].equals(cashCoders(player))){
		    if((board[x][y] == board[x - 1][y]) && (board[x - 1][y] == board[x - 2][y]) && (board[x - 2][y] == board[x - 3][y])){
			return true;
		    }
		}
	    }
	}
	return false;
    }

    //checks for diagonal victory via linear growth
    public static boolean diagonalGrowthWin(int player){
	for(int x = 5; x > 3; x--){
	    for(int y = 0; y < 4; y++){
		if(board[x][y].equals(cashCoders(player))){
		    if((board[x][y] == board[x - 1][y + 1]) && (board[x - 1][y + 1] == board[x - 2][y + 2]) && (board[x - 2][y + 2] == board[x - 3][y + 3])){
			return true;
		    }
		}
	    }
	}
	return false;
    }

    //checks for diagonal victory via linear decay
    public static boolean diagonalDecayWin(int player){
	for(int x = 5; x > 3; x--){
	    for(int y = 6; y > 2; y--){
		if(board[x][y].equals(cashCoders(player))){
		    if((board[x][y] == board[x - 1][y - 1]) && (board[x - 1][y - 1] == board[x - 2][y - 2]) && (board[x - 2][y - 2] == board[x - 3][y - 3])){
		    return true;
		    }
		}
	    }
	}
	return false;
    }

    //amalgamates all the winning conditions
    public static boolean winConditionMet(int player){
	if(horizontalWin(player) || verticalWin(player) || diagonalGrowthWin(player) || diagonalDecayWin(player)){
	    return true;
		}
	return false;
    }



    
    //User inputs
    public static void userUpdate(int column, int player){
	//takes the column from user imput and updates the board according to the number of the player
	
        for(int x = 5; x >= 0; x--){
	    if(board[x][column - 1] == " "){
		if (player == 1){
		    board[x][column - 1] = "$";
		}
		if (player == 2){
		    board[x][column - 1] = "C";
		}
		turn += 1;
		if(winConditionMet(player)){
		    System.out.println(toString2());
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
    //Prompt
    public static int  invalids = 0;

    //main
    public static void main(String [] args)
    {
	if (invalids == 0)
	    {
	    System.out.println("~~~WELCOME TO CONNECT FOUR ~~~ \n Please Choose One of the Following Options \n \n");
	    }
	System.out.println("1) PvP - Two player mode \n2) PvE - Player varsus Computer mode");
	Scanner sc = new Scanner( System.in);
	int option = sc.nextInt();
	if (option == 1)
	    {	
	PvP.main(null);
	    }
	else if (option == 2){
	    System.out.println("WORK IN POGRESS");
	} else
	    {
		System.out.println( "ENTER A VALID OPTION");
		invalids++;
		main(null);
	    }

	
    }
}



