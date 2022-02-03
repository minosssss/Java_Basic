class Data2 { int x; }

class Ex6_7 {
	public static void main(String[] args) {		// 1
		Data2 d = new Data2();						// 2
		d.x = 10;									// 3
		System.out.println("main() : x = " + d.x);

		change(d);									// 메서드실행
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);	// 7
	}

	static void change(Data2 d) { // 참조형			// 4
		d.x = 1000;									// 5
		System.out.println("change() : x = " + d.x);
	}												// 6
}