import java.util.Scanner;

public class Ex4_1 {

	public static void main(String[] args) {
		int score = 0;     //점수를 저장하기 위한 변수
		char grade = 'D';  //학점을 저장하기 위한 변수. 공백으로 초기화
						   //else를 쓰지 않기 위해 D로 변환
		
		System.out.println("점수를 입력해주세요. >");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
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
		System.out.println("당신의 학점은 "+ grade +"입니다.");
	}
}