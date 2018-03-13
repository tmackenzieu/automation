package pom.domain;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio");
		Finder finder = new Finder();
		List<String> lista = new ArrayList<String>();
		lista.add("Competición");
		lista.add("Intermedio");
		lista.add("Recreativo");
		lista.add("Junior");

		finder.setCategoria(lista);
		System.out.println("fin " + finder);
	}

}
