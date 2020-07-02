
public class MinhaThread implements Runnable {

	private String valor;
	
	public MinhaThread(String valor) {
		this.valor = valor;
	}
	
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Minha primeira thread rodando "+ this.valor);
	}
	
}
