import java.util.Random;
public class AI_Master extends PvE
{
    public static int move() {
        Random rand = new Random();
	return rand.nextInt(6) + 2;
    }
}
