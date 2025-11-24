
class Player{
	String nama;
	double health;
	int lavel;

	Weapon weapon;
	Armor armor;
	
	Player(String nama, double health){
		this.nama = nama;
		this.health = health;
	}

	void equipWeapon(Weapon weapon){
		this.weapon = weapon;
	}

	void equipArmor(Armor armor) {
		this.armor = armor;
	}

	void display(){
		System.out.println("Nama : " + this.nama);
		System.out.println("Health : " + this.health);
		this.weapon.display();
		this.armor.display();
	}
}

class Weapon{
	double attackPower;
	String nama;

	Weapon( String nama, double attackPower){
		this.attackPower = attackPower;
		this.nama = nama;
	}

	void display(){
		System.out.println("Weapon : " + this.nama);
		System.out.println("Power : " + this.attackPower );
	}

}

class Armor{
	double defencePower;
	String nama;

	Armor(String name, double defencePower){
		this.defencePower = defencePower;
		this.nama = name;
	}

	void display() {
		System.out.println("Armor : " + this.nama);
		System.out.println("Deffent : " + this.defencePower);
	}
}

public class Main {
	public static void main(String[] args) {
		// System.out.println("halo");

		Player player1 = new Player("Lynax", 100);
		Weapon pedang = new Weapon("pedang",10);
		Armor bajuBesi = new Armor("bajuBesi",10);

		player1.equipWeapon(pedang);
		player1.equipArmor(bajuBesi);
		player1.display();

		Player player2 = new Player("Lord", 100);
		Weapon karpet = new Weapon("karpet", 1);
		Armor baju = new Armor("baju", 1);

		player2.equipWeapon(karpet);
		player2.equipArmor(baju);
		player2.display();
	}
}
