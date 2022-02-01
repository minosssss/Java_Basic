
public class VarEx12 {

	public static void main(String[] args) {
		String str = "3";
		
		// 문자를 숫자로
		System.out.println(str.charAt(0) - '0'); 
		System.out.println('3' - '0' + 1);
		// 메서드를 이용하여 문자에서 숫자로
		System.out.println(Integer.parseInt(str)+2);
		System.out.println(Double.parseDouble("3.4"));
		
		System.out.println("3" + 1);  // 1이 문자열로 변환
		System.out.println(3 + '0');  // '0'은 숫자로 48
		
		System.out.println((char) (3 + '0'));  // 형 변환
		/*
		 * 1. 문자와 숫자간 변환
		 * 숫자에서 문자로 바꿀 때는 +'0'
		 * 문자에서 숫자로 바꿀 때는 -'0'
		 * 
		 * 2. 문자열로 변환
		 * 문자, 숫자 관계없이 빈문자열을 더한다 +""
		 * 
		 * 3. 문자열 > 숫자
		 * "3" -> 3
		 * 메서드활용 -> Integer.parseInt("3");
		 * "3.4" -> 3.4
		 * 메서드활용 -> Double.parseDouble("3.4");
		 * 
		 * 4. 문자열에서 문자로
		 * "3" -> '3'
		 * 메서드활용 -> "3".charAt(0);
		 */
	}

}
