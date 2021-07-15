package mem;

class Hello {
	static int num = 10;
	
	String name = "홍길동";
	int age = 15;
	
	 void add() {
		// 메모리에 뜨는 조건은 메서드를 뷰에 담아서 해야지 뜬다.
		// 
		int money = 100;
		
	}
}


public class TestApp {
		
	static int num = 20;
	
	// JVM 
	// 1. .class 로드한다.
	// 2. 전역적으로 static을 먼저 다찾는다. (class 공간안에띈다).
	// 3. 인터프리터로 실행 (1줄읽어서 실행)
	// static은 최초한번만 찾기때문에 무조건적으로 한개이다.
	// 그다음 main을 찾는다. 메모리에 떠있다는 조건하에 (public static void main)
	// View를 만들면 static이 아닌것들만 메모리에 띄운다.
	// static은 모든 최초로 메모리에 뜬다. 객체는 메인실행 이후에 뜬다라고 생각하자.
	// static은 처음부터 공유할수있다. static이아닌 객체는 힙으로간다. static은 메모리로간다. 끝까지간다.
	// stack은 메서드가 종료되면 사라진다.
	 // 스택으로 띄우는게 functional언어 힙은 객체지향적으로 뜬다.
	public static void main(String[] args) {
		System.out.println("Hello World");
		Hello h = new Hello();
		h.add();
		System.out.println(h.age);
	}
}
