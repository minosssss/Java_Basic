
public class Ex6_3 {

	public static void main(String[] args) {
		System.out.println(Card.width);
		System.out.println(Card.height);
		
		Card heartCard = new Card();
		heartCard.kind = "Heart";
		heartCard.number = 7;
		
		Card spaceCard = new Card();
		spaceCard.kind = "Space";
		spaceCard.number = 5;
		
		System.out.println("heartCard은 " + heartCard.kind + ", " + heartCard.number + "이며, 크기는 (" + heartCard.width + ", " + heartCard.height + ")");
		System.out.println("spaceCard는 " + spaceCard.kind + ", " + spaceCard.number + "이며, 크기는 (" + spaceCard.width + ", " + spaceCard.height + ")");
		System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
		
		Card.width = 50;
		Card.height = 80;
		System.out.println("heartCard은 " + heartCard.kind + ", " + heartCard.number + "이며, 크기는 (" + heartCard.width + ", " + heartCard.height + ")");
		System.out.println("spaceCard는 " + spaceCard.kind + ", " + spaceCard.number + "이며, 크기는 (" + spaceCard.width + ", " + spaceCard.height + ")");
		
	}

}

class Card {
	String kind;
	int number;
	static int width = 250;
	static int height = 150;
}
