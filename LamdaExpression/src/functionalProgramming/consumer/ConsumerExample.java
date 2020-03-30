package functionalProgramming.consumer;

import java.util.function.Consumer;

public class ConsumerExample {

	public static void main(String[] args) {
		Consumer<Integer>a=(b)->{
			System.out.println(b);
		};
		
		a.accept(6);

	}

}
