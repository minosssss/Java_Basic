## 인터페이스 `interface`

- 프로그래밍 관점에서  인터페이스는 **추상 메서드의 집합**
- 구현된 것이 전혀 없는 설계도, 껍데기(모든 멤버가 `public`)

✔ 추상클래스와 다른 점!

| 인터페이스                  | 추상클래스                                                   |
| --------------------------- | ------------------------------------------------------------ |
| - 클래스가 아니다.          | - 클래스이다.                                                |
| - 추상메서드만 가지고 있다. | - 추상메서드와 함께 **멤버변수**와 **생성자**를 가질 수 있다. |

---

```java
//인터페이스는 모두 public이여야 한다.
interface 인터페이스이름 {
    public static final 타입 상수이름 = 값;
    public abstract 메서드이름(매개변수목록)
}
```

```java
//그렇기에 public과 abstract 는 생략 가능

interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3;		 // public static final int DIAMOND = 3;
    static int HEART = 2;		 // public static final int HEART = 2;	
    int CLOVER = 1;				 // public static final int CLOVER = 1;
    
    public abstract String getCardNumber();
    String getCardKind();		 // public abstract String getCardKind();
}
```



### 인터페이스의 상속

- 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님!)
- 다중 상속(조상이 여러개) 가능 - 추상메서드는 충돌해도 문제 없음

### 인터페이스의 구현

- 인터페이스에 정의된 추상 메서드를 완성하는 것

```java	
class 클래스이름 implements 인터페이스이름 {
    // 인터페이스에 정의된 추상메서들르 모두 구현해야 한다.
}
```

```java
interface Fightable {
    void move(int x, int y);
    void attack(Unit u);
}

class Fighter implements Fightable {
    public void move(int x, int y) { /* 내용생략 */ }
    public void attack(Unit u) 	   { /* 내용생략 */ }
}
```

- 일부만 구현하는 경우, 클래스 앞에 abstract를 붙여야 함.

```java
abstract class Fighter implements Fightable {
    public void move(int x, int y) { /* 내용생략 */ }
//  public abstract void attack(Unit u);  생략되어 있음
}
```

### 인터페이스와 다형성

- 인터페이스도 구현 클래스의 부모로 가능!
- 인터페이스 타입 매개변수는 **인터페이스 구현한 클래스의 객체만 가능**
- 인터페이스를 메서드의 리턴타입으로 지정할 수 있다.

### 인터페이스의 장점

✔ 사람이 기계를 직접만지는 게 아니라, 껍데기(조작버튼)을 통해 만지는 것을 인터페이스라고 생각하자!

ex. ) 윈도우를 통해 컴퓨터를 조작한다!

- 두 대상(*객체) 간의 '연결, 대화, 소통'을 돕는 '중간 역할'을 한다.
- 선언(설계)와 구현을 분리시킬 수 있게 한다.

![image-20220226171435944](C:\Users\minO\AppData\Roaming\Typora\typora-user-images\image-20220226171435944.png)

- 개발 시간을 단축할 수 있다.
  - 위 그림에서, `A` 가 `B` 를 사용하려면, `B` 가 완성 될 때까지 기다려야 한다.
  - 하지만 인터페이스 `I` 가 있다면, 미리 구현할 수 있다. (추상메서드 호출 사용)
- 변경에 유리한 유연할 설계가 가능하다.
- 표준화가 가능하다.  [Java App. ↔ JDBC (인터페이스)  ↔ DB]
- 서로 관계없는 클래스들을 관계를 맺어줄 수 있다.

### `default` 메서드와 `static` 메서드

- 인터페이스에 default와, static메서드 추가 가능.
- 인터페이스에 새로운 메서드(추상메서드)를 추가하기 어려움.
  - 만약, 메서드가 추가 될 때 연결되어 있는 모든 `class` 에 메서드를 추가해주어야 함.
  - 이때 `default method` 를 사용하여 해결해준다.
- 디폴트 메서드는 인스턴스 메서드(인터페이스 원칙 위반)
- 디폴트 메서드가 기존의 메서드와 충돌할 때의 해결책
  1. 여러 인터페이스의 디폴트 메서드 간의 충돌
     - 인터페이스를 구현한 클래스에서 디폴트 메서드를 오버라이딩해야 한다.
  2. 디폴트 메서드와 조상 클래스의 메서드 간의 충돌
     - 조상 클래스의 메서드가 상속되고, 디폴트 메서드는 무시된다.

---

## 내부 클래스 (inner class)

- 클래스 안의 클래스 (멤버가 추가 된다고 보면 된다!)

  ```java
  class A {	  //외부 클래스
      ...
  	class B { //내부 클래스
          ...
      }
  }
  ```

- 내부 클래스의 장점

  - 내부 클래스에서 외부 클래스의 멤버들을 쉽게 접근할 수 있다.
  - 코드의 복잡성을 줄일 수 있다. (캡슐화)

### 내부 클래스의 종류와 특징

- 내부 클래스의 종류와 유효범위(scpoe)는 변수와 동일

![image-20220226193931672](C:\Users\minO\AppData\Roaming\Typora\typora-user-images\image-20220226193931672.png)

![image-20220226194036346](C:\Users\minO\AppData\Roaming\Typora\typora-user-images\image-20220226194036346.png)











