package simpleLemda;

public class HelloWorldLamba {
	public static void main(String[] args) {
		HelloWorld hello=()->"hello world";
		System.out.println(hello.SayHello());
	}
}
