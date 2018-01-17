import java.util.Scanner;
public class PvE extends Woo
{
    public static int ai;
    public static void set_ai(int ai_option)
    {
	if (ai_option == 1)
	    {
		ai =1;
	    } else if (ai_option == 2)
	    {
	ai = 2;
	    } else
	    {
		System.out.println("Please Enter a Valid number");
		main(null);
	}
    }
    public static void main (String [] args)
    {
        int turn = 0;
	while (game == true)
	    {
		System.out.println("Turn " + turn);
		System.out.println(toString2());
		System.out.println("Your Turn \n Enter a column number:");
		Scanner sc = new Scanner( System.in);
		int input_1 = sc.nextInt();
		userUpdate(input_1 , 1);
		System.out.println(toString2());
		System.out.println("The AI Has Made It's move!");
		int input_2;
		if (ai == 1)
		    {
			input_2 = AI_Intermediate.move();
		    } else {
		    input_2 = AI_Master.move();
		}
		
		userUpdate(input_2 , 2, "AI");
		System.out.println(toString2());
		turn++;

	    }
    }
}
