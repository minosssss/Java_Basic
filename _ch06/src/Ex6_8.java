class Data3 { int x; }

class Ex6_8 {
	public static void main(String[] args) {	// 1
		Data3 d = new Data3();					// 2
		d.x = 10;								// 3

		Data3 d2 = copy(d); 					// 4 (객체 생성 후, 메서드 실행), 
												// 9 (참조형이 반환되며 d2가 tmp(0x200)을 가르킨다.)
												// 10 대입 후 호출 완료
		System.out.println("d.x ="+d.x);		// 11
		System.out.println("d2.x="+d2.x);		// 11
	}

	static Data3 copy(Data3 d) {				// 5 참조형 d가 생성 (main 메서드의 변수 d와는 다른 저장공간)
		Data3 tmp = new Data3();    			// 6 (새로운 객체 tmp를 생성)

		tmp.x = d.x;  							// 7 (d.x의 값을 tmp.x에 복사)

		return tmp;   							// 8 (복사한 객체의 주소를 반환)
	}
}