class Outer {
	private int outerIv = 0;
	private static int outerCv = 0;
	
	class InstanceInner {
		int iiv  = outerIv;  // 외부 클래스의 private 멤버도 접근 가능.
		int iiv2 = outerCv;
	}
	
	static class StaticInner {
		//스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 있다.
//		int siv = outerIv;
		static int scv = outerCv;
		
	}
	
	void myMethod()  {
		final int lv = 0;
		final int LV = 0;
		
		class LocalInner{ //지역 내부 클래스를 감싸고 있는 메서드의 상수만 사용가능. (lv, LV)
			int liv = outerIv;
			int liv2 = outerCv;
			//외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근가능하다.
			int liv3 = lv;
			int liv4 = LV;
			
		}
	}
}
