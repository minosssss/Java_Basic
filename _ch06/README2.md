# 객체지향개념 I(2)

> **객체 = `iv`(인스턴스변수)를 묶어 놓은 것**
> 

## 선언 위치에 따른 변수의 종류

1. 클래스 영역 = iv, cv
    - 변수나 메서드 선언만 가능 ( y=x+3 , System.out.println() 등은 입력 X)
2. 메서드 영역 = lv
    - 지역변수는 메서드가 끝날 때 까지만 유효함

```java
class Variables {
	int iv;          // 인스턴스  변수
	static int cv;   // 클래스변수(static변수, 공유변수)

	void method() {
		int lv = 0;    // 지역변수
	}
}
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/9af3d1da-aa60-465e-8ad5-0649075b8101/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T132228Z&X-Amz-Expires=86400&X-Amz-Signature=4b49e37de5ae347794f42ba5ac526eca94164abb17a794f8502438a3337828d6&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

---

## 클래스 변수와 인스턴스 변수

- Card 객체 예시

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/358451c1-77e6-4296-953c-f57f42a3897d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T132230Z&X-Amz-Expires=86400&X-Amz-Signature=a6df93c33f4b394a18d108614948afd42be458565ee8f218b3d5b4c5ae7e483b&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/f5b96f98-71d5-4e85-ab0e-56a1ac2f7995/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T135608Z&X-Amz-Expires=86400&X-Amz-Signature=8c749b2fcd97ce3b6ef6efd4116779217a9d5c51a8c1570ceddc95ef8f75b1c6&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 사용방법

- iv 인스턴스 변수는 객체를 만들 때마다 생성된다.
- cv 클래스 변수는 **한번만 생성**된다. (값을 하나만 유지하여 메모리 공간을 절약한다)
    - **객체 생성 없이 사용이 가능하다!**
    - 공통변수는 클래스이름을 붙여 구분을 짓는게 좋다!
    - 2개 이상의 객체가 있을 시, 1개의 객체의 공통변수 1개를 변경하면 전체가 바뀌기에 주의!

```java
Card c = new Card();
c.kind = "HEART";
c.number = 5;

Card.width = 200; //c.width = 200;
Card.height = 200; //c.height = 200;
// 공통변수는 클래스이름을 붙여 구분을 짓는게 좋다!
```

## 메서드란?

메서드 = 선언부 + 구현부

### 1. 문장들을 묶어 놓은 것

- 작업단위로 문장들을 묶어서 이름 붙인 것

### 2. 값(입력)을 받아서 처리하고, 결과를 반환(출력)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/196c335d-5dd6-472a-be35-829d8ada92f5/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T135503Z&X-Amz-Expires=86400&X-Amz-Signature=6c19820c534e457445fa5f16ae21deafd55a85874e0847605d0d143092951147&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 메서드의 호출

> 메서드이름(값1, 값2, ...);
> 

```java
print99danAll();        // void print99danAll() 호출
int result = add(3, 5); // int add(int x, int y)를 호출하고 결과를 result에 저장
```

### 메서드의 장점

- 코드의 중복을 줄일 수 있다.
- 코드의 관리가 쉽다.
- 코드를 재사용할 수 있다.
- 코드가 간결해서 이해하기 쉬워진다.

### 메서드의 작성

- 반복적으로 수행되는 여러 문장을 메서드로 작성
- 하나의 메서드는 한 가자 기능만 수행하도록 작성


## 메서드의 실행흐름

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/56e09e1d-a21d-4004-8cf1-b259400014e2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T141137Z&X-Amz-Expires=86400&X-Amz-Signature=8936c0f4b6b54d3fb0b30f1ea0fda138839c43779dc817b669f39530b7336fa1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

1. main 메서드에서 메서드 `add` 를 호출한다. 인수 1L과 2L이 메서드 add의 매개변수 a,b에 각각 복사 (대입) 된다.
2. 메서드 `add` 의 괄호 { } 안에 있는 문장들이 순서대로 수행된다.
3. 메서드 `add` 의 모든 문장이 실행되거나 `return` 문을 만나면, 호출한 메서드(main 메서드)로 되돌아 와서 이후의 문장들을 실행한다.


## retrun문

> 실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다.
> 
- 반환 타입이 `void` 인 경우

```java
void printGugudan(int dan) {
	if(!(2 < = dan && dan <= 9))
			return;  //dan의 값이 2~9가 아닌경우, 호출한 곳으로 그냥 되돌아 간다.

	for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d%n", dan, i, dan * 1);
	}
	return; //반환 타입이 void 이므로 생략가능. 컴파일러가 자동추가
}
```

- 반환 타입이 `void` 가 아닌 경우

```java
int multiply(int x, int y) {
		int result = x * y;
		return result; //반환 타입이 void가 아니므로 생략불가
}

int max(int a, int b) {
		if (a > b)
			return a; //조건식이 참일 때만 실행 된다. 참이 아닐 경우 에러 발생
}
```

## 호출스택(call stack)

> 스택(stack):밑이 막힌 상자. 위에 차곡차곡 쌓인다. First In Last Out
> 
- 메서드 수행에 필요한 메모리가 제공되는 공간
- 메서드가 호출되면 호출스택에 메모리 할당, 종료되면 해제

```java
class Stack {
	public static void main(String[] args) {
		System.out.println("Hello");		
	}
}
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/645d34cb-a8e9-461d-baff-7aaa40e152a2/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220202%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220202T144234Z&X-Amz-Expires=86400&X-Amz-Signature=15c3fb7006f5ed945d8624d714eb25d5b51d5ee63e9d8218e1f149c9d7b05b29&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

1. 비어있는 상태
2. `main` 메서드 실행
3. `println` 호출되어 작업 실행 (`main` 대기)
4. `println` 메모리 반환 후 `main` 메서드 실행상태
5. 더 이상 실행할 게 없기 때문에 `main` 메서드가 없어지며, 프로그램 종료