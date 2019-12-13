package br.edu.ifpb.poo2;

public class ArrayDinamico {

	private Object[] arrayDinamico = new Object[1000];
	
	void add(int index, Object element) {
		this.arrayDinamico[index] = element;
	}
	
	void remove(int index) {
		this.arrayDinamico[index] = null;
	}
	
	int size() {
		return this.arrayDinamico.length;
	}
	
	Object get(int index) {
		return this.arrayDinamico[index];
	}
	
	public static void main(String[] args) {
		ArrayDinamico arrayd = new ArrayDinamico();
		arrayd.add(0, "Azul");
		arrayd.add(1, "Branco");
		arrayd.add(2, "Amarelo");
		arrayd.add(3, "Verde");
		arrayd.add(4, "Vermelho");
		
		for(int i=0; i<arrayd.size(); i++) {
			System.out.println("Elemento índice ="+i+", valor = "+arrayd.get(i));
		}
		
	}
	
}
