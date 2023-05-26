package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		for(int i = 1;i<10;i++) {
			for(int j = 1;j<20;j++) {
				System.out.print(String.format("%03d", j) + " " + "*" + " " + String.format("%03d", i)
								 + " "  +"="+ " "  +String.format("%03d", i*j)+ " "  + "||"+ " " );
			}
			// 最後だけ||が出力されないように調整する。
			System.out.print(String.format("%03d", 20) + " " + "*" + " " + String.format("%03d", i)
							 + " "  +"="+ " "  +String.format("%03d", i*20) );

			System.out.println(""); 
		}
	}
}
