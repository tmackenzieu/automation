package pom.domain;
 import lombok.Getter;
 import lombok.Setter;
 import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Finder {
	@Getter @Setter private String name;
	@Getter @Setter private String marca;
	@Getter @Setter private String categoria;
	@Getter @Setter private int peso; 
	@Getter @Setter private Boolean encordada;
	@Getter @Setter private String imagen;
	@Getter @Setter private int precio;
	@Getter @Setter private String descripcion;
	
	
}
