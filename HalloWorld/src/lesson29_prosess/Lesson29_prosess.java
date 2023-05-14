package lesson29_prosess;

import java.util.Arrays;

// コンソールで撮ってきた文字を受け取る
// ,で分けString配列に格納
// String配列をint配列に変換
// int配列をsort

// 県名、都市名、人口の配列から該当番号の配列の県ごとの塊をsortされた数字がなくなるまで繰り返しとってくる
// 県の情報ごとに表示する時：で県名、都市名、人口に分ける
// 上記を１行ごとに表記する


public class Lesson29_prosess {
	// スキャナーで8,5,9などを受け取り
	// 昇順に並び替える
	// prefectureInfoの配列情報の番号該当の情報のみ
	// 配列より取ってくる
	String[] imputNum;
	public void scan() {
			// コンソールの文字列を受け取る
			System.out.print("コンソールに文字を入力してください: ");
			@SuppressWarnings("resource")
			String input = new java.util.Scanner(System.in).nextLine();
			// コンソール出力内容を分け、String配列に格納
			this.imputNum = input.split(",");
		}
	

	// 入力内判定
	// 昇順・降順
	
	public void sortScan() {
		// コンソール入力内容を取得し、nameに代入
			System.out.println("昇順のもしくは降順と入力");
			@SuppressWarnings("resource")
			String sort = new java.util.Scanner(System.in).nextLine();
			System.out.println(sort);
			if("昇順".equals(sort)) {
				int[] up = upSort(this.imputNum);
				String[] prefectureInfo = prefectureInfo();
				spritInfo(up,prefectureInfo);
			}else {
				int[] down = downSort(this.imputNum);
				String[] prefectureInfo = prefectureInfo();
				spritInfo(down,prefectureInfo);
			}
		}
	
	
	// コンソール入力内容を引数で受け取る
	public int[] upSort(String[] sortNum) {
		// String配列をint配列に変換
		int[] upArrey = Arrays.stream(sortNum).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < upArrey.length; i++);
		// int配列昇順sort
		Arrays.sort(upArrey);
		System.out.println(Arrays.toString(upArrey));

		return upArrey;
	}

	public int[] downSort(String[] sortNum) {
		// String配列をint配列に変換
		int[] dwonArrey = Arrays.stream(sortNum).mapToInt(Integer::parseInt).toArray();
		for (int i = 0; i < dwonArrey.length; i++);
		// 降順sort
		Arrays.sort(dwonArrey);
		for (int f = 0, l = dwonArrey.length - 1; f < l; f++, l--){
			int temp = dwonArrey[f];
			dwonArrey[f]  = dwonArrey[l];
			dwonArrey[l] = temp;
			System.out.println(Arrays.toString(dwonArrey));
		}
		return dwonArrey;
	}

	public String[] prefectureInfo () {
		// 都道府県の情報受け取る
		String[] prefectureInfo = {
				"北海道:札幌市:83424",
				"青森県:青森市:9646",
				"岩手県:盛岡市:15275",
				"宮城県:仙台市:7282",
				"秋田県:秋田市:11638",
				"山形県:山形市:9323",
				"福島県:福島市:13784",
				"茨城県:水戸市:6097",
				"栃木県:宇都宮市:6408",
				"群馬県:前橋市:6362",
				"埼玉県:さいたま市:3798"
		};
		return prefectureInfo;
	}

	public void spritInfo(int[] i,String[] prefectureInfo) {

		for(int n = 0;n < i.length; n++) {
			String prefecture = prefectureInfo[i[n]];

			String[] info = prefecture.split(":");
			// 県名
			String prefectureName = info[0];
			// 県庁所在地
			String cityName = info[1];
			// 面積
			double km = Double.parseDouble(info[2]);
			// メゾット起動
			printPrefecture(prefectureName,cityName,km);
		}
	}


	// 都道府県情報を出力するメソッド
	public void printPrefecture(String prefectureName, String cityName, double km) {

		System.out.println("都道府県名:" + prefectureName);
		System.out.println("県庁所在地:" + cityName);
		System.out.println("面積:" + km +"km2");
		System.out.println();
	}
	
}
