package trabalho;

import java.util.ArrayList;



public class Cofrinho {
	
	private ArrayList<Moeda> listaDeMoedas;
	
	boolean vazia() {
		return listaDeMoedas.isEmpty();
	}
	
	public Cofrinho() {
		this.listaDeMoedas =  new ArrayList<> ();
		
	}
	public void adicionarMoedas(Moeda moeda) {
		this.listaDeMoedas.add(moeda);	
	}
	public void removerMoedas(Moeda moeda) {
		if (this.listaDeMoedas.contains(moeda)) {
			this.listaDeMoedas.remove(moeda);
	}else {
		System.out.println("Esse valor não existe no seu cofrinho");
		return;
	}
		}
	public void listarMoedas() {
		if (this.listaDeMoedas.isEmpty()) {
			System.out.println("Cofrinho vazio");
			return;
		}
		for (Moeda moeda: this.listaDeMoedas) {
			moeda.info();
		}
	}

	public double totalConvertido() {
		if (this.listaDeMoedas.isEmpty()) {
			return 0;
		}else {
			double valorTotal = 0;
			for (Moeda moeda: this.listaDeMoedas) {
				valorTotal += moeda.converter();
		}
		return valorTotal;
	}

	}
	
}
