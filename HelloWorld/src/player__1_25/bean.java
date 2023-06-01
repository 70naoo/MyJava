/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 /サブクラスを使用してください
		 /スーパークラスを使用してください
		 /getterとsetterを使用してください
		 /packageを2つ作ってメインと処理を分けてください
		 /命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */



package player__1_25;

public class bean {
	
    // メンバ変数
	private int hp;
    private int mp;
    private int attack;
    private int speed;
    private int defense;
    
    // 取得して設定
	public int getHp() {
		return hp;
	}
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	public int getMp() {
        return mp;
    }
	
    public void setMp(int mp) {
        this.mp = mp;
    }
    
    public int getAttack() {
        return attack;
    }
    
    public void setAttack(int attack) {
        this.attack = attack;
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public void setSpeed(int agility) {
        this.speed = agility;
    }
    
    public int getDefense() {
        return defense;
    }
    
    public void setDefense(int defense) {
        this.defense = defense;
    }
}
