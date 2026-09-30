import java.util.Random;
import java.util.Scanner;

public class Hero {
	Random rand =new Random();
	Scanner sc=new Scanner(System.in);
	
	String name;
	int hp;
	int mp;
	int attackPower;
	
	void encourage() {
		System.out.println("今日も元気に魔王討伐！");
		System.out.println();
	}
	
	void introduce() {
		System.out.println("わたしは勇者"+name+"！");
	}
	
	void attack() {
		int damage=attackPower+5;
		System.out.println(name+" のこうげき！");
		System.out.println("あいてに"+damage+"ダメージをあたえた！");
		System.out.println();
	}
	
	void magicAttack() {
		boolean clear=rand.nextBoolean();
		
		if(mp>=2) {
			if(clear) {
				mp-=2;
				int damage=attackPower*3;
				System.out.println(name+" のまほうこうげき！");
				System.out.println("あいてに"+damage+"ダメージをあたえた！");
				System.out.println();
			}else {
				System.out.println(name+" のまほうこうげき！");
				System.out.println("しっぱいしてしまった...");
				System.out.println();
			}
		}else {
			System.out.println("MPが たりない...");
		}
	}
	
	void heal() {
		if(hp<=20) {
			hp+=10;
			System.out.println("HPが10かいふくした！");
		}else {
			System.out.println("これいじょう かいふくできない！");
		}
	}
	
	void levelUp() {
		System.out.println("レベルアップ！");
		hp+=5;
		mp+=2;
		attackPower+=3;
		
		System.out.println("HPが5あがった！");
		System.out.println("MPが2あがった！");
		System.out.println("こうげきが3あがった！");
		System.out.println();
	}
	
	void showStatus() {
		System.out.println("【現在のステータス】");
		System.out.println("なまえ："+name);
		System.out.println("HP："+hp);
		System.out.println("MP："+mp);
		System.out.println("こうげき："+attackPower);
		System.out.println();
	}
	
	void changeName() {
		System.out.print("変更後の名前を入力してください：");
		String name=sc.nextLine();
		this.name=name;
		System.out.println("名前を"+this.name+"に変更しました");
		System.out.println();
		
		sc.close();
	}
}
