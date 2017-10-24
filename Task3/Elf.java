import java.util.Random;

public class Elf extends Character {

  public Elf() {
      super(10, 10);
  }

  @Override
  public int kick(Character chacter) {
    
    if (chacter.power < this.power)
   	{
   		chacter.hp = 0;
   		System.out.println("Elf kills his opponent" );
   	}
   	else
   	{
   		chacter.power = chacter.power -1;
   		System.out.println("Elf kicks weaks his opponent");
   	}
    
    return 0;
  }
  public String toString() { 
      return "Elf Power: " + this.power + " HP:" + this.hp;
  } 
}
