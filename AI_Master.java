import java.util.Random;
public class AI_Master extends PvE
{
    public static int move() {
        String[] next_Move = new String [7];
	for (int x = 0; x < 6; x++)
	    {
		for (int y = 0; y < 4; y ++)
		    {
			next_Move[x]	= board[x][y];
		    }
	    }


	for (int z = 0; z < 6; z++)
	    {
		if (next_Move[z] == "C"){
		    return z;
		}
	    }
	return AI_Intermediate.move();
    }
}
