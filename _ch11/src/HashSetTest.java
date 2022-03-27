import java.util.*;
public class HashSetTest {

	public static void main(String[] args) {
		Object[] objArr = {"1",new Integer(1),"2","2","3","3","4","4","4"};
		Set set = new HashSet();
		
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		System.out.println(set);  // [1, 1, 2, 3, 4] - 중복요소는 출력되지 않음

		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set2 = new HashSet();
		
		for (int i = 0; set2.size() < 6 ; i++) {
			int num = (int)(Math.random()*45) + 1;
			set2.add(new Integer(num));
		}
			
		// Set은 정렬이 불가하기 때문에 List로 변경하여 정렬해야 한다.
		List list = new LinkedList(set); // LinkedList(Collection c)
		Collections.sort(list);          // Collections.sort(List list)
		System.out.println(list);
	}
}
