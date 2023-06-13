package lesson__1_32;


class Person {
	// インスタンスフィールドを設定する
	public String name;
	
	public int age;
	
    public double height;
    
	public double weight;
	
	// 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	public static int count = 0;

	// コンストラクタを定義する
	Person(String name, int age, double height, double weight) {
		
		this.name = name;
		
		this.age = age;
		
		this.height = height;
		
		this.weight = weight;
		
		// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
		count++;
	}

	// bmiメソッドを作成する
	public double bmi() {
		
		return this.weight / this.height / this.height;
	}

	// printメソッドを作成する
	public void print(){
		
		System.out.println("名前は" + this.name + "です");
		
		System.out.println("年は" + this.age + "です");
	}
	
	// getCountメソッドを作成する
	static int getCount() {
		
	    return count;
	  }
	
	// 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
	
	// printCountメソッドを作成する
	public static void printCount() {
		
		System.out.println("合計" + count + "人です");
	}
}
