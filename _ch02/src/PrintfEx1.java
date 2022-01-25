
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3); 
		// 3 >> 정수를 정수로 나누었기에 정수가 나옴
		System.out.println(10.0/3); 
		// 3.3333333333333335 >> 실수로 얻으려면 1개를 실수로 변경해야 함
		System.out.printf("age: %d year:%d \n", 34, 1989);
		System.out.printf("%s", Integer.toBinaryString(15));
		String url = "www.codechobo.com";
		float f1 = .10f;   // 0.10, 1.0e-1
		float f2 = 1e1f;   // 10.0, 1.0e1, 1.0e+1
		float f3 = 3.14e3f;
		double d = 1.23456789;
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1); 
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2); 
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d);
		System.out.printf("d=%14.10f%n", d); // 전체 14자리 중 소수점 10자리
		System.out.printf("[12345678901234567890]%n");
		System.out.printf("[%s]%n", url);
		System.out.printf("[%20s]%n", url);
		System.out.printf("[%-20s]%n", url); // 왼쪽 정렬
		System.out.printf("[%.8s]%n", url);  // 왼쪽에서 8글자만 출력
		/*
		 * println()의 단점
		 * 1. 출력형식 지정불가
		 * 2. 10진수로만 출력
		 * 
		 * printf()로 출력형식 지정가능
		 * ✔정수
		 * %b(불리언), %d(10진수), %o(8진수), %x or %X(16진수)
		 * ✔실수
		 * %f(부동소수점), %e or %E(지수)
		 * ✔문자
		 * %c(문자-1자리), %s(문자열)  
		 */
	}

}
