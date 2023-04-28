package lesson25_1;

// javaスキャナーインポート
import java.util.Scanner;

public class SuperHero extends Hero{
	// 空のコンストラクタ生成
	public SuperHero () {
		// コンソール入力内容を取得し、nameに代入
		try (Scanner sc1 = new Scanner(System.in)) {
			String name = sc1.nextLine();
			System.out.println("こんにちは　「" +name+ "」　さん");
		}
	}
}
