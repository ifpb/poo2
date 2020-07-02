
public class Main {

	public static void main(String[] args) {
		
		for(int i=0; i<100; i++) {
			MinhaThread minhaThread = new MinhaThread("Thread-"+i);
			Thread thread = new Thread(minhaThread);
			thread.start();
		}
		
		Thread thread = new Thread() {
			public void run() {
				System.out.println("Thread rodando com classe anônima");
			}
		};
		thread.start();
		
		Runnable runnable = () -> {
			System.out.println("Thread rodando como lambda function");
		};
		Thread thread2 = new Thread(runnable);
		thread2.start();
	}
	
}
