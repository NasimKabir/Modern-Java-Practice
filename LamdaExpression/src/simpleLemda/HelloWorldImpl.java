package simpleLemda;

public class HelloWorldImpl implements HelloWorld{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldImpl hello=new HelloWorldImpl();
		System.out.println(hello.SayHello());
		
	}

	@Override
	public String SayHello() {
		// TODO Auto-generated method stub
		return "Hello world ";
	}

}
