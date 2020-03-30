package parameterLamda;

public class OneArgsUsingLamba {
	public static void main(String[] args) {
		OneArgsInterface one=(a)->a;
		System.out.println(one.Count(2));
	}
}
