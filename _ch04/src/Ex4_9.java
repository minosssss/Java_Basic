import java.util.Scanner;

public class Ex4_9 {

	public static void main(String[] args) {
		/*
		 * switch���� ���ǽ� ����� ���� �Ǵ� ���ڿ��̾�� �Ѵ�. 
		 * case���� ���� ����, ���(��������), ���ڿ��� �����ϸ� �ߺ����� �ʾƾ��Ѵ�.
		 * 
		 * ���� = ����, �Ǽ�
		 */

		System.out.println("���� ���� �Է����ּ���. >");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		default:
			System.out.println("������ ������ �ܿ��Դϴ�.");
		}

	}

}
