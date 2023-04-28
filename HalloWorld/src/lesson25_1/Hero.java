package lesson25_1;

// javaランダムインポート
import java.util.Random;

public class Hero {
	// 空のコンストラクタ生成
	public Hero () {

	}

	// フィールド変数より値を取ってhp,mp,攻撃力、素早さ、防御力
	// setterメゾット使用し、各ステータスにランダム値代入
	// printメゾットに値を返す処理
	public int hp () {
		HeroInfo hero =new HeroInfo();
		hero.setHp(random());
		return hero.getHp();
	}

	public int mp () {
		HeroInfo hero =new HeroInfo();
		hero.setMp(random());
		return hero.getMp();
	}

	public int attak () {
		HeroInfo hero =new HeroInfo();
		hero.setAttak(random());
		return hero.getAttak();
	}

	public int speed () {
		HeroInfo hero =new HeroInfo();
		hero.setSpeed(random());
		return hero.getSpeed();
	}

	public int defense () {
		HeroInfo hero =new HeroInfo();
		hero.setDefense(random());
		return hero.getDefense();
	}

	// 1~1000ランダム変数生成メゾット
	public static int random() {
		Random random = new Random();
		int randomNum = random.nextInt(1000) + 1;
		// 戻り値変換する
		return randomNum;
	}

	// ステータス内容文章、getterメソッドより取ってきた各ステータス値表示する
	// メゾット作成
	public void print () {
		System.out.println("ステータス");
		System.out.println("HP : " + hp());
		System.out.println("MP : " + mp());
		System.out.println("攻撃力 : " + attak());
		System.out.println("素早さ : " + speed());
		System.out.println("防御力 : " + defense());
		System.out.println("");
		System.out.println("さあ冒険に出かけよう！");
	}

}
