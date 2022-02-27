# **ch8-1~3**

## **프로그램 오류**

- 컴파일 에러(complie-time error) : 컴파일 할 때 발생하는 에러
- 런타임 에러(runtime error) : 실행 할 때 발생하는 에러
- 논리적 에러(logical error) : 작성 의도와 다르게 동작
- Java의 런타임 에러
    - 에러 (error): 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
    - 예외 (exception): 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
- 에러(error)는 어쩔 수 없지만, 예외(exception)는 처리하자.
- 예외처리의 정의와 목적

```java
예외처리(exception handling)의
 정의) 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
 목적) 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
```

## **Exception과 RuntimeException**

- Exception클래스들: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
    - IOException : 입출력예외
    - ClassNotFoundException : 클래스(파일) 존재하지 않음
- RuntimeException 클래스들: 프로그래머의 실수로 발생하는 예외
    - ArithmeticException : 산술계산예외
    - ClassCastException : 형변환
    - NullPointerException : `null` 관련 오류 (자주 발생하는 오류)
    - IndexOutOfBoundsException: 배열 범위 벗어남

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a0e64fd7-f20b-484d-a425-028df3adb8e7/Untitled.png)

# **ch8-4~6**

## **예외처리하기. `try-catch문`**

```java
try {
    // 예외가 발생할 가능성이 있는 문장들을 넣는다.
} catch (Exception1 e1) {
    // Exception1이 발생했을 경우, 이를 처리하기 위한 문장을 적는다. ex) 돈
} catch (Exception2 e2) {
    // Exception2이 발생했을 경우, 이를 처리하기 위한 문장을 적는다. ex) 물건
} catch (ExceptionN eN) {
    // ExceptionN이 발생했을 경우, 이를 처리하기 위한 문장을 적는다. ex) 영업종료
}

//if문과 달리, try블럭이나 catch블럭 내에 포함된 문장이 하나뿐이라도 괄호{}를 생략할 수 없다.
```

# ch8-7,8

## **printStackTrace()와 getMessage()**

- printStackTrace() : 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
- getMessage() : 발생한 예외클래스의 인스턴스 저장된 메시지를 읽을 수 있다.

```java
class Ex8_5 {
	public static void main(String args[]) {
		System.out.println(1);			
		System.out.println(2);

		try {
			System.out.println(3);
			System.out.println(0/0); // 예외발생!!!
			System.out.println(4);   // 실행되지 않는다.
		} catch (ArithmeticException ae)	{
			ae.printStackTrace();
			System.out.println("예외메시지 : " + ae.getMessage());
		}	// try-catch의 끝

		System.out.println(6);
	}	// main메서드의 끝
}

/* 
결과
1
2
3
java.lang.ArithmeticException: / by zero
	at Ex8_5.main(Ex8_5.java:8)
예외메시지 : / by zero
6
*/
```

---

## 멀티 `catch`블럭

- 내용이 같은 `catch` 블럭을 하나로 합친 것(JDK1.7부터)
    - 단, `catch` 에 부모,자식 관계는 같이 들어갈 수 없다.
    - 두 예외의 공통멤버만 사용가능하다.

---

# ch8-9,10

## 예외 발생시키기

1. 연산자 `new`를 이용해서 발생시키는 예외 클래스의 객체를 만든 다음
    
    `Exception e = new Exception(”고의로 발생”);`
    
2. 키워드 `throw`를 이용해서 예외를 발생시킨다.
    
    `throw e;`
    

```java
public static void main(String args[]) {
		try {
			Exception e = new Exception("고의로 발생시켰음.");
			throw e;	 // 예외를 발생시킴
		//  throw new Exception("고의로 발생시켰음.");

		} catch (Exception e)	{
			System.out.println("에러 메시지 : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("프로그램이 정상 종료되었음.");
	}
```

## uncheckd예외, unchecked예외

- checked예외: 컴파일러가 예외 처리 여부를 체크(예외 처리 필수)
- unchecked예외: 컴파일러가 예외 처리 여부를 체크 안 함(예외 처리 선택)

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/f4d028be-be74-47a0-87d2-3a9493a8763e/Untitled.png)

- RuntimeException은 프로그래머가 주의해서 코딩해야 하는 부분은 선택적으로 할 수 있게 한다. 그게 아니라면 모든 코드에 `try-catch` 블럭이 들어가야 되는 불상사(?)가 일어날 수 있다.

---

# ch8-11~14

## 메서드에 예외선언하기

- 예외를 처리하는 방법: `try-catch`문(직접처리), 예외 선언하기(알리기), 숨기기(은폐)
- 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것

<aside>
💡 예외를 발생시키는 **`throw`**와 예외를 메서드에 선언할 때 쓰이는 **`thorws`**를 구별하자.

</aside>

```java
void method() throws Exception1, Exception2, .... ExceptionN {
		//메서드의 내용
}

//method()에서 Exception과 그 자손 예외 발생 가능
void method() throws Exception {
		//메서드의 내용
}
```

## finally블럭

- 예외 발생여부와 관계없이 수행되어야 하는 코드를 넣는다.

<aside>
💡 try 블럭 안에 return문이 있어서 try블럭을 벗어나갈 때도 finally블럭이 실행

</aside>

```java
try {
		startInstall();
		copyFiles();
} catch (Exception e) {
		e.printStackTrace();
} finally {
		deleteTempFiles();   //finally가 없다면, try와 catch 두개에 중복 된 코드 발생
}
```

---

# ch8-15~17

## 사용자 정의 예외 만들기

- 우리가 직접 예외 클래스를 정의할 수 있다.
- 조상은 Exception과 RuntimeException중에서 선택

## 예외 되던지기(exception re-throwing)

- 예외를 처리한 후에 다시 예외를 발생시키는 것
- 호출한 메서드와 호출된 메서드 양쪽 모두에서 예외처리하는 것

---

# ch8-18

## 연결된 예외

- 한 예외가 다른 예외를 발생시킬 수 있다.
- 예외 A가 예외 B를 발생시키면, A는 B의 원인 예외(cause exception)

```java
public class Throwalbe implements Serializable {
		...
		private Throwable cause = this; // 객체 자신(this)을 원인 예외로 등록
		...
		public synchronized Throwable initCause(Throwable cause) {
				...
				this.cause = cause; // cause를 원인 예외로 등록
				return this;
		}
}
```

**[이유1]** 여러 예외를 하나로 묶어서 다루기 위해서

```java
public static void main(String args[]) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();		
		}
	} // main의 끝

	static void install() throws InstallException {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다.
			copyFiles();		// 파일들을 복사한다. 
		} catch (SpaceException2 e)	{
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e);
			throw ie;
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제한다.
		} // try의 끝
	}
```

**[이유2]** checked예외(필수처리)를 unchecked예외(선택처리)로 변경하려 할 때

- 코드에서, Space와 Memory 모두 필수처리 예외이다. 이 때 한 가지를 Runtime으로 위장하여 예외처리를 한다. (try-catch 블럭을 최소화)

```java
static void startInstall() throws SpaceException2{//, MemoryException2
		if(!enoughSpace()) { 		// 충분한 설치 공간이 없으면...
			throw new SpaceException2("설치할 공간이 부족합니다.");
		}

		if (!enoughMemory()) {	// 충분한 메모리가 없으면...
//		throw new MemoryException2("메모리가 부족합니다.");
			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	} // startInstall메서드의 끝
```