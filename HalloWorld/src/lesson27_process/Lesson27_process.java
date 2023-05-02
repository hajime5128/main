/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
//package lesson27_process;
//
//public class Lesson27_process {
//	String name;
//	int bodyLength;
//	int speed;
//	String scientificName;
//	
//	public void animal(String name,int bodyLength,int speed) {
//		Map<String, Integer> = new HashMap<String, Integer>();
//		
//	}
//	
//	
//}
package lesson27_process;

import java.util.Scanner;

public class Lesson27_process {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // コンソールの文字列を受け取る
        System.out.print("コンソールに文字を入力してください: ");
        String input = scanner.nextLine();

        // 動物情報をカンマで分割し、各動物の情報、名前、体長、速度
        // を一塊として受けとりanimal配列で受ける
        String[] animals = input.split(",");
        for (String animal : animals) {
            // 動物名、体長、速度をコロンで分割する
        	// info配列で、0　名前、１　体長、2　速度に格納する
            String[] info = animal.split(":");
            String name = info[0];
            // 文字列をdoubleにする
            double length = Double.parseDouble(info[1]);
            // 文字列をintにする
            int speed = Integer.parseInt(info[2]);
            // getScientificNameメゾットより学名取得
            String scientificName = getScientificName(name);

            // 動物情報を出力する
            printAnimalInfo(name, length, speed, scientificName);
        }
    }

    // 学名を取得するメソッド
    // コンソール配列で受けったnameを元にScientificNameを判別
    private static String getScientificName(String name) {
        switch (name) {
            case "ライオン":
                return "パンテラ レオ";
            case "ゾウ":
                return "ロキソドンタ・サイクロティス";
            case "パンダ":
                return "アイルロポダ・メラノレウカ";
            case "チンパンジー":
                return "パン・トゥログロディテス";
            case "シマウマ":
                return "チャップマンシマウマ";
            default:
                return "不明";
        }
    }

    // 動物情報を出力するメソッド
    private static void printAnimalInfo(String name, double length, int speed, String scientificName) {
        // 動物情報を出力する
        System.out.println("動物名：" + name);
        System.out.println("体長：" +  length+ "m");
        System.out.println("速度：" + speed + "km/h");
        System.out.println("学名：" + scientificName);
        System.out.println("");
    }
}
