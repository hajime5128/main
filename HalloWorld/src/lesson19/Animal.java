package lesson19;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog = new Dog(); // 呼び出し文
		System.out.println(dog.animal);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 =new Dog(3);
		System.out.println(dog2.head);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		//Calendarクラスのオブジェクトを生成する
        Calendar cl = Calendar.getInstance();
        
        //SimpleDateFormatクラスでフォーマットパターンを設定する
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd H:m:s");
        System.out.println(sdf.format(cl.getTime()));
	}
}
