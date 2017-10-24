import java.util.Random;

public class Hobbit extends Character {

  public Hobbit() {
      super(3, 0);
  }

  @Override
  public int kick(Character chacter) {
    System.out.println("Hobbit Cry");
    return 0;
  }

  public String toString() { 
      return "Hobbit Power: " + this.power + " HP:" + this.hp;
  } 
}
