# **객체지향개념 II(2)**

## 패키지 (package)

- 서로 관련된 클래스의 묶음
- 클래스는 클래스 파일 (*.class), 패키지는 폴더. 하위 패키지는 하위 폴더
- 클래스의 실제 이름(full name)은 패키지를 포함. (java.lang.String)
    - rt.jar는 클래스들을 압축한 파일(JDK설치경로 >jre > lib 에 위치

### 패키지의 선언

- 패키지는 소스파일의 첫 번째 문장으로 단 한번 선언
- 같은 소스 파일의 클래스들은 모두 같은 패키지에 속하게 된다.
- 패키지 선언이 없으면 이름없는 (unnamed)_default package_패키지에 속하게 된다.

## 클래스 패스 (classpath)

- 클래스 파일(*.class)의 위치를 알려주는 경로(path)
- 환경변수 classpath로 관리하며, 경로간의 구분자는 ‘;’ 를 사용
- classpath(환경변수)에 패키지의 루트를 등록해줘야 함.

## `import` 문

- 클래스를 사용할 때 패키지 이름을 생략할 수 있다.
- 컴파일러에게 클래스가 속한 패키지를 알려준다.
- 단축키: `Ctrl + Shift + O`
- java.lang 패키지의 클래스는 import 하지 않고도 사용할 수 있다.

### `static import` 문

- static 멤버를 사용할 때 클래스 이름을 생략할 수 있게 해준다.

```jsx
import static java.lang.Integer.*;   // Integer 클래스의 모든 static 메서드
import static java.lang.Math.random; // Math.random()만. 괄호 안붙임
import static java.lang.System.out;  // System.out을 out만으로 참조가능
```

## 제어자 (modifier)

- 클래스와 클래스의 멤버 (멤버 변수, 메서드)에 부가적인 의미부여
    - 접근제어자: `public`, `protected` , `(default)` , `private`
    - 그 외 : static, final, abstract, native, transient, synchronized, volatile, stritctfp
- 하나의 대상에 여러 제어자를 같이 사용 가능(접근 제어자는 하나만)

```jsx
public class modifierTest {
		public static final int WIDTH = 200;

		public static void matin(String[] args) {
				System.out.println("WIDTH="+WIDTH);
		}
}
```

### `static` 클래스의, 공통적인

- 멤버변수
    - 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다.
    - 클래스 변수는 인스턴스를 생성하지 않고도 사용 가능하다.
    - 클래스가 메모리에 로드될 때 생성 된다
- 메서드
    - 인스턴스를 생성하지 않고도 호출이 가능한 `static` 메서드가 된다.
    - 객체 생성없이 사용 가능하지만, `static` 메서드 내에서는 인스턴스 멤버와 메서드들을 직접 사용할 수 없다.

---

### `fianl` 마지막의, 변경 될 수 없는

- 클래스
    - 변경될 수 없는 클래스, 확장될 수 없는 클래스가 된다. `final` 로 지정된 클래스는 다른 클래스의 조상이 될 수 없다,
- 메서드
    - 변경될 수 없는 메서드, `final` 로 지정된 메서드는 오버라이딩을 통해 재정의 될 수 없다.
- 멤버변수 (지역변수)
    - 변수 앞에 `final` 이 붙으면, 값을 변경할 수 없는 상수가 된다.

---

### `abstract` 추상의, 미완성의

- 클래스
    - 클래스 내에 추상 메서드가 선언되어 있음을 의미한다.
- 메서드
    - 선언부만 작성하고 구현부는 작성하지 않은 추상 메서드임을 알린다.

```jsx
abstract class AbstractTest {   // 추상 클래스(추상 메서드를 포함한 클래스)
		abstract void move();       // 추상 메서드(구현부가 없는 메서드)
}

AbstractTest a = new AbstractTeest();  
// 에러, 미완성 설계도이기 때문에 추상 클래스의 인스턴스(제품) 생성 불가
```

## 접근 제어자(access modifier)

- private : 같은 클래스 내에서만 접근이 가능하다. (1개의 파일)
- (default) : 같은 패지키 내에서만 접근이 가능하다. (1개의 폴더)
- protected: 같은 패키지 내에서, 그리고 다른 패키지 자손 클래스에서 접근이 가능하다. (같은 폴더 + 다른 폴더 자손)
- public : 접근 제한이 전혀 없다. (public is FREE!)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/84ba75b0-e8a9-45de-ada4-4df2b9abb922/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220214%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220214T130003Z&X-Amz-Expires=86400&X-Amz-Signature=394e68a9f6d42b751864c49479f32c085fe0f5d4ae97a80cd7cdbd088bcf520c&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/063155cb-b31c-494c-ba19-aee5e808073d/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220214%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220214T130006Z&X-Amz-Expires=86400&X-Amz-Signature=47d4edca77a2ab4c67927500abbd8d02cd1aa4125c44e2ce6934dc0a0cafd1ea&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

### 캡슐화와 접근제어자

- 접근 제어자를 사용 이유 : 외부로부부터 데이터를 보호하기 위해서
- `private` 으로 하여 외부에서 직접 접근하지 못하도록 한다.
- 외부에는 불필요한, 내부적으로만 사용되는 부분을 감추기 위해서
- 메서드를 `private` 하게 하면 클래스 안에서만 테스트할 수 있다. 즉 `public` 일 경우 전체를 다 테스트 해야 하지만 `private` 하나로 테스트 범위가 줄어들기에 최대한 좁혀서 사용해야 한다.

```java
class Time {
		private int hour;  // 0~23 사이의 값을 가져야 함
		private int minute;
		private int second;
		
		public void setHour(int hour) {
			if(isValiidHour(hour)) return;
			
			this.hour = hour;
		}
	
	// 메서드 바로 추가 alt+shift+M
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드 
	private boolean isValiidHour(int hour) {
			return hour < 0 || hour > 23;
		}
	
	public int getHour() {
			return hour;
		}
}

public class TimeTest {

		public static void main(String[] args) {
			Time t = new Time();
	//		t.hour = 25;   // 직접 접근할 수 없어서 에러!! 
			t.setHour(21);
			System.out.println(t.getHour());
					
		}

}
```

## 다형성

- 여러가지 형태를 가질 수 있는 능력
- 조상 타입 참조 변수로 자손 타입 객체를 다루는 것
    - 자손 타입의 참조 변수로 조상 타입의 객체를 가르킬 수 없다.
    - 실제 가지고 있는 멤버 갯수보다 리모컨 버튼이 많기 때문에!

```java
// TV = 조상, SmartTv = 자손 

Tv t = new SmartTv();  //  OK! 허용
SmartTv s = New Tv();  //  에러! 허용 안 됨
```

### 참조변수의 형변환

- 사용할 수 있는 멤버의 갯수를 조절하는 것
- 조상 / 자손 관계 (상속관계) 의 참조변수는 서로 형변환 가능

```java
class Car { }
class FireEngine extends Car { }
class Ambulance extends Car { }

FireEngine f = new FireEngine();

Car c = (Car)f;                // ok. 조상인 Car 타입으로 형변환(생략가능)
FireEngine f2 = (FireEngine)c; // ok. 자손인 FireEngine 타입으로 형변환 (생략 불가)
Ambulance e = (Ambulance)f;    // 에러! 상속 관계가 아닌 클래스 간의 형변환 불가
```

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/a5200dc1-3ed4-45b3-9222-f86993a00171/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220214%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220214T135904Z&X-Amz-Expires=86400&X-Amz-Signature=6650465954ec9902fa66666267c5e0caf40112c803d1aa4438727d830b40b8c1&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)

![Untitled](https://s3.us-west-2.amazonaws.com/secure.notion-static.com/6f49be92-9c05-4c2a-8244-c4a9bfe3755a/Untitled.png?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Content-Sha256=UNSIGNED-PAYLOAD&X-Amz-Credential=AKIAT73L2G45EIPT3X45%2F20220214%2Fus-west-2%2Fs3%2Faws4_request&X-Amz-Date=20220214T135907Z&X-Amz-Expires=86400&X-Amz-Signature=652f882fe48925451692658233b49c73ff67414edb161962d74a7b9572f20730&X-Amz-SignedHeaders=host&response-content-disposition=filename%20%3D%22Untitled.png%22&x-id=GetObject)