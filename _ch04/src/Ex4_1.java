import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		int score = 0;     //������ �����ϱ� ���� ����
		char grade = 'D';  //������ �����ϱ� ���� ����. �������� �ʱ�ȭ
						   //else�� ���� �ʱ� ���� D�� ��ȯ
		
		System.out.println("������ �Է����ּ���. >");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //ȭ���� ���� �Է¹��� ���ڸ� score�� ����
//		String inputScore = scanner.nextLine();
//		score = Integer.parseInt(inputScore);
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} 
//		  else {
//			grade = 'D';
//		}
		System.out.println("����� ������ "+ grade +"�Դϴ�.");
	}
}