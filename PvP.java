import java.util.Scanner;
public class PvP extends Woo
{
    public static void main (String [] args)
    {
		while (game == true)
	    {
		System.out.println("New Game");
		System.out.println(toString2());
		System.out.println("Turn: Player One \n Enter a column number:");
		Scanner sc = new Scanner( System.in);
		int input_1 = sc.nextInt();
		while(input_1< 0 || input_1 > 7){
		    System.out.print("Invalid Number. Try again fool. \n");
		    input_1 = sc.nextInt();
		}
		userUpdate(input_1 , 1);
		System.out.println(toString2());
		System.out.println("Turn: Player Two \n Enter a column number:");
		int input_2 = sc.nextInt();
		userUpdate(input_2 , 2);
		System.out.println(toString2());

	    }
    }
}
