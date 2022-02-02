
public class Ex6_4 {

	public static void main(String[] args) {
		MyMath math = new MyMath();
		long resultAdd = math.add(5L, 3L);
		long resultSubtract = math.subtract(5L, 3L);
		long resultMultiply = math.multiply(5L, 3L);
		double resultDivide = math.divide(5L, 3L);
		long maxNumber = math.max(5L, 3L);
		long minNumber = math.min(5L, 3L);
		math.printGugudan(12);
		
		System.out.println("add(5L, 3L) = " + resultAdd);
		System.out.println("subtract(5L, 3L) = " + resultSubtract);
		System.out.println("multiply(5L, 3L) = " + resultMultiply);
		System.out.println("divide(5L, 3L) = " + resultDivide);
		System.out.println("maxNumber(5L, 3L) = " + maxNumber);
		System.out.println("minNumber(5L, 3L) = " + minNumber);
		

	}

}

class MyMath {
	void printGugudan(int dan) {
		if(!(2 <= dan && dan <= 9))
			return;

		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * 1);
		}
		return; //반환 타입이 void 이므로 생략가능. 컴파일러가 자동추가
	}
	
	long add(long a, long b) {
		long result = a + b;
		return result;
		// return a + b; 도 가능
	}
	long max(long a, long b) {
		return a > b ? a : b;
	}
	long min(long a, long b) {
		return a < b ? a : b;
	}
	long subtract(long a, long b) { 
		return a - b; 
	}
	long multiply(long a, long b) { 
		return a * b; 
	}
	double divide(double a, double b) {
		return a / b;
	}
}
