# **객체지향개념 II(3)**

## `instanceof` 연산자

- 참조변수의 형변환 가능여부 확인에 사용.
- 형번환 전에 반드시 `instanceof` 로 확인해야 함.
- 참조변수를 형변환하기 전에 형변환 가능여부를 확인할 때 사용

```java
void doWork(Car c) {
    if (c instanceof FireEngine) {
        FireEngine fe = (FireEngine)c;
        fe.water();
    }
}
```

### 참조변수 형변환을 사용하는 이유

- 참조변수(리모콘)을 변경함으로써 사용할 수 있는 멤버의 갯수를 조절하기 위해

## 매개변수의 다형성

- 참조형 매개변수는 메서드 호출시, **<u>자신과 같은 타입 또는 자손타입</u>**의 인스턴스를 넘겨줄 수 있다.

1. 다형적 매개변수

```java
Product p1 = new Tv();
Product p2 = new Computer();
Product p3 = new Audio();
```

2. 하나의 배열로 여러종류 객체 다루기

```java
Product p[] = new Product[3];
p[0] = new Tv();
p[1] = new Computer();
p[2] = new Audio();
```

## 추상클래스(abstarct class)

- 미완성 설계도. 미완성 메서드를 갖고 있는 클래스 (구현부가 없음)
- **다른 클래스 작성에 도움을 주기 위한 것**. 인스턴스 생성 불가.

```java
abstract class Player {			// 추상클래스(미완성 클래스)
	abstract void play(int pos);// 추상메서드(몸통{}이 없는 미완성 메서드)
	abstract void stop();		// 추상메서드
}
Player p = new Player(); 		// **에러**, 추상 클래스의 인스턴스 생성불가
```

- 상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능(강제성)

```java
class AudioPlayer extends Player {
    void play(int pos) { /* 생략 */ }
    void stop() 	   { /* 생략 */ }
}
AudioPlayer ap = new AudioPlayer(); // 인스턴스 생성 OK!
```

### 추상클래스의 작성

- 여러 클래스에 공통적으로 사용될 수 있는 **추상클래스를** 바로 작성하거나, 기존 클래스의 공통 부분을 뽑아서 **추상클래스를** 만든다.

```java
class Marine {
    int x,y; 				//현재위치
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    void stop() 			{ /* 현재 위치에 정지 */ }
    void stimPack()			{ /* 스팀팩을 사용한다. */ }
}

class Tank {
    int x,y; 				//현재위치
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    void stop() 			{ /* 현재 위치에 정지 */ }
	void changeMode() 		{ /* 공격모드를 변환한다. */ }
}

class Dropship	{
	int x,y; 				//현재위치
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
	void load()   			{ /* 선택된 대상을 태운다. */ }
	void unload() 			{ /* 선택된 대상을 내린다. */ }
}

```

- 위에서 공통부분 (현재위치, 이동, 정지)를 따로 빼서 추상클래스 생성

```java
abstract class Unit {
	int x, y;
	abstract void move(int x, int y);
	void stop() 			{ /* 현재 위치에 정지 */ }
}

class Marine extends Unit { // 보병
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y=" + y + "]");
	}
	void stimPack() 		{ /* 스팀팩을 사용한다. */ }
}

class Tank extends Unit { // 탱크
	void move(int x, int y) {
		System.out.println("Tank[x=" + x + ",y=" + y + "]");
	}
	void changeMode() 		{ /* 공격모드를 변환한다. */ }
}

class Dropship extends Unit { // 수송선
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	void load()   			{ /* 선택된 대상을 태운다. */ }
	void unload() 			{ /* 선택된 대상을 내린다. */ }
}
```

### 미완성의 장점

- 공통부분을 관리할 수 있어서 중복을 제거하고 관리(변경)이 용이하다.
- 단계별로 추상클래스를 만들어 확장의 유연성을 높일 수 있다.

### 추상화 <---> 구체화

> 구체적인 게 좋은거 아닐까?

- 추상화된 코드는 구체화 된 코드보다 유연하여 변경에 유리
