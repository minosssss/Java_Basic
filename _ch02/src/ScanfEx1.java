import java.util.Scanner;


public class ScanfEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		System.out.println(num);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // 입력받은 문자열을 숫자로 변환
		System.out.println(num);
	}

}