import java.util.Scanner;

public class Ex4_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		// 1~100사이의 정수를 입력
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		
		
		// while 문으로 변경할 경우 입력 값이 2개로 되기에, do while이 효율적
		do {
			System.out.print("1과 100사이의 정수를 입력하세요. > ");
			input = scanner.nextInt();
			
			if (input > answer) {
				System.out.println("더 작은 수로 다시 시도해보세요.");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 시도해보세요.");
			}
		} while(input!=answer);
		
		System.out.println("정답입니다.");
	}

}