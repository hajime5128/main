package lesson31;

class Person{
	// インスタンスフィールドを定義
	String fullName;
	int age;
	double height;
	double weight;
	static int counter;
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String familyName,String LastName,int age, double height,double weight){
		this.fullName = familyName + LastName;
		this.age = age;
		this.height = height;
		this.weight  = weight;
		counter++;
	}

	double bmi(double height,double weight) {
		double bmi;
		double height2 = height * height;
		bmi = weight/height2;
		return bmi;
	}


	// インスタンスメソッドbuyを定義
	public void buy(Car car) {
		car.setOwner(this.fullName);
		System.out.println(car.getOwner() + "が購入しました");
		}


	public void buy(Bicycle bicycle) {
		bicycle.setOwner(this.fullName);
		System.out.println(bicycle.getOwner() + "が購入しました");
	}

	void print() {
		System.out.println("名前は" +this.fullName + "です");
		System.out.println("年は" + this.age + "です");
		System.out.println("BMIは" + String.format("%.1f", bmi(this.height, this.weight)) + "です");
		System.out.println("合計" + counter + "人です");
	}

}
