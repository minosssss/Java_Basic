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