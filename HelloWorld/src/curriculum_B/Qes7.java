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
		}while(number < 2);
		
		// 生徒の人数と4教科分の点数を格納するための配列を作成する。
		int[][] score = new int[number][4];
		// 生徒の数ごとにfor文を回す
		for(int i = 0;i<number;i++) {
			// 教科ごとにfor文を回す。
			for(int j = 0;j<4;j++) {
				System.out.print((i + 1) +"番目の"+ getSubject(j) +"の点数を記入してください：");
				score[i][j] = scan.nextInt();
			}
			//	1人ずつ一行開ける。
			System.out.println("");
		}
		
		//	それぞれの人の平均点と教科ごとの平均を出す。
		double [] studentAverage = new double[number];
		double [] subjectAverage = new double[4];
		double totalAverage = 0;
		
		// 生徒の数ごとにfor文を回す
		for(int i = 0;i< number;i++) {
			double sum = 0;
			for(int j = 0;j<4;j++) {
				sum += score[i][j];
				subjectAverage[j] += score[i][j];
			}
			// それぞれの使徒の平均点を出して、配列に格納する
			studentAverage[i] = sum / 4;
			totalAverage += studentAverage[i];
			}
		
		for (int i = 0; i < 4; i++) {
			// 各科目の合計点を生徒の人数で割って平均点を計算する
		    subjectAverage[i] /= number;}
		for (int i = 0; i < number; i++) {
			// 各生徒の平均点を出力する
		    System.out.printf("%d人目の平均点は%.2f点です。\n", (i + 1), studentAverage[i]); 
		}
		for (int i = 0; i < 4; i++) {
			 // 各科目の平均点を出力する
		    System.out.printf("%sの平均点は%.2f点です。\n", getSubject(i), subjectAverage[i]);
		}
		// 全体の平均点を出力する
		System.out.printf("全体の平均点は%.2f点です。\n", totalAverage); 

		scan.close();
	}
	
	
	// getSubjectメソッド
	public static String getSubject(int index) {
		switch (index) {
		case 0:
			return "英語";
		case 1:
			return "数学";
		case 2:
			return "理科";
		case 3:
			return "社会";
		default:
            return "";
		}
	}
}
