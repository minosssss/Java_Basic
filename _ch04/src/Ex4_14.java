import java.util.Scanner;

public class Ex4_14 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.println("숫자를 입력하세요. (예:12345)");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while (num!=0) { // 0이 아닐 때 까지 반복문 실행
			// num을 10으로 나눈 나머지에 sum을 더함
			sum += num%10; // sum = sum + num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			
			num /= 10;  // num = num / 10 ; num을 10으로 나눈 값
		}
		
		System.out.println("각 자리수의 합:"+sum);

	}

}