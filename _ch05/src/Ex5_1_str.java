public class Ex5_1_str {

	public static void main(String[] args) {
		String str = "MINHO";
		char ch = str.charAt(4); //(*) 해당 숫자만 출력
		System.out.println(ch);
		
		
		String str2 = str.substring(1,4); // 1~3까지
		String str3 = str.substring(1); // 1부터 끝까지
		System.out.println(str2);

	}

}