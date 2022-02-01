public class Ex5_1_tmp2 {

	public static void main(String[] args) {
		// 배열은 한번 생성하면 그 길이를 바꿀 수 없다. 
		// 파이썬은 규칙성 없는 주소 리스트 요소에 접근하기 위해 
			// 각 요소의 주소를 가진 포인터 버퍼가 필요
		int[] score = { 50, 60, 70, 80, 90}; // new int[]를 생략할 수 있음
		
//		int[] score;
//		score = { 50, 60, 70, 80, 90};
//		이렇게 2줄로 나누면 new int[]를 생략할 수 없어 에러 발생
//		score = new int[] {50,60,70,80,90}; 도 가능 하지만, 거의 쓰이지 않음.
		System.out.println(score);
	}

}