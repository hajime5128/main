/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */
package lesson23_1;

public class AnimalInfo{
	// 変数宣言
	private String animal = "ライオン";
	private double lenght = 2.1;
	private int speed = 80;

	// getAnimalメゾット getter setter
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		// nullチェック
		if(animal == null) {
			throw new IllegalArgumentException("名前を入力してください。");
		}
		// thisを使ってフィールド変数代入
		this.animal = animal;
		System.out.println("動物名：" + animal);
	}

	// getLenghtメゾット getter setter
	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		// thisを使ってフィールド変数代入
		this.lenght = lenght;
		System.out.println("体長：" + lenght + "m");
	}

	// getSpeedメゾット getter setter
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// thisを使ってフィールド変数代入
		this.speed = speed;
		System.out.println("速度：" + speed + "km/h");
	}

}
