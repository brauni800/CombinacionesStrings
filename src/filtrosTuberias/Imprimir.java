package filtrosTuberias;

import java.util.List;

public class Imprimir {

	public void execute(List<String> lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println((i+1) + " - " + lista.get(i));
		}
	}
}
