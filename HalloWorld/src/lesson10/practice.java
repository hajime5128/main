/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：  3
					5
					7
					9
					・
					・
					・
					21
					*/
package lesson10;

public class practice {

	public static void main(String[] args) {
		int i = 1;
		for (;  i <= 21 ; i = i + 2){
			if(i == 1) {
				continue;
			}
			  // 繰り返しの中で実行される処理
			  System.out.println(i);
			}
	}

}