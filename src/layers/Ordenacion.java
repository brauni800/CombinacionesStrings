package layers;

import java.util.Collections;
import java.util.List;

public class Ordenacion {

	private List<String> lista;

	public Ordenacion(List<String> list) {
		super();
		this.lista = list;
	}

	public void ordenar() {
		Collections.sort(lista);
		Imprimir imp = new Imprimir();
		imp.execute(lista);
	}
}
