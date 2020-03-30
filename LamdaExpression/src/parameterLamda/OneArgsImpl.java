package parameterLamda;

public class OneArgsImpl implements OneArgsInterface{

	public static void main(String[] args) {
		OneArgsImpl one=new OneArgsImpl();
		
		System.out.println(one.Count(2));
	}

	@Override
	public int Count(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
