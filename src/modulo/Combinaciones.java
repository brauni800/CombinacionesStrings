package modulo;

import java.util.ArrayList;

public class Combinaciones {

	private ArrayList<String[]> lista;
	private String[] args;
	private final String[] argsOriginal;

	public Combinaciones(String[] args) {
		super();
		this.lista = new ArrayList<String[]>();
		this.argsOriginal = args;
		this.args = args;
		this.lista.add(args);
	}

	public void start() {
		for (int i = 0; i < this.args.length; i++) {
			System.out.print(args[i]);
		}
		System.out.println();
		
		for (int i = 0; i < this.args.length - 1; i++) {
			String aux = args[i];
			this.args[i] = args[i + 1];
			this.args[i + 1] = aux;
			if (!sonIguales()) {
				lista.add(this.args);
			}
		}
	}

	private boolean sonIguales() {
		for (int i = 0; i < this.args.length; i++) {
			System.out.print(this.args[i]);
		}
		System.out.println();
		boolean iguales = false;
		String strOriginal = "", strArgs = "";
		
		System.out.println();
		for (int i = 0; i < this.argsOriginal.length; i++) {
			System.out.println(this.argsOriginal[i]);
		}
		System.out.println();
		
		for (int i = 0; i < this.argsOriginal.length; i++) {
			strOriginal += this.argsOriginal[i];
		}
		for (int i = 0; i < this.args.length; i++) {
			strArgs += this.args[i];
		}
		
		if (strOriginal.equals(strArgs)) {
			iguales = true;
			System.out.println("Iguales");
		} else {
			System.out.println("No es igual");
		}
		return iguales;
	}

}
