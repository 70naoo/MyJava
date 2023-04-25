/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */

package lesson__1_23;

public class Theme2 {
//	メンバ変数
	public String name;
	public double second;
	public int speed;
	
//	コンストラクタ
	public Theme2(String name,double second,int speed) {
		this.name = name;
		this.second = second;
		this.speed = speed;
	}
//	名前ゲッター
	public String getName() {	
		return name;
	}
//	名前セッター
	public void setName(String name) {
		this.name = name;
	}
//	体調ゲッター
	public double getSecond() {
		return second;
	}
//	体調セッター
	public void setSecond(double second) {
		this.second = second;
	}
//	スピードゲッター
	public int getSpeed() {
		return speed;
	}
//	スピードセッター
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
//		インスタンス生成
		Theme2 theme = new Theme2("ライオン",2.1,80) ;
//		それぞれ出力
		System.out.println("動物名:" + theme.getName());
		System.out.println("体長:" + theme.getSecond() + "m");
		System.out.println("速度:" + theme.getSpeed() + "km/h");
	}

}
