package lesson__1_31;

class Person {
	
	// インスタンスフィールドを定義する
	public static int count = 0;
	
	public String firstName;
	
	public int age;
	
	public double height, weight;

	public String lastName;
	
	// コンストラクタを定義する
	Person(String firstName, String lastName, int age, double height, double weight) {
		
		this.firstName = firstName;
		
		this.lastName = lastName;
		
		this.age = age;
		
		this.height = height;
		
		this.weight = weight;
		
	    Person.count++; 
	    
	  }

	// fullnameメソッドを作成する
	public String fullName() {
		
		return this.firstName + this.lastName;
		
	}
	
	// printメソッドを作成する
	public void print() {
		
		System.out.println("名前は" + this.fullName() + "です");
		
		System.out.println("年は" + this.age + "です");
		
	}
	
	// buyメソッドを作成
	public void buy(Car car) {
		
	car.setOwner(this.fullName());
	
	System.out.println(car.getOwner() + "が購入しました");
	
	}

	// printメソッドを作成する
	public void buy(Bicycle bicycle) {
		
	bicycle.setOwner(this.fullName());
	
	System.out.println(bicycle.getOwner() + "が購入しました");
	
	}
}

