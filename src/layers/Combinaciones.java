package layers;

import java.util.LinkedList;
import java.util.List;

import filtrosTuberias.Ordenacion;

public class Combinaciones {

	private String[] args;
	private List<String> combinaciones;

	public Combinaciones(String[] args) {
		super();
		this.combinaciones = new LinkedList<>();
		this.args = args.clone();
		this.combinaciones.add(generarString(this.args.clone()));
	}

	public void combinar() {
		do {
			for (int i = 0; i < this.args.length - 1; i++) {
				String aux = args[i];
				this.args[i] = args[i + 1];
				this.args[i + 1] = aux;
				if (!sonIguales()) {
					combinaciones.add(generarString(this.args.clone()));
				}
			}
		} while (!sonIguales());
		Ordenacion ord = new Ordenacion(this.combinaciones);
		ord.ordenar();
	}

	private boolean sonIguales() {
		boolean iguales = false;
		String strOriginal = this.combinaciones.get(0);
		String strArgs = generarString(this.args);

		if (strOriginal.equals(strArgs)) {
			iguales = true;
		}
		return iguales;
	}

	private String generarString(String[] args) {
		String strGenerado = "";
		for (int i = 0; i < args.length; i++) {
			if (i != args.length - 1) {
				strGenerado += (args[i] + " ");
			} else {
				strGenerado += args[i];
			}
		}
		return strGenerado;
	}

	public List<String> getCombinaciones() {
		return combinaciones;
	}

}
