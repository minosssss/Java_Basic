import java.util.Scanner;


public class ScanfEx1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		int num = scanner.nextInt();
//		System.out.println(num);
		
		String input = scanner.nextLine();
		int num = Integer.parseInt(input); // �Է¹��� ���ڿ��� ���ڷ� ��ȯ
		System.out.println(num);
	}

}
