import java.util.ArrayList;

public class Facultad {
	private String nombreFacultad;
	private String ubicacion;
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public String getNombreFacultad() {
		return this.nombreFacultad;
	}

	public void setNombreFacultad(String nombreFacultad) {
		this.nombreFacultad = nombreFacultad;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public ArrayList<Departamento> getDepartamentos() {
		return departamentos;
	}

}