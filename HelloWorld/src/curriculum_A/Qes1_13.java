package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
    // 1
        //変数の宣言のみする
		// バイト型
        byte myByte;
        
        // 短整数型
        short myShort;
        
        // 整数型
        int myInt;
        
        // 長整数型
        long myLong;
        
        // 単精度浮動小数点数型
        float myFloat;
        
        // 倍精度浮動小数点数型
        double myDouble;
        
        // 文字型
        char myChar;
        
        // 文字列型
        String myString;
        
        // ブーリアン型
        boolean myBoolean;
		
		   System.out.println("");
		 
	 // 2. 初期化
		// バイト型
	        myByte = 0;
	        
	        // 短整数型
	        myShort = 0;
	        
	        // 整数型
	        myInt = 0;
	        
	        // 長整数型
	        myLong = 0L;
	        
	        // 単精度浮動小数点数型
	        myFloat = 0.0f;
	        
	        // 倍精度浮動小数点数型
	        myDouble = 0.0;
	        
	        // 文字型
	        myChar = '\u0000';
	        
	        // 文字列型
	        myString = null;
	        
	        // ブーリアン型
	        myBoolean = false;

	        System.out.println("");
    // 3
        // 値を代入する
	     // バイト型
	       myByte = 10;
	        
	        // 短整数型
	        myShort = 100;
	        
	        // 整数型
	        myInt = 1000;
	        
	        // 長整数型
	        myLong = 10000L;
	        
	        // 単精度浮動小数点数型
	        myFloat = 9.5f;
	        
	        // 倍精度浮動小数点数型
	        myDouble = 10.5;
	        
	        // 文字型
	        myChar = 'a';
	        
	        // 文字列型
	        myString = "ハロー";
	        
	        // ブーリアン型
	        myBoolean = true;
		
		   System.out.println("");
		
    // 4
        // コンソールに出力する
		System.out.println(myLong + myInt + myShort + myByte);
		System.out.println(myByte + myByte);
		System.out.println(myChar+ " " + myString + " " + myBoolean);
		System.out.println(myDouble + myFloat + myLong + myInt + myShort + myByte);
		System.out.println(myLong * myInt * myShort * myByte);
		System.out.println(myDouble / myShort);
		System.out.println(myByte - myShort);
		
		   System.out.println("");
		
	// 5
		// コンソールに出力する
         //String型をint型に修正
		int num=20;
		int num1=23;
		System.out.println("ハローJAVA" +(num + num1));
		
		   System.out.println("");

	 // 6
		// 変数を宣言して、コンソールに出力する   
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
		
     // 7
		// BMIを出力する
		double bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + String.format("%.1f", bmi) + "です");
		
		   System.out.println("");
		
     // 8
		// 再代入する
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		
		// コンソールに出力する
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + " kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" +String.format("%.1f", bmi)  + "です");
		
		   System.out.println("");
		
     // 9
		// 自己代入する
		age += age; 
		height += height; 
		weight += weight; 
		
		// コンソールに出力する
		System.out.println("初めまして" + name + "です");
		System.out.println("年齢は" + age + "歳です");
		System.out.println("身長は" + height + "cmです");
		System.out.println("体重は" + weight + " kgです");
		System.out.println("好きな食べ物は" + food + "です");
		bmi = weight / ((height / 100) * (height / 100));
		System.out.println("BMIは" + String.format("%.2f", bmi) + "です");
		
		   System.out.println("");
		
     // 10
		   
		// 8で使用した変数を使う
			name = "鈴木一郎";
			age = 24;
			height = 168.5;
			weight = 64.2;
			food = "オムライス";
			
		 // if文なしでtrue表示する
		boolean over25 = age >= 25 ? true : false;
		System.out.println(over25);
		
		   System.out.println("");
		
     // 11
		 // 整数型や短整数型を文字列型にする  
		String ageStr = String.valueOf(age);
		String heightStr = String.valueOf(height);
		String weightStr = String.valueOf(weight);
		System.out.println(ageStr + " " + heightStr + " " + weightStr);
		
		   System.out.println(""); 
		
     // 12
		// 文字列型を整数型にする
		int ageInt = Integer.parseInt(ageStr);
		int heightInt =(int)height;
		System.out.println(ageInt +" "+ heightInt);
		
		   System.out.println("");
		   
     // 13 
		// if文なしでtrue表示する
		boolean ageHeight = age == 25 && height >= 160 ? true : false;
		System.out.println(ageHeight);
		
	}
}
