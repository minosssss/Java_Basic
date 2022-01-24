
public class VarEx4 {

	public static void main(String[] args) {
		int x = 4, y = 2;
		int tmp;
		
		tmp = x; //1. x의 값을 tmp에 저장
		x = y; 	 //2. y의 값을 x에 저장
		y = tmp; //3. tmp의 값을 y에 저장
		
		System.out.println("x="+x);
		System.out.println("y="+y);
	}

}

/* Java는 데이터를 다루는 최소 단위가 1byte = 8bit
 * 기본형 8가지타입
 * 논리형_boolean(1byte) 		-> true와 false중 하나의 값을 가짐
 * 문자형_char(2byte)    		-> '하' '나' 의 문자만 저장 가능
 * 정수형_byte(1) short(2) 
 * 		int(4) long(8)		-> int(4byte)가 주로 사용되며, long은 아주 큰 정수
 * 실수형_float(4) double(8)	-> 부동소수점 적용		 
 * 
 * 참조형 타입
 * 참조형 기본형을 제외한 나머지 String System
 * Date today; //참조형 변수 today를 선언
 * today = new Date(); 
 * //new Date(); -> 객체생성 
 * //today = new Date(); -> today에 객체의 주소를 저장
 */
