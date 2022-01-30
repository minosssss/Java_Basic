import java.util.Scanner;

public class Ex4_9 {

	public static void main(String[] args) {
		/*
		 * switch문의 조건식 결과는 정수 또는 문자열이어야 한다. 
		 * case문의 값은 정수, 상수(문자포함), 문자열만 가능하며 중복되지 않아야한다.
		 * 
		 * 에러 = 변수, 실수
		 */

		System.out.println("현재 월을 입력해주세요. >");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		default:
			System.out.println("현재의 계절은 겨울입니다.");
		}

	}

}
