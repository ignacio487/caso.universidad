public class Profesor extends Trabajador {
	private String tipoContrato;

	public String getTipoContrato() {
		return this.tipoContrato;
	}

	public void setTipoContrato(String tipoContrato) {
		this.tipoContrato = tipoContrato;
	}

	public void Horario(int opcion){
		switch (opcion){
			case 1:
				super.setHorario("Jornada Parcial");
				break;
			case 2:
				super.setHorario("Media Jornada");
				break;
			case 3:
				super.setHorario("Jornada Completa");
				break;
		}
	}
}