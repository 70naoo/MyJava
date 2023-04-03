
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package array2.java__1_14;

public class practice {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String [] a  = {"a","b","c","d","e","f","g","h","i","j"};
		
//		break文
		for(int i = 0; i < 10; i++) {
			if(i > 3) {
				break;
			}
			System.out.println(a[i]);
		}
		
//        一行開ける
		System.out.println("");
		
//		continue文
		for(int x = 0;x < 10; x++) {
			if(x == 8) {
				continue;
			}
			System.out.println(a[x]);
		}
	
	}

}
