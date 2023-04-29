package lesson__1_23;

public class Bean {

	//メンバ変数
	private String name;
	private double second;
	private int speed;
	
	    //名前ゲッター
			public String getName() {	
				return name;
			}
		//名前セッター
			public void setName(String name) {
				this.name = name;
			}
		//体調ゲッター
			public double getSecond() {
				return second;
			}
		//体調セッター
			public void setSecond(double second) {
				this.second = second;
			}
		//スピードゲッター
			public int getSpeed() {
				return speed;
			}
		//スピードセッター
			public void setSpeed(int speed) {
				this.speed = speed;
			}
    //コンストラクタ
	public Bean() {
		
	}
		
}
