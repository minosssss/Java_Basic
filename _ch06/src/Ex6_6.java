class Data { int x; }

class Ex6_6 {
	public static void main(String[] args) {		// 1
		Data d = new Data();  						// 2
		d.x = 10;									// 3
		System.out.println("main() : x = " + d.x);	

		change(d.x);								// 7
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}

	static void change(int x) {  // 기본형			// 4
		x = 1000;									// 5
		System.out.println("change() : x = " + x);
	} 												// 6
}