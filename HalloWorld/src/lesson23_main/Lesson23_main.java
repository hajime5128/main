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
		// 
		AnimalInfo animal = new AnimalInfo();
		
		animal.setAnimal("ライオン");	// 変数代入
		animal.setLenght(2.1);		// 変数代入
		animal.setSpeed(80);		// 変数代入
	}
}