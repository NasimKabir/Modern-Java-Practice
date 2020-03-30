package functionalProgramming.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerWithLambda {
	public static void main(String[] args) {
		List<Instructor>getAll=Instructors.getA();
		Consumer<Instructor>a=(s)->System.out.println(s);
		getAll.forEach(a);
		
		System.out.println("---------------------------------------");
		
		Consumer<Instructor>a2=(s)->System.out.println(" "+s.coursess);
		getAll.forEach(a.andThen(a2));
		
		System.out.println("---------------------------------------");
		
		getAll.forEach(s->{
			if(s.getId()>2) {
				a.accept(s);
			}
		});
	}

}
