package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		for (int i = 1 ;i < 10 ;i++) {
            // まずは08までの九九表を作成する
			for (int j = 1 ;j < 9 ; j++) {
				System.out.print(String.format("%02d", i)+ " "  + "*"+ " "  + String.format("%02d", j)+ " "  + "="+ " "  +String.format("%02d", i*j) + " "  + "||"+ " " );
			}
            // 最後だけ||が出力されないように調整する。
			System.out.print(String.format("%02d", i)+ " "  + "*"+ " "  + String.format("%02d", 9)+ " "  + "="+ " "  +String.format("%02d", i*9) );
			
			System.out.println("");
		}
	}

}
