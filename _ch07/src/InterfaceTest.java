
class A {
//	public void method(B b) {
//		b.method();
//	}
	public void method(I i) { // 인터페이스 I를 구현한 class만 들어와라
		i.method();
	}
}

// B클래스의 선언과 구현을 분리
interface I {
	public void method();
}


class B implements I {
	public void method() {
		System.out.println("B클래스의 메서드");
	}
}

class C implements I {
	public void method() {
		System.out.println("C클래스의 메서드");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		A a = new A();
		a.method(new B());   // A가 B를 사용 (의존)
		a.method(new C());   // 인터페이스가 없다면, A 클래스가 B로 되어 있어 C를 바꿔야 하는 불편함
		// 물론 인터페이스를 각 클래스에서 구현해줘야 하지만, 변경 포인트가 적고 관리가 용이하기에 사용한다.
	}

}
