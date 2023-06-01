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

package lesson__1_26_28;

import java.util.Scanner;

public class Theme2 {

	public static void main(String[] args) {

		//	インスタンス生成
		Scanner scan = new Scanner(System.in);

		System.out.println("コンソールに文字を入力してください");
		
		//  、で区切って複数な値を格納する
		String[] names = scan.next().split("、");
		
		scan.close();

		// 記入した動物を、で区切って一つずつfor文を回す
		for (String name : names) {
			switch (name) {
			
			case "ライオン":
				System.out.println("動物名:ライオン");
				System.out.println("体長:2.1m");
				System.out.println("速度:80m");
				System.out.println("学名:パンテラ レオ\n");
				break;
				
			case "ゾウ":
				System.out.println("動物名:ゾウ");
				System.out.println("体長:3.2m");
				System.out.println("速度:40m");
				System.out.println("学名:ロキソドンタ・サイクロティスオ\n");
				break;
				
			case "パンダ":
				System.out.println("動物名:パンダ");
				System.out.println("体長:1.9m");
				System.out.println("速度:30m");
				System.out.println("学名:アイルロポダ・メラノレウカ\n");
				break;
				
			case "チンパンジー":
				System.out.println("動物名:チンパンジー");
				System.out.println("体長:0.94m");
				System.out.println("速度:25m");
				System.out.println("学名:パン・トゥログロディテス\n");
				break;
				
			case "シマウマ":
				System.out.println("動物名:シマウマ");
				System.out.println("体長:2.4m");
				System.out.println("速度:65m");
				System.out.println("学名:チャップマンシマウマ\n");
				break;
				
			case "インコ":
				System.out.println("動物名:インコ");
				System.out.println("体長:0.1m");
				System.out.println("速度:50m");
				System.out.println("学名:不明\n");
				break;
			}
		}

	}

}
