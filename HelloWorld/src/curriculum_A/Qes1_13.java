package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
    //1.2
        //変数を宣言し、初期化する
		byte a = 0;
		short b = 0;
		int c = 0;
		long d = 0L;
		
		float e = 0.0f;
		double f = 0.0d;
		
		char g = 'A';
		String h = "あ";
		
		boolean i = false;
		
		   System.out.println("");
    //3
        //値を代入する
		a = 10;
		b =100;
		c = 1000;
		d = 10000;
		e = 9.5f;
		f = 10.5d;
		g = 'a';
		h = "ハロー";
		i = true;
		
		   System.out.println("");
		
    //4
        //コンソールに出力する
		System.out.println(d + c + b + a);
		System.out.println(a + a);
		System.out.println(g + " " + h + " " + i);
		System.out.println(f + e + d + c + b + a);
		System.out.println(d * c * b * a);
		System.out.println(f / b);
		System.out.println(a - b);
		
		   System.out.println("");
		
	//5
		//コンソールに出力する
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA" +(num + num1));
		
		   System.out.println("");

	 //6
		//変数を宣言して、コンソールに出力する   
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 62.2;
		String food = "寿司";
		
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + " kgです");
		System.out.println("好きな食べ物は" + food + "です");
		
		   System.out.println("");
		
     //7
		//BMIを出力する
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + bmi + "です");
		
		   System.out.println("");
		
     //8
		//再代入する
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		//コンソールに出力する
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + " kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + bmi + "です");
		
		   System.out.println("");
		
     //9
		//自己代入する
		int age1 = age + age; 
		double height1 = height + height; 
		double weight1 = weight + weight; 
		
		//コンソールに出力する
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age1 + "歳です");
		System.out.println("身長は" + height1 + "cmです");
		System.out.println("体重は" + weight1 + " kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + bmi + "です");
		
		   System.out.println("");
		
     //10
		 //if文なしでtrue表示する
		boolean over25 = age >= 25 ? true : false;
		System.out.println(over25);
		
		   System.out.println("");
		
     //11
		 //整数型や短整数型を文字列型にする  
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf((int)height);
		String weightStr = String.valueOf(weight);
		System.out.println(ageStr + " " + heightStr + " " + weightStr);
		
		   System.out.println(""); 
		
     //12
		//文字列型を整数型にする
		int ageInt = Integer.parseInt(ageStr);
		int heightInt = Integer.parseInt(heightStr);
		System.out.println(ageInt + heightInt);
		
		   System.out.println("");
		   
     //13
		//if文なしでtrue表示する
		boolean ageHeight = age >= 25 && height >= 160 ? true : false;
		System.out.println(ageHeight);
		
	}
}
