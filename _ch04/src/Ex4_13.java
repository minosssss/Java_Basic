
public class Ex4_13 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		//i를 1씩 증가시켜서 sum에 계속 더해나간다.
		while (sum<=100) {
			System.out.printf("%d - %d%n", i, sum);
			sum += ++i; //값이 증가하고 작업이 수행
		}

	}

}
