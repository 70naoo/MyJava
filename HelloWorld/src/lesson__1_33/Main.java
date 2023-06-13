package lesson__1_33;

class Main {
	public static void main(String[] args) {
		
		// インスタンス生成する
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		
		// メソッドを呼び出す
		person1.print();

		// インスタンス生成する
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		// メソッドを呼び出す
		person2.print();

		// クラスメソッドを呼び出す
		Person.printCount();
	}
}
