/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package lesson25_1;

public class HeroInfo{
	
	// フィールド変数
	private String name;
	private int hp;
	private int mp;
	private int attak;
	private int speed;
	private int defense;
	
	// Nameメソッド
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	// Hpメゾット
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	// Mpメゾット
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}
	
	// Attakメゾット
	public int getAttak() {
		return attak;
	}
	public void setAttak(int attak) {
		this.attak = attak;
	}
	
	// Speedメソッド
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	// Defenseメソッド
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defense) {
		this.defense = defense;
	}
	
}
