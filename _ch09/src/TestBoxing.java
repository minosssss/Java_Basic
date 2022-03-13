import java.util.ArrayList;

public class TestBoxing {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(10)); // list에는 객체만 추가 가능
		list.add(100);
		
		System.out.println(list);
		
		Integer i = list.get(0);
		int i1  = list.get(0).intValue(); // intValue()로 Integer를 int로 변환
		int i2 = list.get(0);
		System.out.println(i);
		System.out.println(i1);
		System.out.println(i2);
	}

}
