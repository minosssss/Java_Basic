# **ch9-1~9**

## Object클래스

- 모든 클래스의 최고 조상 오직 11개의 메서드만을 가지고 있다.
    - 우리가 사용하는 형태에 맞게 오버라이딩을 하는 경우가 많다.

### 주로 사용하는 메서드

- public boolean equals(Object obj)
    - 객체 자신과 주어진 객체 obj가 같은 객체인지 알려준다.
    - Object클래스의 equals()는 객체의 주소를 비교(참조변수 값 비교)
    - **인스턴스 변수(iv)의 값을 비교하도록 equals()를 오버라이딩 해야 한다.**

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/babf2990-6568-40ba-bc70-6ea73e74c410/Untitled.png)

- hashCode()
    - 객체의 해시코드(hash code)를 반환하는 메서드
    - Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
    - equals()를 오버라이딩하면, hashCode()도 오버라이딩해야 한다.
    - equals()의 결과가 true인 두 객체의 해시코드는 같아야 하기 때문
        - 객체마다 다른 해시코드를 반환할 때는 `identityHashCode(Object obj)` 를 사용한다.
- public String toString(): 객체 자신의 정보를 문자열로 반환한다.
    - 객체를 문자열(String)으로 변환하기 위한 메서드
- public Class getClass(): 설계도 정보

### 쓰레드 관련(13장에서 자세히 다룰예정)

- public void notify()
- public void notifyAll()
- public void wati()
- public void wait(long timeout)
- public void wait(long timeout, int nanos)

# **ch9-7~10**

## String클래스

- String클래스 = 데이터(char[]) + 메서드(문자열 관련)
- **내용을 변경할 수 없는 불변(immutable) 클래스**

```jsx
String a = "a";
String b = "b";
a = a + b;
```

- 내용을 변경할 수 없기에, 기존에 `a`  가 가르키는 메모리주소로 “ab”가 대입되는게 아니라, 새로운 주소가 `a`에 들어가게 된다.
- 덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어짐.
문자열의 결합이나 변경이  잦다면, 내용을 변경 가능한 `StringBuffer`를 사용 (변경가능)

## 문자열의 비교

- String str = “abc”; 와 String str = new String(”abc); 의 비교

```jsx
String str1 = "abc";             // 문자열 리터럴 "abc"의 주소가 str1에 저장
String str2 = "abc";             // 문자열 리터럴 "abc"의 주소가 str2에 저장
String str3 = new String("abc"); // 새로운 String인스턴스를 생성
String str4 = new String("abc"); // 새로운 String인스턴스를 생성
```

- str1 == str2 / 0x100 == 0x100 ▶ `true`  *내용 변경이 불가하지만 **공유가 가능**
- str3 == str4 / 0x200 == 0x300 ▶ `false` *항상 새로운 문자열. 즉, 각각의 객체생성가 생성

## 문자열 리터럴

- 문자열 리터럴은 프로그램 실행시 자동으로 생성된다.(constant pool에 저장)
- 같은 내용의 문자열 리터럴은 하나만 만들어진다.

## 빈 문자열(””,empty string)

- 내용이 없는 문자열. 크기가 0인 char형 배열을 저장하는 문자열
    - `String str = "";` str을 빈 문자열로 초기화
- 크기가 0인 배열을 생성하는 것은 어느 타입이나 가능
    - `char[] chArr = new char[0];` 길이가 0인 char 배열
    - `int[] iArr = {};` 길이가 0인 int 배열

<aside>
💡 char 같은 경우는 내용물이 1개의 문자로 제한되는 반면,  String은 그런 제한이 없이 문자를 담을 수 있다.
내용물의 차이는 char는 해당 변수 안에 값을 직접적으로 가지고 있고 해당 값이 있는 좌표를 가지고 있지 않는다.

</aside>

- char는 값 비교이기에, == 를 사용할 수 있지만, String은 좌표 값을 가지고 있어 .equals()를 사용하여 여부를 파악한다.

# 9-12~14

## join()과 StringJoiner

- join() 여러 문자열 사이에 구분자를 넣어서 결합한다.

```java
String animals = "dog,cat,bear";
String[] arr = animals.split(","); // 문자열을 ','를 구분자로 나눠서 배열에 저장 
String str = String.join("-",arr); // 배열의 문자열을 '-'로 구분해서 결합
System.out.println(str);           // dog-cat-bear
```

- 숫자를 문자열로 바꾸는 방법

```java
int i = 100;
String str1 = i + ""; // 100을 "100"으로 변환하는 방법1
String str2 = String.valueOf(i); // 100을 "100"으로 변환하는 방법2
```

- 문자열을 숫자로 바꾸는 방법

<aside>
💡 현재는 `parseInt`, `parseShort` 등을 사용하지 않고, `valueOf`로 사용하는 추세이다.

</aside>

```java
int i      = Integer.parseInt("100");  // "100"을 100으로 변환하는 방법1
int i2     = Integer.valueOf("100");   // "100"을 100으로 변환하는 방법2
Integer i2 = Integer.valueOf("100");   // 원래는 반환 타입이 Integer
```

# 9-21~24

## StringBuilder

- StringBuilder는 동기화 되어있지 않다. 싱글 쓰레드에 적합
- StringBuffer는 동기화되어 있다. 멀티 쓰레드에 안전(thread-safe)
- 멀티 쓰레드 프로그램이 아닌 경우, 동기화는 불필요한 성능저하를 유발
    - 이럴 때 StringBuffer대신 StringBuilder를 사용하면 성능향상

## Math클래스

- 수학관련 `static` 메서드의 집합 (iv_인스턴스변수를 만들필요 없음)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e73071b2-4e38-49da-a675-4fafbf846216/Untitled.png)

- `abs` = 절대값 구하기
- `ceil` = 올림
- `floor` = 내림
- `max` = 큰 값 (최대 값)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/59889dd8-b8ce-4947-8a21-3d1a619a4126/Untitled.png)

- `min` = 작은 값 (최소 값)
- `random` = 난수(지정 된 범위)
- `rint`, `round` = 반올림 (계산적으로는 `rint`가 오차범위가 적다.)

# 9-25~31

## 래퍼(wrapper) 클래스

- 8개의 기본형을 객체로 다뤄야할 떄 사용하는 클래스 (기본형 값을 감싸는 클래스)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/abd2111f-2d32-4457-93c4-e7d69b44e865/Untitled.png)

## Number 클래스

- 모든 숫자 래퍼 클래스의 조상

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/1cd1557f-b22d-4f4a-8164-91cd0f5dfcd7/Untitled.png)

- BigInteger (아주 큰 정수), BigDecimal (아주 큰 실수)

## 문자열을 숫자로 변환하기

- 문자열을 숫자로 변환하는 다양한 방법

```java
int i      = new Integer("100").intValue(); // floatValue(), LongValue(), ...
int i2     = Integer.parseInt("100");
Integer i3 = Integer.valueOf("100");  // int i3 로 사용해도 됨
```

- n진법의 문자열을 숫자로 변환하는 방법

```java
int 변수 = Integer.parseInt( 바꿀 숫자 , 바꿀 진수 )
```

## 오토박싱 & 언박싱

- JDK1.5 이전에는 기본형과 참조형간의 연산이 불가능했지만, 
컴파일 시 참조형에 `intValue();` 를 붙여주어 연산이 가능하게 한다.

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/b0856a2d-d98d-4a48-a104-936b56457d3f/Untitled.png)