package runableInterface;

public class TraditionalWay {

	public static void main(String[] args) {
		Runnable runable=new Runnable() {
			
			@Override
			public void run() {
				int sum=0;
				for(int i=0;i<10;i++) 
					sum+=i;
					System.out.println("Traditional  way sum is "+sum);
				
			}
		};
		new Thread(runable).start();
		
		// using lambda
		Runnable runable1=()->{
			int sum=0;
			for(int i=0;i<10;i++) 
				sum+=i;
				System.out.println("Lambda  way sum is "+sum);
		};
		new Thread(runable1).start();
		
		
		//thread with lambda
		new Thread(()-> {
			int sum=0;
			for(int i=0;i<10;i++) 
				sum+=i;
				System.out.println("THread  way sum is "+sum);
		}).start();
	}

}
