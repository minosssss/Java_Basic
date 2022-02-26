class AAA {				// AAA는 BBB의 외부클래스
	int i = 100;
	BBB b = new BBB();

	class BBB {
		void method() {	// BBB는 AAA의 내부클래스
//			AAA a = new AAA();
//			System.out.println(a.i);
			System.out.println(i);  //객체 생성 없이 외부 클래스의 멤버 접근가능
		}
	}
}

class CCC {
//	BBB b = new BBB();
}


public class InnerTest {
	public static void main(String[] args) {
//		BBB b = new BBB();
//		b.method();
		AAA a = new AAA();
		a.b.method();

	}

}
