/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
 
 	条件：・数値は毎回変わるように作ってください
	     ランダム
	     
	 	 ・サブクラスを使用してください
		 スーパークラスを使用してください
		 継承
		 
		 ・getterとsetterを使用してください
		 
		 ・packageを2つ作ってメインと処理を分けてください
		 メインと処理パッケージ
		 
		 ・命名する場合は規則にのっとってください
		 キャメルケース、スネークケース、パスカルケース、ケバブケース
		 
		 ・コンストラクタを使用してください
		 
		 ・コンソールで入力
		 スキャナーメゾット使用
	
	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package lesson25_main;

// lesson25_1パッケージをインポート
import lesson25_1.SuperHero;

public class Lesson25_main{
	public static void main(String[] args) {
		// コンソールに名前入力時名前と共にステータス内容をに表示
		SuperHero superHero = new SuperHero();
		superHero.print();
	}

}