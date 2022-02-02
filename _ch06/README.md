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

## 객체의 생성과 사용

### 1. 객체의 생성

```java
// 클래스 (설게도)

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

```java
클래스명 변수명;           // 클래스의 객체를 참조하기 위한 참조변수를 선언
변수명 = new 클래스명();   // 클래스의 객체를 생성 후, 객체의 주소를 참조변수에 저장

Tv t;                    // Tv클래스 타입의 참조변수 t를 선언
t = new Tv();            // Tv인스턴스를 생성한 후, 생성된 Tv 인스턴스의 주소를 t에 저장

// **Tv_타입 / t_리모콘 /** **=_연결** / **new Tv()_객체**
```

### 2. 객체의 사용

- 참조변수(여기에선 `t`)를 사용하여 접근한다.

```java
t.channel = 7;           // Tv인스턴스의 멤버변수(속성) channel의 값을 7로 한다
t.channelDown();         // Tv인스턴스의 메서드(기능)channelDown()을 호출한다
System.out.println("현재 채널은 " + t.channel + " 입니다.");
```

### 참조사항

- 타입과 (Tv) 생성하려는 객체 타입이 (new Tv) 일치해야 한다.
- 참조변수(객체의 메모리 주소를 가르킴)와 객체를 연결해 준다.

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/72551592-9fba-499c-aa74-d0d96a82b6b8/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T131358Z&X-Amz-Expires=86400&X-Amz-Signature=f17c30ec99ed6d632b3f129170beddad174dd7ac34d99daa3fea250b3da846f1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 객체의 생성과 사용 - 예제

```java
Tv t1 = new Tv();
Tv t2 = new Tv();
t2.channel = 7;
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/473fc403-1679-4cd4-8d59-37e95a9b9753/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T131441Z&X-Amz-Expires=86400&X-Amz-Signature=df730b2360310fd65d994c02266aa97a232f96e28c6dc32cb8f8adcb36fc2568&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

- `t1 = t2` 로 지정할 경우, t1의 메모리 주소가 0x200으로 바뀌면서 t1 객체는 사용불가
- 사용할 수 없는 메모리 주소는 **GC(가비지컬렉터)**가 제거를 하여 불필요한 메모리를 낭비하지 않도록 함

---

## 객체 배열

- 객체 배열 == 참조변수 배열
    
    `Tv tv1, tv2, tv3;` ▶ `Tv[] tvArr = new Tv[3];` (`Tv` 타입 참조변수 * 3)
    
- 객체를 생성해서 배열의 각 요소에 저장
- 객체 배열을 만들고 객체 생성을 꼭 해주자!
    
    ```java
    Tv[] tvArr = new Tv[3]; // Tv[] tvArr = { new Tv(), new Tv(), new Tv() };
    
    // 객체 생성
    tvArr[0] = new Tv();
    tvArr[1] = new Tv();
    tvArr[2] = new Tv();
    ```
    

## 클래스의 정의(1)

클래스 == 데이터 + 함수

1. **변수**: 하나의 데이터를 저장할 수 있는 공간
2. **배열**: 같은 종류의 여러 데이터를 하나로 저장할 수 있는 공간
3. **구조체**: 서로 관련된 여러 데이터(종류 관계X)를 하나로 저장할 수 있는 공간
4. **클래스**: 데이터와 함수의 결합(구조체+함수)

## 클래스의 정의(2)

클래스 == 사용자 정의 타입 (원하는 타입을 직접 만들 수 있다.)

### 클래스가 아닐 경우

✔Java의 시간을 다루는 클래스가 없다고 가정

```java
// 시간을 다룰 경우
int hour;
int minute;
int second;

// 여러 시간을 다룰 경우
int hour1, hour2, hour3;
int minute1, minute2, minute3;
int second1, second2, second3;

// 더 많은 시간을 다루기 위한 배열
int[] hour = new int[3];   // 시간끼리
int[] minute = new int[3]; // 분끼리
int[] second = new int[3]; // 초끼리 묶여있는 것이 문제
```

---

### 클래스로 정의할 경우

- 서로 관련 된 값을 묶을 수 있어 코드가 덜 복잡해지고, 유지보수 하기 편해지는 장점이 있다.

```java
class Time {
	int hour;
	int minute;
	int second;
}

// 한개의 객체로 3개의 변수를 활용
Time t = new Time();

// 여러 객체 생성
Time t1 = new Time();
Time t2 = new Time();
Time t3 = new Time();

// 객체 배열
Time[]t = new Time[3];
t[0] = new Time();
t[1] = new Time();
t[2] = new Time();
```