package star;

public class Dragoon extends Protoss{
	private String name;
	private int attack;
	private int hp;
	private int sh;
	
	public Dragoon(String name) {
		this.name = name;
		this.attack = 10;
		this.hp = 100;
		this.sh = 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getSh() {
		return sh;
	}

	public void setSh(int sh) {
		this.sh = sh;
	}
}
