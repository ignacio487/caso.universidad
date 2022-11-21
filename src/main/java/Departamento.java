import java.util.ArrayList;

public class Departamento {
	private String nombreDepartamento;
	private ArrayList<CarreraUniversitaria> carrerasUniversitarias = new ArrayList<CarreraUniversitaria>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

	public String getNombreDepartamento() {
		return this.nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public ArrayList<CarreraUniversitaria> getCarrerasUniversitarias() {
		return carrerasUniversitarias;
	}

	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}

}