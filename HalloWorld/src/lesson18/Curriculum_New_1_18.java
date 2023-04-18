package lesson18;

import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。

	//	メソッド定義
	private static void test(String j, int n){
		System.out.println(j+" "+n);
	}
	// Q2：引数に整数を渡すと、渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	private static void tomotinn(int i) {
		System.out.println(i*i);
	}
	// メソッド定義仕方、static,void,戻り値、

	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	private static void makkiy(int[]mak) {
		for(int i = 0;i<mak.length; i++) {
			System.out.println(mak[i]);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	private static void tomotinn(double d) {
		System.out.println(d+d);
	}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	private static int[] random(int num) {
		Random random = new Random();
		int[] randomNum = new int[num];
		// 1-100出す処理
		for(int i = 0;i < num; i++) {
			randomNum[i] = random.nextInt(100) + 1;
			System.out.println(randomNum[i]);
		}
		// 戻り値変換する
		return randomNum;
	}

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static double average(int [] ave) {
		// 受け取った配列の器を作る
			// randomNum配列の中の要素を全部足す
			int sum = 0;
			for (int d : ave) sum += d; 
			// 合計を配列ので割、平均を求める
	        double average = sum / ave.length;	        
	        System.out.println(average);
			return average;   
	}
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void hanntei(double aveNum) {
		if(aveNum >=50) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	
	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		// Q1
		System.out.println("Q1");
		test("Hello JavaSE", 11);
		// Q2
		System.out.println("Q2");
		tomotinn(10);
		// Q3
		System.out.println("Q3");
		int mak[] = {1,10,100};
		makkiy (mak);
		// Q4
		System.out.println("Q4");
		tomotinn(9.58);
		// Q5
		System.out.println("Q5");
		random(3);
		// Q6
		System.out.println("Q6");
		// メゾットが引数になる
		average(random(3));
		// Q7
		System.out.println("Q7");
		hanntei(average(random(3)));
	}
}