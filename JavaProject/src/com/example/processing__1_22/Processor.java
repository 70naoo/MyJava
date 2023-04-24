/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */

//パッケージの命名法則
package com.example.processing__1_22;

//必要なクラスをインポート
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Processor {

    // インスタンス変数
    private String location; 
    private String sushi; 
    private String foodType; 
    private LocalDateTime currentDateTime; 

    //コンストラクタ
    public Processor() {
        this.location = "日本"; 
        this.sushi = "寿司"; 
        this.foodType = "和食"; 
        this.currentDateTime = LocalDateTime.now(); 
    }

    //実行メソッド
    public void execute() {
        // nullチェック
        if (this.currentDateTime == null) {
            System.out.println("現在の日時を取得できませんでした。処理を中断します。");
            return;
        }

    
        String formattedDateTime = this.currentDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));

        System.out.println("こんにちは！ここは" + this.location + "です！");
        System.out.println("この" + this.sushi + "はうまい");
        System.out.println(this.sushi + "は" + this.foodType + "です");
        System.out.println("今の現在日時は" + formattedDateTime + "です");
    }
}
