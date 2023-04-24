/*

 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください

  	動物名：ライオン
	体長：2.1m
	速度：80km/h

 */
package lesson23_1;

public class AnimalInfo{
	private String animal ;
	private double lenght;
	private int speed;

	public AnimalInfo (String animal,double lenght,int speed) {
		this.animal = animal;
		this.lenght = lenght;
		this.speed = speed;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public double getLenght() {
		return lenght;
	}

	public void setLenght(double lenght) {
		this.lenght = lenght;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void print() {
		System.out.println("動物名：" + animal);
		System.out.println("体長：" + lenght + "m");
		System.out.println("速度：" + speed + "km/h");
	}
}
