
public class VarEx3 {

	public static void main(String[] args) {
		final int score = 100; //되도록 선언과 동시에 초기화를 하자.
		
		String str = "";
		
		System.out.println(score);
		System.out.println(str+7+7); //77
		System.out.println(7+7+str); //14
		
		
	}

}

/* boolean power = true;논리형
 * 
 * char ch = 'A'; 	   	문자형은 작은 따옴표
 * String str = "ABC"; 	문자열은 큰 따옴표 
 * (하나의 문자 및 빈 문자열도 가능 ex. "A"; or "";)
 * 
 * String s1 = 
 * String S2 = new String
 * 
 * 
 * byte b = 127;        정수형 int 타입 , byte = -128~127 , 128은 에러
 * 
 * int i = 100;		  10진수
 * int b = 0b0101;    2진수
 * int oct = 0100; 	  8진수
 * int hex = 0x1000;  16진수
 * 20억이 넘어갈 경우, 접미사 L을 붙여 long 타입으로 변환
 * long l = 10_000_000_000L;
 * 
 * float f = 3.14f;  > f가 생략될 경우 에러가 발생
 * double d = 3.14d; > 생략가능하며, f가 붙어도 무방하나 지양
 */