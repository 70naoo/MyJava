package curriculum_New_question__1_18;
import java.util.Random;

public class Curriculum_New_1_18{
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello (String name, int p) {
		 System.out.println(name + p);// 文字列と整数を連結して出力
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void malti (int x ,int y) {
			int result = x * y;// xとyを掛け合わせた結果をresult変数に格納
			System.out.println(result);
		}
		
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void array (int [] arr) {
		for (int i = 0 ; i<arr.length;i++) { // arrの数文繰り返す
			System.out.println(arr[i]);
		}
	}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void malti (double x ,double y) {
		double result = x + y; // xとyを足した結果をresult変数に格納
		System.out.println(result);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	
	
	public static int[] generateRandomNumbers(int count) { 
	    Random random = new Random(); // 乱数を生成するRandomクラスのインスタンスを作成する
	    int[] result = new int[count]; // count個分の整数を格納するための配列

	    for (int i = 0; i < count; i++) { // count回分だけ繰り返す
	    	result[i] = random.nextInt(100) + 1; // 100までの乱数を生成にプラス１する
	      
	        if (result[i]  != 0) { // 生成した乱数が0でなければという条件
	            System.out.println(result[i]); 
	        }
	    }

	    return result; 
	}
	
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	
	
	public static double calculateAverage(int[] numbers) {
	    double sum = 0; // 合計の変数sumを初期化する
	    for (int number : numbers) {
	        sum += number; //できたものから順にsumに加算する
	    }
	    double average = sum / numbers.length; //平均値を求める
	    System.out.println("平均値は " + average + " です。");
	    return average; 
	}


	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください

	 public static boolean checkValue(double average) {
	        if (average >= 50) {
	        	System.out.println("true");
	            return true; // 平均値が50以上ならtrue
	        } else {
	        	System.out.println("false");
	            return false; // 平均値が50未満ならfalse
	        }
	    }
	

	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	//問１
	hello("hello javaSE ",11);
	//問2
	malti(3,4);
	//問3
	int arr[] = {1,2,3,4,5,6};
	array(arr);
	//問４
	malti(2.234,4.56);
	//問５
	int[] numbers = generateRandomNumbers(5);
	//問６
	 double average = calculateAverage(numbers);
	//問７
    checkValue(average);

	}
}