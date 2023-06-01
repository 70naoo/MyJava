/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
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

package main__1_25;

import java.util.Random;
import java.util.Scanner;

import player__1_25.Player;
import player__1_25.bean;

public class Main {

	public static void main(String[] args) {
		
		// インスタンスを生成
		Random rand = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		bean be = new bean();
		
		Player player = new Player();
		
        // 名前を入力してもらう
		String str = scan.next();
		scan.close();
		
		// 配列を作成し、値を買うのうする
		int[] result = new int[5];
		
		// resultに値を順番に入れて乱数を作る
		for (int i = 0; i < 5; i++) { 
	    	result[i] = rand.nextInt(1000) + 1; 
	        }
		
		// 記入した名前を設定する
		player.setName(str);
		
		// それぞれのステータスに値を設定する
		be.setHp(result[0]);
		be.setMp(result[1]);
		be.setAttack(result[2]);
		be.setSpeed(result[3]);
		be.setDefense(result[4]);
		
	        // 出力する
	        System.out.println("こんにちは「 " + player.getName() + " さん");
	        System.out.println("ステータス");
	        System.out.println("HP：" + be.getHp());
	        System.out.println("MP：" + be.getMp());
	        System.out.println("攻撃力：" + be.getAttack());
	        System.out.println("素早さ：" + be.getSpeed());
	        System.out.println("防御力：" + be.getDefense() + "\n");
	        System.out.println("さあ冒険に出かけよう！");
	    
	}

}
