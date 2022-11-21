import java.util.ArrayList;

public class Universidad {
	private String nombreUniversidad;
	private String direccionUniversidad;
	public ArrayList<Trabajador> trabajadores = new ArrayList<Trabajador>();
	private ArrayList<Facultad> facultades = new ArrayList<Facultad>();

	public String getNombreUniversidad() {
		return this.nombreUniversidad;
	}

	public void setNombreUniversidad(String nombreUniversidad) {
		this.nombreUniversidad = nombreUniversidad;
	}

	public String getDireccionUniversidad() {
		return this.direccionUniversidad;
	}

	public void setDireccionUniversidad(String direccionUniversidad) {
		this.direccionUniversidad = direccionUniversidad;
	}

	public ArrayList<Profesor> obtenerProfesoresPorNombre(String nombre){
		ArrayList<Profesor> profesoresConElMismoNombre=new ArrayList<>();
		for(Facultad facultad:facultades) {
			for(Departamento departamento:departamentos){
				for (Profesor profesor : Departamento.getProfesores()) {
					if (profesor.getNombre().equals(nombre)) {
						profesoresConElMismoNombre.add(profesor);
					}
				}
			}
		}
		return profesoresConElMismoNombre;
	}

	public ArrayList<CarreraUniversitaria> obtenerCarrerasUniversitarias(){
		ArrayList<CarreraUniversitaria>carrerasUniversitarias=new ArrayList<>();
		for(Facultad facultad:facultades){
			for(Departamento departamento:facultad.getDepartamentos()) {
				carrerasUniversitarias.addAll(departamento.getCarrerasUniversitarias());
			}
		}
		return obtenerCarrerasUniversitarias();
	}

	public ArrayList<Administrativo>ObtenerAdministrativos(){
		ArrayList<Administrativo> administrativos=new ArrayList<Administrativo>();
		for(Trabajador trabajador:this.trabajadores){
			if(Departamento.getAdministrativos().equals("Administrativo")){
				administrativos.add((Administrativo)trabajador);
			}
		}
		return administrativos;
	}

	public ArrayList<Profesor>ObtenerProfesores(){
		ArrayList<Profesor>profesores=new ArrayList<>();
		for(Facultad facultad:this.facultades){
			for(Profesor profesor:Departamento.getProfesores()){
			}
		}
		return ObtenerProfesores();
	}

	public ArrayList<Profesor>obtenerProfesoresPorHorario(String horario){
		ArrayList<Profesor>profesoresConElMismoHorario=new ArrayList<>();
		for(Trabajador trabajadores:this.trabajadores) {
			for (Profesor profesor : facultades.getProfesores()) {
				if (profesor.getHorario().equals(horario)) {
					profesoresConElMismoHorario.add(profesor);
				}
			}
		}
		return profesoresConElMismoHorario;
	}

}

