package basicClass__1_19;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Animal {
	
	public static void main(String[] args) {
		// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
		Dog dog1 = new Dog();
	    System.out.println(dog1.name);
		// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
		Dog dog2 = new Dog(4);
		System.out.println(dog2.count);
		// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
		// 現在の日時を取得
        LocalDateTime now = LocalDateTime.now();
        
        // フォーマットを指定して出力
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);
	}
}
