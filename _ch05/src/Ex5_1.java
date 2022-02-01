
public class Ex5_1 {

	public static void main(String[] args) {
		// 배열의 선언 - 배열을 다루기 위한 참조 변수의 선언
		// 배열의 인덱스 - 각 요소에 자동으로 붙는 번호
		
		int[] score = new int[5]; // 배열의 선언과 생성을 동시에
		score[3] = 100;
		
		int value = score[3];     //변수에 score[3]=100 을 대입
		System.out.println("value="+value);
		
		int arrayLength = score.length;
		
		for (int i = 0; i < arrayLength; i++) {
			System.out.println(score[i]);
		}
	}

}
