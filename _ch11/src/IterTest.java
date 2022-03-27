import java.util.ArrayList;
import java.util.Iterator;
import java.util.*;

public class IterTest {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		Iterator iter = list.iterator();
		
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			System.out.println(obj);
		}
	}

}
