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
		パッケージとインポート
		パッケージの呼び出し
		クラスの呼び出し
		アクセス修飾子
		アクセス修飾子の種類一覧
		アクセス修飾子の使い方
		import
		パッケージの命名規則
		Nullチェック

 */
package lesson22_main;

import lesson22_1.Sushi;
public class Sushi_main {
	public static void main(String[] args) {
		Sushi food = new Sushi("寿司","日本","和食");
		// メソッドについて調べる
		food.print();
		food.time();
	}
}
