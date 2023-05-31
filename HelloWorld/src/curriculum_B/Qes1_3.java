// 1 ログイン時の入カチェックシステムを下記条件で作成してください
// ・コンソールにユーザー名を入力できるようにしてください
// ・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
// ・ユーザー名の文字数が0文字以下もしくはnulの場合「名前を入力してください」と出力してください
// ・ユーザー名が正常な値だった場合「ユーザー名「入力したユーザー名」を登録しました」と出力してください

// 2   ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください

// 3 じゃんけんのシステムを下記の条件で作成してください
// ・「0はグー、1：チョキ、2：パー」とすること
// ・じゃんけんに勝つまでループすること
// ・一回ごとに自分の手と相手の手を下記の通り出力してください
// ユーザー名「name」を登録しました
// nameの手は「パー」
// 相手の手は「グー」
// ・条件分岐の設定
// ・自分がじゃんけんに勝った場合、下記が出力されるようにしてください
// やるやん。
// 次は俺にリベンジさせて
// ・自分がじゃんけんでゲーに負けた場合、下記が出力されるようにしてください
// 俺の勝ち！
// 白けは次につながるチャンスです！
// ネパーギブアップ！
// ・自分がじゃんけんでチョキに負けた場合、下記が出力されるようにしてください
// 俺の勝ち！
// たかがじゃんけん、そう思ってないですか？
// それやったら次も、俺が勝ちますよ
// ・自分がじゃんけんでバーに負けた場合、下記が出力されるようにしてください
// 俺の勝ち！
// なんで負けたか、明日まで考えといてください。
// そしたら何かが見えてくるはずです
// ・あいこの場合、下記が出力されるようにしてください
// DRAW あいこ もう一回しましょう！
// じゃんけんを行った回数を表示してください
// 勝つまでにかかった合計回数は1回です
// ユーザー名が正常の場合じゃんけんのシステムが起動するようにしてください



package curriculum_B;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
	public static void main(String[] args) {
		
		// インスタンスを生成する
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		// ユーザー名を買うのうするための配列を作成する
		String username = null;
		
		// フラグ処理をする
		boolean usernameOK = false;

		// 正しいユーザー名が記入されるまでループする
		while (!usernameOK) {
			
			System.out.print("ユーザー名を入力してください: ");
			
			username = scan.nextLine();
			
			System.out.println("");
			
			// nullか空白なら記入し直ししてもらう
			if (Objects.isNull(username) || username.isEmpty()) {
				
				System.out.println("名前を入力してください");
				
				// 半角英数字のみではなかった場合記入し直してもらう
			} else if (!username.matches("[a-zA-Z0-9]+")) {
				
				System.out.println("半角英数字のみで名前を入力してください");
				
				// 10字より大きかった場合記入し直してもらう
			} else if (username.length() > 10) {
				
				System.out.println("名前を10文字以内にしてください");
				
				// 条件を満たせばループを抜けてもらう
			} else {
				
				usernameOK = true;
			}
		}
		
		System.out.println("ユーザー名「" + username + "」を登録しました");
		
		System.out.println("");

		// じゃんけん
		int count = 0;
		// 結果の変数を定義して初期値は0とする
		int result = 0;

		// 買った場合以外はループを続ける
		while (result != -1) {
			
			// ユーザーの手を入力してもらう
			System.out.print(username + "の手を選んでください（0: グー, 1: チョキ, 2: パー）: ");
			int userHand = scan.nextInt();

			// 0.1.2のいずれかではなかった場合、選び直す
			if (userHand > 2 || userHand < 0 || Objects.isNull(userHand)) {
				System.out.println("0,1,2で選んでください。");
				continue;
			}

			String[] userHands = { "グー", "チョキ", "パー" };
			// 相手の手を乱数で表す
			int pcHand = rand.nextInt(3);

			// それぞれの結果を表示する。
			System.out.println(username + "の手は「" + userHands[userHand] + "」");
			System.out.println("相手の手は「" + userHands[pcHand] + "」");

			// 結果
			result = (userHand - pcHand + 3) % 3;
			count++;

			// 結果によって場合分する
			if (result == 0) {
				
				System.out.println("\nDRAW あいこ もう一回しましょう！\n");
				
			} else if (result == 1) {
				
				System.out.println("\n俺の勝ち！");
				
				if (pcHand == 0) {
					
					System.out.println("負けは次につながるチャンスです！");
					
				} else if (pcHand == 1) {
					
					System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ\n");

				} else {
					
					System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです\n");
					
				}
				
			} else {
				
				System.out.println("\nやるやん。次は俺にリベンジさせて\n");
				
				break;
			}

		}
		
		// かかった回数を表示する
		System.out.println("勝つまでにかかった回数: " + count);
		scan.close();
	}
}
