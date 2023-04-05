package lesson9;
import java.util.Random;
//random動作のため記述
public class ConditionalExpression {
	public static void main(String[] args) {
//		問１）
//		boolean型変数 rain を宣言し、今日の天気が雨なら「true」雨でないなら「false」を代入して下さい。
//		もし rain が true ならコンソールに「DVDを見ます。」と false なら「外で遊びます。」と表示して下さい。

		boolean rain;
//		rain = true;
//		trueを宣言
		rain = false;
		if (rain == true){
			  // 条件式が true のときに実行される処理			  ...
			System.out.println("DVDを見ます。");
			}else{
			  // 条件式が false のときに実行される処理			  ...
			System.out.println("外で遊びます。");
			}
//		問２）
//		String型変数 name に任意の名前を入れて下さい。
//		int型変数 score に「0~100」までの乱数を代入して下さい。
//		もし score が 40点以下なら「〇〇さんは□□点です。もう少し頑張りましょう。」、
//		もし score が 40点以上、60点以下なら「〇〇さんは□□点です。もう少しでした。」、
//		もし score が 60点以上、80点以下なら「〇〇さんは□□点です。よくできました。」、
//		もし score が 80点以上なら「〇〇さんは□□点です。たいへんよくできました。」とコンソールに出力して下さい。
		String name;
		name = "槇野";
		Random random = new Random();
		 int randomNum = random.nextInt(100) + 1;
		 if(randomNum < 40) {
			 System.out.println(name+"さんは"+randomNum+"点です。もう少し頑張りましょう。");
		 } else if(40 <= randomNum && randomNum < 60) {
			 System.out.println(name+"さんは"+randomNum+"点です。もう少しでした。");
		 }else if(60 <= randomNum && randomNum < 80){
			 System.out.println(name+"さんは"+randomNum+"点です。よくできました。");
		 }else {
			 System.out.println(name+"さんは"+randomNum+"点です。たいへんよくできました。");
		 }
//		問３）
//		①変数 isTired を定義し、0 か 1 を代入する。（どちらを代入しても構わない。）
//		②変数 study を定義し、文字列 "カリキュラム" を代入する。
//		③もし変数 isTired が 0 であれば「私はとても元気です。」、そうでなければ「私は疲れています。」と表示する。
//		※④は System.out.println() のカッコ内に条件演算子（三項演算子）を使って、一行で書いてください。
//		④もし変数 isTired が 0 であれば、変数 study を利用して「カリキュラムを続けます。」と表示する。
//		①完了
		 int isTired;
		isTired = 0;
//		②完了
		String study;
		study = "カリキュラム";
//		③未完　型の不一致: int から boolean には変換できません　エラー解消せず
		if(isTired == 0) {
			System.out.println("私はとても元気です。");
		}else {
			System.out.println("私は疲れています。");
		}
//		３公演ざんし書き直し　再勉強
//		④三項演算子使っての出力完了
		System.out.println(isTired == 0 ? study+"続けます。" : "");
		}
	}

