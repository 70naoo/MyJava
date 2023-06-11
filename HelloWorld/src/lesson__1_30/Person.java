package lesson__1_30;

class Person {
	// 問題1：インスタンスフィールドを定義してください
	String name;

	int age;

	double height;
	
	double weight;
	
	// 問題4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	static int count = 0;

	// 問題2：コンストラクタを定義してください（下記それぞれの引数）
	// 問題3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	Person(String name, int age, double height ,double weight) {
		
		this.name = name;
		
		this.age = age;
		
		this.height = height;
		
		this.weight = weight;
		
		count++;
		
	}
	
	// 問題6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
	// 問題7：bmiメソッドでインスタンスのBMIを返すようにしてください
	public double bmi(){
		
		double BMI = this.weight / (this.height * this.height);
		
		return Math.floor(BMI);
		
		}
	
	// 問題8：インスタンスメソッド「print」を定義してください（戻り値：void）
	// 問題9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
	public void print() {
		
		System.out.println("名前は" + this.name + "です");
		
		System.out.println("年は" + this.age + "です");
		
		System.out.println("BMIは" + this.bmi() + "です");
	}
	
	static int getCount() {
	    return count;
	  }
	
	
}
