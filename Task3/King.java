import java.util.Random;

public class King extends Character {

  public King() {
  	super(0, 0);
    Random rand = new Random();
	this.hp = rand.nextInt(10) + 5;
	this.power = rand.nextInt(10) + 5;
    
  }

  @Override
  public int kick(Character chacter) {
    chacter.hp = chacter.hp - this.power;
    System.out.println("King kicks " + Integer.toString(this.power) + " dmg" );
    return 0;
  }

  public String toString() { 
      return "King Power: " + this.power + " HP:" + this.hp;
  } 
}
