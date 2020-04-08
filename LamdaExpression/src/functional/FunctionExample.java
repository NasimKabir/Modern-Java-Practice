package functional;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		Function<Integer, Double> sqrt = n -> Math.sqrt(n);
		System.out.println("Value is " + sqrt.apply(81));
		
		Function<String,String>lowercase=l->l.toLowerCase();
		System.out.println("Lower case is "+lowercase.apply("SLDJL;GL FL;DSFJ ASO;FJ ASLF "));
		
		Function<String,String>uppercase=u->u.toUpperCase();
		System.out.println("Upper case is "+uppercase.apply("asf fsaa;fk psd;fk d;fka "));
	}

}
