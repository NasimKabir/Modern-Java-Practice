package multipleParameter;

public class MultipleArgsImplNormalWay implements MultipleArgs {

	@Override
	public int add(int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
		MultipleArgsImplNormalWay normal=new MultipleArgsImplNormalWay();
		System.out.println(normal.add(5, 5));

	}

}
