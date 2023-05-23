package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		
		// インスタンスを生成する
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        
        // コンソールに入力された値をうけとる
        String str = scan.next();
        
        //  、で区切って複数な値を格納する
        String [] items = str.split("、");
        
        
        for (String item : items) {
        	// 0から11までのランダムな整数を生成し、変数baiに格納する
        	int bai = rand.nextInt(12);
        	switch(item) {
        	// それぞれの場合に場合分して、残り台数表示する
        	case "パソコン":
        		System.out.println("パソコンの残り台数は" + bai + "台です。");
        		break;
        	case "冷蔵庫":
        		System.out.println("冷蔵庫の残り台数は" + bai + "台です。");
        		break;
        	case "扇風機":
        		System.out.println("扇風機の残り台数は" + bai + "台です。");
        		break;
        	case "洗濯機":
        		System.out.println("洗濯機の残り台数は" + bai + "台です。");
        		break;
        	case "加湿器":
        		System.out.println("加湿器の残り台数は" + bai + "台です。");
        		break;
        	case "テレビ":
        	case "ディスプレイ":
        		// テレビとディスプレイの数は条件演算子を使って、出力される値を変更する。
        		// テレビの場合は0から5までの数値になる
        		bai = item.equals("テレビ") ? rand.nextInt(6) : bai;
        		System.out.println(item +"の残り台数は" + bai);
        		break;
        	// それ以外の商品を選択された時
        	default:
        		System.out.println("『その他商品』は指定の商品ではございません。");;
        		break;
        }
        }
		}
	}