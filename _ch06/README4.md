# **객체지향개념 I(4)**

## **생성자**

> 인스턴스가 생성될 때마다 호출되는 ‘인스턴스 초기화 메서드’
> 
- 이름이 클래스 이름과 같아야 한다.
- 리턴 값이 없다. (void 안붙임) ▶ **규칙!**
- 모든 클래스는 반드시 생성자를 가져야 한다.

### **기본 생성자**

- 매개변수가 **없는** 생성자
- 생성자가 하나도 없을 때만, 컴파일러 자동추가

### **매개변수가 있는 생성자**

```java
class Car {
    String color;   // 색상
    String gearType;// 변속기 종류 - auto(자동), manual(수동)
    int door;       // 문 개수

    Car() {}        //기본생성자
    Car(String c, String g, int d) { //매개변수가 있느 생성자
        color = c;      // white
        gearType = g;   // auto
        door = d;       // 4
    }
}
```

> 생성자를 쓰는 이유는 초기화 하면서 아래 1번의 3줄을 2번으로 만들기 위해서이다!
> 

```java
//1
Car c = new Car();
c.color = "white";
c.gearType = "auto";
c.door = 4;

// 다 써주기 보단, 아래의 한 줄로 축약
//2
Car c = new Car("white", "auto", 4);
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/ba83c104-501d-4e0b-b38f-5f965ffa48c0/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220212%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220212T132929Z&X-Amz-Expires=86400&X-Amz-Signature=d30e440eacb744d5bfdeb70c20114362d465d479f26487e046214a42ef172c32&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/4d2d8aab-24fe-4b28-ab4f-cec618991d08/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220212%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220212T132932Z&X-Amz-Expires=86400&X-Amz-Signature=9d427d090b28a592a387cb2d9572ad16ce20ef221c2b66d73a389ad2f7e8983f&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 생성자 `this()`

- 생성자에서 다른 생성자 호출할 때 사용
- 다른 생성자 호출 시 첫 줄에서만 사용가능
- 코드의 중복을 제거하기 용이함

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/cbf17bc1-8fc8-4cf4-9507-7d594b406dd6/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220212%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220212T133034Z&X-Amz-Expires=86400&X-Amz-Signature=53b580045c6bb8124e5a8af08e8addb37f86a49b37b70bc9ed0647bb985c3262&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 참조변수 `this`

- 인스턴스 자신을 가리키는 참조변수
- 인스턴스 메서드(생성자 포함) 에서 사용 가능
- 지역변수 (lv) 와 인스턴스 변수 (iv) 를 구별할 때 사용 (이름이 같을 경우)

```java
class Car2 {
	// 인스턴스 변수 (iv)
	String color;
	String gearType;
	int door;

	// 생성자 호출	
	Car2() {
		this("white", "auto", 4);
	}
	
	// 생성자 호출
	Car2(String color) {
		this(color, "auto", 4);
	}
	
	// 생성자
	Car2(String color, String gearType, int door) {
		//참조변수 this
		// this.color 는 iv , color는 lv
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class Ex6_14 {
	public static void main(String[] args) {
		Car2 c1 = new Car2();	
		Car2 c2 = new Car2("blue");

		System.out.println("c1의 color=" + c1.color + ", gearType=" + c1.gearType+ ", door="+c1.door);
		System.out.println("c2의 color=" + c2.color + ", gearType=" + c2.gearType+ ", door="+c2.door);
	}
}
```

### 참조변수 `this` 와 생성자 `this()`

> `this` 와 `this()` 는 비슷하게 생겼을 뿐 완전히 다른 것이다.
> 
- `this` ▶인스턴스 자신을 가리키는 **참조변수**, 인스턴스 주소가 저장되어 있따. 모든 인스턴스 메서드에 지역벼수로 숨겨진 채로 존재한다.
- `this()` / `this(매개변수)` ▶ **생성자**, 같은 클래스의 다른 생성자를 호출할 때 사용
- 클래스 매서드에서는 사용할 수 없다.

## 변수의 초기화

- 지역변수(lv)_메서드 안의 변수_는 수동 초기화 해야함 (사용 전 꼭!)
- 멤버변수(iv, cv)는 자동 초기화 된다.

```java
class InitTest {
		int x;		  // 인스턴스 변수 (자동)
    int y = x;	// 인스턴스 변수 (자동)
    
	void method1() {
        int i;		  // 지역변수 (수동)
        int j = i;	// 에러, 지역변수를 초기화하지 않고 사용
    }
}
```

## 멤버변수의 초기화

### 1. 명시적 초기화 (=) ◀ 대입 연산자(선언 시)

```java
class Car {
		int door = 4;			      // 기본형(primitive type) 변수의 초기화
		Engine e = new Engine() // 참조형(reference type) 변수의 초기화
```

- 참조변수 유의할 점!
    - 참조형 변수는 `null(기본값l` 또는 `객체주소` 로 초기화 된다.
    - `Engine e;` 만 할 경우도 초기화는 맞지만,  꼭 객체를 생성하여 넣어준다!

### 2. 초기화 블럭

- 인스턴스 초기화 블럭 : { }
- 클래스 초기화 블럭 : static { }

### 3. 생성자 ◀ iv초기화, 복잡한 초기화

1. 자동초기화 (0)
2. 명시적(간단)초기화 (=)
3. 복잡초기화 (거의 사용하지 않음)
    1. cv ▶ `static{ }`
    2. iv ▶ `{ }` , 생성자

```java
Car2(String color, String gearType, int door) {  //매개변수있는 생성자
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
```

### `static { }` 사용예시

```java
class StaticBlockTest {
    static int[] arr = new int[10];// 명시적 초기화 - 간단초기화
    
    static {                       // 복잡(클래스)초기화 - 배열 arr을 난수로 채운다.
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*10)+1;
        }
    }
}
```

### 초기화 시점

- 클래스 변수 초기화 시점: 클래스가 처음 로딩 될 때 단 한번! (메모리에 올라 갈 때)
- 인스턴스 변수 초기화 시점: 인스턴스가 생성될 때 마다

```java
class InitTest {
    static int cv = 1;  // 명시적 초기화
    int iv = 1; 		    // 명시적 초기화
    
    static { cv = 2; }  // 클래스 초기화
    { iv = 2; }			    // 인스턴스 초기화 블럭
    
    InitTest() { 		    // 생성자
        iv = 3;
    }
}
```

`InitTest it = new InitTest();` 실행 시,

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/7c65b3b8-8b5b-429b-9ad9-833b24b967d3/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220212%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220212T133039Z&X-Amz-Expires=86400&X-Amz-Signature=e3eb36007ab6ce0fbb50a9bed31ae8275ef711a90b8559d25a0f83b108da2661&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)