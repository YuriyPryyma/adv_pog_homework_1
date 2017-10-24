import java.util.Random;

public class Knight extends Character {

  public Knight() {
  	super(0, 0);
  	Random rand = new Random();
	this.hp = rand.nextInt(10) + 2;
	this.power = rand.nextInt(10) + 2;
  }

  @Override
  public int kick(Character chacter) {
    chacter.hp = chacter.hp - this.power;
    System.out.println("King kicks " + Integer.toString(this.power) + " dmg" );
    return 0;
  }
  public String toString() { 
      return "Knight Power: " + this.power + " HP:" + this.hp;
  } 
}
