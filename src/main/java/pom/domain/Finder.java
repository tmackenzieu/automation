package pom.domain;


import java.util.List;

import lombok.Getter;
import lombok.Setter;

public class Finder {
	@Getter @Setter private String name;
	@Getter @Setter private String marca;
	@Getter @Setter private List<String> categoria;
	@Getter @Setter private int peso; 
	@Getter @Setter private Boolean encordada;
	@Getter @Setter private String imagen;
	@Getter @Setter private int precio;
	@Getter @Setter private String descripcion;
	
//	public Finder() {
//		this.name;
//		this.marca;
//		this.categoria = categoria.add("Competición");
//	}
//	

	public Finder(String name, String marca) {
		this.name = name;
		this.marca  = marca;
		this.categoria = categoria.add("Competición");
	}


	private class Test() {
		public static void main(String args[]) {
			Finder finder = new Finder("tabata", "puma");
		}
	}
}


