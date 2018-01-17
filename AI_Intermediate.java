import java.util.Random;
public class AI_Intermediate extends PvE
{
    public static int move(){
	Random rand = new Random();
	return rand.nextInt(7) + 1;
    }

    public static void main (String [] args){
	//test
	System.out.println(move());
    }
}
