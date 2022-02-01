# 객체지향개념 I

## 클래스와 객체

클래스(설계도) **—— 인스턴스화 ——>** 인스턴스(제품) 

—> 클래스를 만들었다면 인스턴스(객체)를 만들어야 제품을 사용할 수 있다.

Q. 클래스가 왜 필요한가? ▶ 객체를 **생성**하기 위해

Q. 객체가 왜 필요한가? ▶ 객체를 **사용**하기 위해

Q. 객체를 사용한다는 것은? ▶ 객체가 가진 **속성**과 **기능**을 사용하기 위해

## 객체의 구성요소

- 객체 = 속성(변수) + 기능(메서드)

```java
class Tv {
		// 속성: 크기, 길이, 높이, 색상, 볼륨, 채널 등
		String color;  // 색깔
		boolean power; // 전원상태
		int channel;   // 채널
		
		// 기능: 켜기, 끄기, 볼륨, 높이기, 볼륨 낮추기, 채널 변경 등
		void power()        { power = !power; }
		void channelUp()    { channel++; }
		void channelDown()  { channel--; }
}
```

## 객체와 인스턴스

- 객체: 모든 인스턴스를 대표하는 일반적 용어
- 인스턴스: 특정 클래스로부터 생성된 객체 (예: Tv인스턴스)

## 하나의 소스파일에 여러 클래스 작성

- 올바른 작성 예 (소스파일명: `Hello2.java`)

```java
public class Hello2 {}
			 class Hello3 {}
// public class가 있는 경우, 
// 소스파일의 이름은 반드시 public class의 이름과 일치해야 한다.
```

```java
class Hello2 {}
class Hello3 {}
// public class가 하나도 없는 경우, 
// 소스파일의 이름은 Hello2, Hello3 둘다 가능하다.
```

---

- 잘못된 작성 예 (소스파일명: `Hello2.java`)

```java
public class Hello2 {}
public class Hello3 {}
// 하나의 소스파일에 둘 이상의 public class 가 존재하면 안 된다.
// 각 클래스를 별도의 소스 파일에 나눠서 저장하던가
// 아니면 둘 중의 한 클래스에 public을 붙이지 않아야 한다.
```

- 소스파일명: `Hello3.java`

```java
public class Hello2 {}
		   class Hello3 {}
// 소스파일의 이름이 public class의 이름과 일치하지 않는다.
```

- 소스파일명: `hello3.java`

```java
public class Hello2 {}
		   class Hello3 {}
// 소스파일의 이름과 public class의 이름이 일치하지 않는다.
// 대소문자를 구분하므로 대소문자까지 일치해야 한다.
```

---