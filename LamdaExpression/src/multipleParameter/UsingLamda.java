package multipleParameter;

public class UsingLamda {

	public static void main(String[] args) {
		MultipleArgs mul=(a,b)->a*b;
		System.out.println(mul.add(5, 89));
	}

}
