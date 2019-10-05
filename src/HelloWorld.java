import java.util.Random;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		System.out.println(rollDice());
	}
// returns a random int between 1 and 6
	private static int rollDice()
	{
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}
}
