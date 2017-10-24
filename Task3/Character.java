

public abstract class Character {
	public int  hp;
	public int  power;

	public 	Character (int _hp, int _power) {
      this.hp = _hp;
      this.power = _power;
  	}
 	abstract public int kick(Character chacter);
}
