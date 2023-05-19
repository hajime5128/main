package lesson33;

class Person{
	// staticつけることによりmainメゾットより書き換えられない
	public static int count = 0;
	public String firstName;
	// lastNameを追加
	public String lastName;
	public int age;
	public double height, weight;

	Person(String firstName , String lastName , int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		// 問題2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
		// ※順番はfirstNameの次
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// フルネーム表示メゾット
	public String fullName(){
		return this.firstName + this.lastName;
	}
	
	// 自己紹介メゾット
	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}
	// 人数カウントメゾット
	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}