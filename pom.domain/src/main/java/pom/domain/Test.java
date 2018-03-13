package pom.domain;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio");
		Finder finder = new Finder();
		finder.setName("taby");
		finder.setMarca("adas");
		List<String> lista = new ArrayList<String>();
		lista.add("competición");
		lista.add("holi test");
		finder.setCategoria(lista);
		System.out.println("fin " + finder);
	}

}
