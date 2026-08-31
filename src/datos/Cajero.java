package datos;

import java.time.LocalDate;

public class Cajero extends Personal{
	
	private String turnoTrabajo;
	
	public Cajero() {}

	public Cajero(String nombre, String apellido, long dni, LocalDate fechaNacimiento, LocalDate fechaIngreso,
			double sueldoBase, String turnoTrabajo) {
		super(nombre, apellido, dni, fechaNacimiento, fechaIngreso, sueldoBase);
		this.turnoTrabajo = turnoTrabajo;
	}

	public String getTurnoTrabajo() {
		return turnoTrabajo;
	}

	public void setTurnoTrabajo(String turnoTrabajo) {
		this.turnoTrabajo = turnoTrabajo;
	}

	@Override
	public String toString() {
		return "Cajero ["+ super.toString() +", turnoTrabajo=" + turnoTrabajo + "]";
	}
	
	
	
}
