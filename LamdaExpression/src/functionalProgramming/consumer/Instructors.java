package functionalProgramming.consumer;

import java.util.Arrays;
import java.util.List;

public class Instructors {
	public static List<Instructor> getA() {
		Instructor i1 = new Instructor(1, "Nasim", Arrays.asList("Java", "Spring"));
		Instructor i2 = new Instructor(2, "Nasir", Arrays.asList("java", "Spring boot"));
		Instructor i3 = new Instructor(3, "Nayeem", Arrays.asList("c", "c++"));
		Instructor i4 = new Instructor(4, "Raihan", Arrays.asList("java", "Grovvy"));
		Instructor i5 = new Instructor(5, "Pappu", Arrays.asList("Normal", "English"));
		List<Instructor> list = Arrays.asList(i1, i2, i3, i4, i5);
		return list;
	}
}
