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
				System.out.println("DRAW あいこ もう一回しましょう！");
			} else if (result == 1) {
				System.out.println("俺の勝ち！");
				if (pcHand == 0) {
					System.out.println("負けは次につながるチャンスです！");
				} else if (pcHand == 1) {
					System.out.println("たかがじゃんけん、そう思ってないですか？\nそれやったら次も、俺が勝ちますよ");
				} else {
					System.out.println("なんで負けたか、明日まで考えといてください。\nそしたら何かが見えてくるはずです");
				}
			} else {
				System.out.println("やるやん。次は俺にリベンジさせて");
				break;
			}

		}
		// かかった回数を表示する
		System.out.println("勝つまでにかかった回数: " + count);
		scan.close();
	}
}
