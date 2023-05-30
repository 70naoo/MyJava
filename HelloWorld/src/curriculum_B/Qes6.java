//  6 入力した商品の残り台数が出力されるシステムを下記の条件で作成してください
// ・ 拡張for文・Switch文・条件演算子を使用すること※普通のif文は使用不可
// ・Switch文内でテレビとディスプレイは続けて書くようにしてください、条件演算子で出力される値を変更してください
// テレビとディスプレイは同じ商品扱いとし、ディスプレイが出た場合は最大個数の11個からランダムで出た数字を引いて出力してください
// ・例：テレビと受け取った場合、→「テレビの残り台数は〇〇台です」※OOはランダムで出た数字
// ・入力される値は右記の表のどれかが入力され、入力回数の縛りはありません
// ・入力された値は「、」区切りで指定してください
// ・そのほかの値が入力された場合下記を出力されるようにしてください
// 『受け取った値』は指定の商品ではありません
// ・残り台数は0〜11までのランダムな値が出力されるようにしてください

package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// インスタンスを生成する
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		// コンソールに入力された値をうけとる
		//  、で区切って複数な値を格納する
		String[] items = scan.next().split("、");
		
		// 改行する
		System.out.println("");

		// 配列itemsに格納されたものを一つずつ取り出してfor文を回す
		for (String item : items) {
			
			// 0から11までのランダムな整数を生成し、変数baiに格納する
			int bai = rand.nextInt(12);
			switch (item) {

			// それぞれの場合に場合分して、残り台数表示する
			case "パソコン":

			case "冷蔵庫":

			case "扇風機":

			case "洗濯機":

			case "加湿器":
				
				System.out.println(item + "の残り台数は" + bai + "台です。");
				
				System.out.println("");
				
				break;
				
			case "テレビ":
			case "ディスプレイ":
				
				// テレビとディスプレイの数は条件演算子を使って、出力される値を変更する。
				bai = item.equals("テレビ") ? rand.nextInt(12) : bai;
				
				System.out.println(item + "の残り台数は" + bai + "台です。");
				
				System.out.println("");
				
				break;
				
			// それ以外の商品を選択された時
			default:
				
				System.out.println("『" + item + "』" + "は指定の商品ではございません。");
				
				break;
			}
		}
		
		scan.close();
	}
}