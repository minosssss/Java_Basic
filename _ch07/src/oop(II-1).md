# **객체지향개념 II(1)**

## 상속 (Inheritance)

- 기존의 클래스로 새로운 클래스를 작성 하는 것 (코드의 재사용)
- 두 클래스를 부모와 자식으로 관계를 맺어주는 것.
- 자손은 조상(부모의 부모 포함)의 모든 멤버를 상속받는다. **(생성자, 초기화 블럭 제외)**
- 자손의 변경은 조상에 영향을 미치지 않는다.

```java
// 부모
class Point {  // 2차원 좌표의 한 점
		int x;
		int y;
}

// 자식
class Point3D extends Point { // Point를 상속받아 3차원으로 변환
		int z;
}
```

## 포함(composite)

- 클래스의 멤버로 참조변수를 선언하는 것

```java
class Point {  // 2차원 좌표의 한 점
		int x;
		int y;
}

// Circle이 Point를 포함
class Circle {
		Point c = new Point(); // 원점
		int r; // 반지름
}
```

## 클래스 간의 관계 결정하기

> 상속관계 - ‘~은 ~이다. (is-a)’
포함관계 - ‘~은 ~을 가지고 있다. (has-a)’
> 

```java
class Point { 
		int x;
		int y;
}

// 포함 - Circle은 Point를 가지고 있다.
class Circle {
		Point c = new Point();
		int r;
}

// 상속 - Circle은 Point이다.
class Circle extends Point {
		int r;
}
```

- 포함의 메모리 스택

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/d0fc2eb2-175d-4e1e-80c0-43ec5488f069/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220213%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220213T132742Z&X-Amz-Expires=86400&X-Amz-Signature=5fd3f9684ea5c0a7ce70c5260e0a8607e187908aa917ea757f248e9765f8a3d6&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

## 오버라이딩

- 상속받은 조상의 메서드를 **자신에 맞게 변경하는 것**
- 선언부는 변경이 불가하며, 내용만 변경 가능.

```jsx
class Point {
	int x;
	int y;
	String getLocation() {
		return "x:"+x+", y:"+y;
	}
}

class Point3D extends Point {
	int z;
	
	// 조상의 getLocation()을 오버라이딩
	String getLocation() {
		return "x:"+x+", y:"+y+", z:"+z;
	}
}
```

### 오버라이딩의 조건

1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
    - `public` , `protected` , `default` , `private`
3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
    - `IOException` , `SQLException` 등...

### 오버로딩 vs 오버라이딩

- 오버로딩 : **기존에 없는** 새로운 메서드를 정의하는 것
- 오버라이딩: **상속받은** 메서드의 내용을 변경하는 것

## 참조변수 `super`

- 객체 자신을 가리키는 참조변수
- 조상과 자기자신을 구분지을때 사용 (this.는 lv와 iv를 구분할때 사용)

## 생성자 `super()`

- 조상의 생성자를 호출할때 사용
- 조상의 멤버는 조상의 생성자를 호출해서초기화
- (자식은 자기가 생성한 맴버만 초기화)
- 생성자에 생성자를 호출할거면 첫줄에! 안하면 자동으로컴파일러가 super(); 삽입

### `this` vs `super`

- this는 객체 자신을 가리키는 참조변수, 지역변수와 인스턴스 변수 구분할 때 사용.
- this()는 **같은 클래스** 내 한 생성자에서 다른 생성자 호출할 때 사용.

---

- super는 객체 자신을 가리키는 참조변수. 조상 멤버와 자신의 멤버 구분할 때 사용.
- super()는 **자손 클래스** 생성자에서 조상 멤버를 초기화하기 위함.