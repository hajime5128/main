package lesson30_main;

class Main {
	public static void main(String[] args) {		
		Person person1 = new Person("鈴木太郎", 20, 1.7,60);
		Person person2 = new Person("宮崎優佑", 27, 1.63,55);

		// 
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		person1.print();
		person2.print();

	}
}


