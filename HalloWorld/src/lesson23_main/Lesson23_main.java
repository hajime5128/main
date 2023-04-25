/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */
package lesson23_main;

import lesson23_1.AnimalInfo;
public class Lesson23_main{
	public static void main (String[] args) {
		// インスタンス生成
		AnimalInfo animal = new AnimalInfo();
		
		animal.setName("ライオン");	// 変数代入
		animal.setLenght(2.1);		// 変数代入
		animal.setSpeed(80);		// 変数代入
		
		// getterの値をコンソールに出力
		System.out.println("動物名：" + animal.getName());
		System.out.println("体長：" + animal.getLenght() + "m");
		System.out.println("速度：" +animal.getSpeed() + "km/h");
	}
	
}