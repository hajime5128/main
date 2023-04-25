/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */
package lesson23_1;

public class AnimalInfo{
	// フィールド変数宣言
	private String name;
	private double lenght;
	private int speed;

	// getAnimalメゾット getter setter
	public String getName() {
		// フィールド変数に返す
		return name;
	}

	public void setName(String name) {
		// thisを使ってフィールド変数代入
		this.name = name;
	}

	// getLenghtメゾット getter setter
	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		// thisを使ってフィールド変数代入
		this.lenght = lenght;
	}

	// getSpeedメゾット getter setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// thisを使ってフィールド変数代入
		this.speed = speed;
	}
	
}