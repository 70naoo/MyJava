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
				break;
			case "テレビ":
			case "ディスプレイ":
				// テレビとディスプレイの数は条件演算子を使って、出力される値を変更する。
				bai = item.equals("テレビ") ? rand.nextInt(12) : bai;
				System.out.println(item + "の残り台数は" + bai + "台です。");
				break;
			// それ以外の商品を選択された時
			default:
				System.out.println("『その他商品』は指定の商品ではございません。");
				;
				break;
			}
		}
		scan.close();
	}
}