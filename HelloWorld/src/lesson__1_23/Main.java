/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package lesson__1_23;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
        //インスタンス生成
		Bean theme = new Bean("ライオン",2.1,80) ;
		
        //それぞれ出力
		System.out.println("動物名:" + theme.getName());
		System.out.println("体長:" + theme.getSecond() + "m");
		System.out.println("速度:" + theme.getSpeed() + "km/h");
	}

}
