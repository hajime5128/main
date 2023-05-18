package lesson32;

class Person{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	static int counter;
	
	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name,int age, double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight  = weight;
		counter++;
	}
	
	// bmiを求めるメゾット
	double bmi(double height,double weight) {
		double bmi;
		double height2 = height * height;
		bmi = weight/height2;
		return bmi;
	}

	// 名前、年、合計表示
	void print() {
		System.out.println("名前は" +this.name + "です");
		System.out.println("年は" + this.age + "です");
	}
	
	void printCount() {
		System.out.println("合計" + counter + "人です");
	}
}
