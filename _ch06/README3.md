

# 객체지향개념 I(3)

## `static` 메서드와 인스턴스 메서드

> `iv` 사용여부로 구분한다!

### **인스턴스 메서드**

- 인스턴스 생성 후 ‘참조변수.메서드이름()’ 으로 호출
- 매개변수가 없기 때문에 `iv` 값을 써야 함 (반대로 `iv` 를 쓰기 때문에 매개변수가 필요 없음)
- 메서드 내에서 인스턴스 변수 `iv` 사용 가능

### **`static` 메서드**

- 객체 생성없이 호출 가능한 메서드 ‘클래스이름.메서드이름()’ 으로 호출
- 인스턴스변수`iv`를 사용하지 않을 때 붙임
- 자기 작업에 필요한 값들을 매개변수`lv`로 받음 (그래서 `iv` 가 필요 없음)

```java

class MyMath {
	long a, b;
	
	long add() { //인스턴스 메서드
		return a + b
	}
	
	static long add(long a, long b) { //클래스메서드(static메서드)
		return a + b;
	}
}

class MathTest {
    public static void main(String args[]) {
        //클래스 메서드 호출 (객체 생성없이 바로 사용 가능)
        System.out.println(Mymath.add(200L,100L));
        
        MyMath mm = new MyMath();  //인스턴스 생성
        
        mm.a = 200L;
        mm.b = 100L;
        System.out.println(mm.add()); // 인스턴스 메서드 호출
    }
}
```

## **메서드 간의 호출과 참조**

> `static` 메서드는 언제나 인스턴스 변수와 메서드 호출이 불가능하다.
> (호출 시점에 객체 생성여부를 알 수 없기 때문!)

- `static` 메서드는 인스턴스 변수(`iv`)를 사용할 수 없다.

```java
class TestClass2 {
        int iv;            // 인스턴스 변수(객체 생성 후 사용가능)
        static int cv;     // 클래스 변수 (언제나 사용가능)

    	void instanceMethod() { // 인스턴스 메서드 (객체 생성 후 호출)
            System.out.println(iv); // 인스턴스 변수를 사용할 수 있다.
            System.out.println(cv); // 클래스 변수를 사용할 수 있다.
        }
        static void staticMethod() {
            System.out.println(iv); // 에러!! 인스턴스 변수를 사용할 수 있다.
            System.out.println(iv); // 인스턴스 변수를 사용할 수 있다.
        }
}
```

---

- `static` 메서드는 인스턴스 메서드(`im`)를 사용할 수 없다.

```java
class TestClass2 {
        int instanceMethod() {}; 	   // 인스턴스 변수(객체 생성 후 사용가능)
        static void staticMethod() {}; // 클래스 변수 (언제나 사용가능)

        void instanceMethod2() { // 인스턴스 메서드 (객체 생성 후 호출)
            instanceMethod();   // 인스턴스 변수를 사용할 수 있다.
            staticMethod();     // 클래스 변수를 사용할 수 있다.
        }
        static void staticMethod2() { // static메서드
            instanceMethod();		  // 에러!!! 인스턴스 메서드를 호출 못함	
            staticMethod();			  // static 메서드는 호출 할 수 있다.

        }
}
```

---



## 오버로딩(overloading)

> 한 클래스 안에 같은 이름의 메서드 여러개 정의 하는 것

```java
void println()
void println(boolean x)
void println(char x)
void println(char[] x)
void println(double x)
void println(float x)
void println(int x)
void println(long x)
void println(Object x)
void println(String x)
```



### 오버로딩이 성립하기 위한 조건

1. 메서드 이름이 같아야 한다.
2. 매개변수의 개수 또는 타입이 달라야 한다.
3. 반환 타입은 영향 없다.