
public class Ex4_7 {

	public static void main(String[] args) {
		int num = 0;
		
		// 괄호 {} 안의 내용을 5번 반복한다.
		for (int i = 1; i <= 20; i++) {  //1부터, 20까지, 1씩 증가
//			System.out.println(Math.random()); 				0.0<=x<1.0
//			System.out.println(Math.random()*10);			0.0<=x<10.0
//			System.out.println((int)(Math.random()*10));	0<=x<10
			System.out.println((int)(Math.random()*11)-5);//-5<=x<6
		}

	}

}
