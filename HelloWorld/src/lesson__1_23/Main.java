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
        //インスタンス生成
		Bean bean = new Bean() ;
		
		bean.setName("ライオン");
		bean.setSecond(2.1);
		bean.setSpeed(80);
		
        //それぞれ出力
		System.out.println("動物名:" + bean.getName());
		System.out.println("体長:" + bean.getSecond() + "m");
		System.out.println("速度:" + bean.getSpeed() + "km/h");
	}

}
