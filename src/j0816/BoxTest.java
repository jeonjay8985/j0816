package j0816;

class Box<T> {
	private T data;

	public T get() {
		return data;
	}

	public void set(T data) {
		this.data = data;
	}

}

public class BoxTest {

	public static void main(String[] args) {
		// 컬렉션 프레임워크
		
		Box<Integer> b = new Box<Integer>();
		b.set(100);
		System.out.println("box 값 : " +b.get());
		
		Box<String> s1 = new Box<String>();
		s1.set("Hello World!!");
		System.out.println("box 값 : " +s1.get());
		
		
		
		
		

	}

}
