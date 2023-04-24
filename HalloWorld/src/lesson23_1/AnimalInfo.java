/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */
package lesson23_1;

public class AnimalInfo{
	private String animal = "ライオン";
	private double lenght = 2.1;
	private int speed = 80;
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		if(animal == null) {
			throw new IllegalArgumentException("名前を入力してください。");
		}
		this.animal = animal;
		System.out.println("動物名：" + animal);
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
		System.out.println("体長：" + lenght + "m");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
		System.out.println("速度：" + speed + "km/h");
	}

//	public void print() {
//		System.out.println("動物名：" + animal);
//		System.out.println("体長：" + lenght + "m");
//		System.out.println("速度：" + speed + "km/h");
//	}
}
