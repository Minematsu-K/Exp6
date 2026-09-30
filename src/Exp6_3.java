

public class Exp6_3 {

	public static void main(String[] args) {
		
		Hero hero1=new Hero();
		
		hero1.name="ヨシヒコ";
		hero1.hp=7;
		hero1.mp=2;
		hero1.attackPower=12;
		
		hero1.introduce();
		hero1.encourage();
		hero1.showStatus();
		hero1.attack();
		hero1.magicAttack();
		hero1.levelUp();
		
		hero1.changeName();
		hero1.showStatus();
		
	}
}
