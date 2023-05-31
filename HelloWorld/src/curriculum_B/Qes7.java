// 7 N人の生徒の成績を管理するプログラムを下記条件で作成してください
// ・N人の生徒の成績を入力できるようにしてください 入力値は上から英語・数学・理科・社会の点数としてください
// ・各生徒の科目平均点、全体の科目平均点、そして各教科の平均点を出力してください
// ・このプログラムの実行は必ず1回以上行われるようにしてください
// ・出力例を参考にプログラミングを作成してください
// 入力・出力例
// 生徒の人数を入力してください(2以上）：2
// 1人目の『英語』の点数を入力してください：10
// 1人目の『数学』の点数を入力してください：10
// 1人目の『理科』の点数を入力してください：10
// 1人目の『社会』の点数を入力してください：10
// 2人目の『英語』の点数を入力してください：10
// 2人目の『数学』の点数を入力してください：10
// 2人目の『理科』の点数を入力してください：10
// 2人目の『社会』の点数を入力してください：10
// 1人目の平均点は10.00点です。
// 2人目の平均点は10.00点です。
// 英語の平均点は10.00点です。
// 数学の平均点は10.00点です。
// 理科の平均点は10.00点です。
// 社会の平均点は10.00点です。
// 全体の平均点は10.00点です。

package curriculum_B;

import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {

		// インスタンスを生成する
		Scanner scan = new Scanner(System.in);

		// 生徒の人数を記入してもらう。2より少なかったら2以上になるまで繰り返す。
		// 整数型の変数を定義する→生徒の人数
		int number;
		do {
			System.out.print("生徒の人数を入力してください（2以上）：");
			number = scan.nextInt();
		} while (number < 2);

		// 生徒の人数と4教科分の点数を格納するための配列を作成する。
		int[][] score = new int[number][4];

		// それぞれの教科を配列に格納する
		String[] subject = { "英語", "数学", "理科", "社会" };
		
		// 生徒の数ごとにfor文を回す
		for (int i = 0; i < number; i++) {
			
			// 教科ごとにfor文を回す。
			for (int j = 0; j < 4; j++) {
				System.out.print((i + 1) + "人目の" + subject[j] + "の点数を記入してください：");
				score[i][j] = scan.nextInt();
			}
			
			System.out.println("\n");
			
		}

		//	それぞれの人の平均点と教科ごとの平均を出す。
		double[] studentAverage = new double[number];
		double[] subjectAverage = new double[4];
		double totalAverage = 0;

		// 生徒の数ごとにfor文を回す
		for (int i = 0; i < number; i++) {
			double sum = 0;
			for (int j = 0; j < 4; j++) {
				sum += score[i][j];
				subjectAverage[j] += score[i][j];
			}
			// それぞれの生徒の平均点を出して、配列に格納する
			studentAverage[i] = sum / 4;

		}

		for (int i = 0; i < 4; i++) {
			// 各科目の合計点を生徒の人数で割って平均点を計算する
			subjectAverage[i] /= number;
		}
		for (int i = 0; i < number; i++) {
			// 各生徒の平均点を出力する
			System.out.printf("\n%d人目の平均点は%.2f点です。\n", (i + 1), studentAverage[i]);
		}
		for (int i = 0; i < 4; i++) {
			// 各科目の平均点を出力する
			System.out.printf("\n%sの平均点は%.2f点です。\n", subject[i], subjectAverage[i]);
			totalAverage += subjectAverage[i] / 4;
		}
		
		// 全体の平均点を出力する
		System.out.printf("\n全体の平均点は%.2f点です。\n", totalAverage);
		scan.close();
	}

}
