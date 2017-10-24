
public class GameManager {

  public void start()
  {
    Character left = CharacterFactory.createCharacter();
    Character right = CharacterFactory.createCharacter();
    fight(left, right);
  }
  public void fight(Character left, Character right)
  {
      System.out.println("Fight between");
      System.out.println("In left corner " + left.toString());
      System.out.println("In right corner " + right.toString());
      int counter = 1;
      while (left.hp > 0 && right.hp > 0 && counter < 20)
      {
        System.out.println("________________________________");
        System.out.println("Round " + Integer.toString(counter));
        left.kick(right);
        right.kick(left);
        System.out.println("In left corner " + left.toString());
        System.out.println("In right corner " + right.toString());
        System.out.println("________________________________");
        counter = counter + 1;
      }  
      if (counter == 20) 
      {
        System.out.println("They died from meteorite");
        System.exit(0);
      }
      if (left.hp > 0 && right.hp <= 0)
      {
        System.out.println("Won left");
        System.exit(0);
      }
      else if (left.hp <= 0 && right.hp > 0)
      {
        System.out.println("Won right");
        System.exit(0);
      }
      else
      {
        System.out.println("They all dead");
        System.exit(0);
      } 
  }
}