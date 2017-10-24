import java.util.Random;


public class CharacterFactory {
	public static Character createCharacter()
	{
		Random rand = new Random();
		int guess = rand.nextInt(4);
		if (guess == 0)
		{
			return new Hobbit();
		}
		else if (guess == 1)
		{
			return new King();
		}
		else if (guess == 2)
		{
			return new Knight();
		} 
		else
		{
			return new Elf();
		} 
	}
}