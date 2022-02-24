class Product {
	int price;		 					//제품의 가격
	int bonusPoint; 					//제품 구매 시 제공하는 보너스 점수
	
	Product(int price) {    			//생성자
		this.price = price;
		bonusPoint = (int)(price/10.0); //보너스 점수는 제품가격의 10%
	}
	
}

class Tv1 extends Product {
	Tv1() {
		// 조상클래스의 생성자 Product(int price)를 호출
		super(100);						//Tv의 가격을 100만원으로 지정
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Tv"; }
}

class Computer extends Product {
	Computer() { 
		super(200); 					//Computer의 가격을 200만원으로 지정
	}
	// Object클래스의 toString()을 오버라이딩한다.
	public String toString() { return "Computer"; }
}

class Buyer {
	int money = 1000;		//소유 금액
	int bonusPoint = 0;		//보너스 점수
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}


public class PolymorphismTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
//		Product p = new Tv1();
//		b.buy(p);
		b.buy(new Tv1());  		// 위 2개를 한줄로 요약, 
								// 단, 리모컨(참조변수)이 없기 때문에 사용은 불가
		b.buy(new Computer());  
		
		System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
		System.out.println("현재 보너스점수는 " + b.bonusPoint + "점입니다.");
	}

}
