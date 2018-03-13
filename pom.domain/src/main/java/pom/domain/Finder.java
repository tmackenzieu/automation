package pom.domain;


import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Finder {
	@Getter @Setter private String name;
	@Getter @Setter private String marca;
	@Getter @Setter private List<String> categoria;
	@Getter @Setter private int peso; 
	@Getter @Setter private Boolean encordada;
	@Getter @Setter private String imagen;
	@Getter @Setter private int precio;
	@Getter @Setter private String descripcion;

}


