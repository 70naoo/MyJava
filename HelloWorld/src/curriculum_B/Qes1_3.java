package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes1_3 {
    public static void main(String[] args) {
        // インスタンスを生成する
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();

        // ログイン時のシステムを作成
        System.out.print("ユーザー名を入力してください: ");
        //ユーザー名を書いてもらう
        String username = scan.nextLine();

        // 半角英数字かチェックする
        if (!username.matches("[a-zA-Z0-9]+")) {
            System.out.println("半角英数のみで入力してください");
            scan.close();
            return;
        // 文字数を確認する
        } else if (username == "null" || username.length() <= 0) { 
            System.out.print("名前を入力してください");
            scan.close();
            return;
        // 文字数を確認する
        } else if (username.length() > 10) {
            System.out.println("名前を10文字以内にしてください");
            scan.close();
            return; 
        // 正常だった場合の出力
        } else {
            System.out.println("ユーザー名「" + username + "」を登録しました。");
        }

        // じゃんけん
        int winCount =0;
        int drawCount =0;
        int totalCount =0;
        int count = 0; // 勝つまでにかかった回数

        while(true) {
            totalCount++;

            // ユーザーの手を入力してもらう
            System.out.print(username + "の手を選んでください（0: グー, 1: チョキ, 2: パー）: ");
            int userHand = scan.nextInt();

            // 指定する数以外なら選び直ししてもらうための文章を記入する
            if(userHand > 2 || userHand < 0) {
                System.out.println("0,1,2で選んでください。");
                continue;
            }
            // 相手の手を乱数表示する
            int pcHand = rand.nextInt(3);

            // それぞれの結果を表示する。
            System.out.println(username + "の手は「" + getHandName(userHand) + "」");
            System.out.println("相手の手は「" + getHandName(pcHand) + "」");

            // 結果を表示する
            int result = getResult(userHand, pcHand);

            // ユーザーが勝った場合
            if (result == 1) {
                winCount++;
                count++;
                System.out.println("やるやん。次は俺にリベンジさせて");
                if (winCount >= 1) {
                    break; // 勝った場合にループを抜ける
                }
             // コンピュータが勝った場合
            } else if (result == -1) {
                System.out.println("俺の勝ち！");
                System.out.println("白けは次につながるチャンスです！ネパーギブアップ！");
                count++;
             // ドローの場合
            } else {
                drawCount++;
                System.out.println("DRAW あいこ もう一回しましょう！");
                count++;
            }
        }
    
        // かかった回数を表示する
        System.out.println("勝つまでにかかった回数: " + count);
    }


    // getHandNameメソッド
    private static String getHandName(int hand) {
        switch(hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "";
        }
    }

    // じゃんけんの勝敗を判定するメソッド
    private static int getResult(int userHand, int pcHand) {
        if(userHand == pcHand) {
            return 0;
        } else if((userHand == 0 && pcHand == 1) || 
                (userHand == 1 && pcHand == 2) ||
                (userHand == 2 && pcHand == 0)) {
          return 1;
      } else {
          return -1;
      }
  }
}