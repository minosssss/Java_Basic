
public class Ex3_9 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b;
		
		System.out.println(c);
		/*
		 * 결과 -145479936
		 * 
		 * c = 2,000,000,000,000 이며, 10^12
		 * 하지만, int는 10^9이기 때문에 오버플로우 발생
		 * 
		 * a나 b를 Long타입으로 형변환하여 진행하면 (둘다해도무방)
		 * 두 연산자의 타입을 같게 일치 시키므로 (보다 큰 타입으로)
		 * 피연산자의 타입이 Long으로 바뀌며 계산된다.
		 * 
		 */
		
		long d = (long)a * b;
		
		System.out.println(d);
	}

}
