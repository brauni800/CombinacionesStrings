package modulo;

import java.util.ArrayList;

public class Combinaciones {

	private ArrayList<String[]> lista;
	private String[] args;

	public Combinaciones(String[] args) {
		super();
		this.lista = new ArrayList<String[]>();
		this.args = args.clone();
		this.lista.add(args.clone());
	}

	public void start() {
		do {
			for (int i = 0; i < this.args.length - 1; i++) {
				String aux = args[i];
				this.args[i] = args[i + 1];
				this.args[i + 1] = aux;
				if (!sonIguales()) {
					lista.add(this.args.clone());
				}
			}
		} while (!sonIguales());
		for (int i = 0; i < lista.size(); i++) {
			for(int j = 0; j < lista.get(0).length; j++) {
				System.out.print(lista.get(i)[j] + " ");
			}
			System.out.println();
		}
		
	}

	private boolean sonIguales() {
		boolean iguales = false;
		String strOriginal = "", strArgs = "";
		
		for (int i = 0; i < this.lista.get(0).length; i++) {
			strOriginal += this.lista.get(0)[i];
			strArgs += this.args[i];
		}
		
		if (strOriginal.equals(strArgs)) {
			iguales = true;
		}
		return iguales;
	}

}
