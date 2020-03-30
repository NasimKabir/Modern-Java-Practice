package functionalProgramming.consumer;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Integer, String> a = (s, n) -> System.out.println(s + " = " + n);
		a.accept(1, "Modern Java");
		
		
		// print out id and name using BiConsumer
		List<Instructor>all=Instructors.getA();
		BiConsumer<Integer,String>con=(id,name)->System.out.println(id+" name is "+name);
		all.forEach(b->con.accept(b.getId(), b.getName()));
		
		
		System.out.println("---------------------------------");
		
		BiConsumer<String,List<String>>con1=(name,course)->System.out.println("Name is "+name+" and coursess are "+course);
		all.forEach(b->con1.accept( b.getName(),b.coursess));
		

	}

}
