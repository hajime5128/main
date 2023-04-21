/*

	下記がコンソールに出力されるように作成してください

		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。

 */
package lesson22_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Sushi {
	// 型定義
	String sushi;
	Calendar cl;
	// メゾット作成
	public static void japan() {
		System.out.println("こんにちは！ここは日本です！");
	}
	//代入
	public Sushi(String food) {
		this.sushi = food;
		System.out.println("この"+sushi+"はうまい");
		System.out.println(sushi+"は和食です");
	}
	public Sushi() {
		//Calendarクラスのオブジェクトを生成する
		this.cl = Calendar.getInstance();
		//SimpleDateFormatクラスでフォーマットパターンを設定する
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		System.out.println(sdf.format(cl.getTime()));
	}
}