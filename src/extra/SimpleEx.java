package extra;
public class SimpleEx {

	public static void main(String[] args) {
//		A a = new A();				// если вызвать объект, то результат будет 6
		System.out.println(A.a);

	}
	public static class A {
		static int a = 1111;
		
		static {
			a = a-- - --a; // 1111 - 1109 = 2
		}
		{
			a = a++ + ++a; // это не статик поэтому даже не вызывается без создания объекта класса, если создать объект то 2 + 4 = 6 
		}
}
}