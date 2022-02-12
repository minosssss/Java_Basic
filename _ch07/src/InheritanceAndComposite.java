
class MyPoint {
	int x;
	int y;
}

class InheritanceCircle extends MyPoint {
	int r;
}

class CompositeCircle {
	MyPoint p = new MyPoint();
	int r;
}

public class InheritanceAndComposite {

	public static void main(String[] args) {
		InheritanceCircle c = new InheritanceCircle();
		c.x = 1;
		c.y = 2;
		c.r = 3;
		System.out.println("c.x="+c.x);
		System.out.println("c.x="+c.y);
		System.out.println("c.x="+c.r);
		
		CompositeCircle c2 = new CompositeCircle();
		c2.p.x = 1;
		c2.p.y = 1;
		c2.r = 1;
		System.out.println("c2.p.x"+c2.p.x);
		System.out.println("c2.p.x"+c2.p.y);
		System.out.println("c2.p.x"+c2.r);

	}

}
