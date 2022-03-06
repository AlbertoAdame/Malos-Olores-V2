package com.test.refactoring.Business;
/**
 * Clase Moto
 * @author Alberto
 *@version 1.0
 */
public class Motocicleta {
	/**
	 * Info conductor y moto
	 */
	private ConductorInfoMoto conductorDatos = new ConductorInfoMoto(new MotocicletaInfo());
	/**
	 * COnstruncotr
	 * @param matricula de la moto
	 * @param color de la moto
	 * @param combustible de la moto
	 * @param cilindrada  de la moto
	 * @param nombreConductor de la moto
	 * @param dniConductor de la moto
	 */
	public Motocicleta(String matricula, String color, String combustible, Integer cilindrada, String nombreConductor,
			String dniConductor) {
		super();
		this.conductorDatos.motoDatos.matricula = matricula;
		this.conductorDatos.motoDatos.color = color;
		this.conductorDatos.motoDatos.combustible = combustible;
		this.conductorDatos.motoDatos.cilindrada = cilindrada;
		this.conductorDatos.nombreConductor = nombreConductor;
		this.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * Get matricula de la moto
	 * @return matricula de la moto
	 */
	public String getMatricula() {
		return conductorDatos.motoDatos.matricula;
	}
	/**
	 * Set matricula de la moto
	 * @param matricula de la moto
	 */
	public void setMatricula(String matricula) {
		this.conductorDatos.motoDatos.matricula = matricula;
	}
	/**
	 * get color de la moto
	 * @return color de la moto
	 */
	public String getColor() {
		return conductorDatos.motoDatos.color;
	}
	/**
	 * set color de la moto
	 * @param color de la moto 
	 */
	public void setColor(String color) {
		this.conductorDatos.motoDatos.color = color;
	}
	/**
	 * get combustibnle de la moto
	 * @return combustible de la moto
	 */
	public String getCombustible() {
		return conductorDatos.motoDatos.combustible;
	}
	/**
	 * set combustible de la moto
	 * @param combustible combustible de la moto
	 */
	public void setCombustible(String combustible) {
		this.conductorDatos.motoDatos.combustible = combustible;
	}
	/**
	 * get cilindrada de la moto
	 * @return cilindrada de la moto
	 */
	public Integer getCilindrada() {
		return conductorDatos.motoDatos.cilindrada;
	}
	/**
	 * set  cilindradada de la moto
	 * @param cilindrada cilindrada de la moto
	 */
	public void setCilindrada(Integer cilindrada) {
		this.conductorDatos.motoDatos.cilindrada = cilindrada;
	}
	/**
	 * get nombre de la moto
	 * @return nombre de la moto
	 */
	public String getNombreConductor() {
		return conductorDatos.nombreConductor;
	}
	/**
	 * set nombre de la moto
	 * @param nombreConductor de la moto
	 */
	public void setNombreConductor(String nombreConductor) {
		this.conductorDatos.nombreConductor = nombreConductor;
	}
	/**
	 * get dni del conductor
	 * @return dni del conductor
	 */
	public String getDniConductor() {
		return conductorDatos.dniConductor;
	}
	/**
	 * set dni del conductor
	 * @param dniConductor dni del conductor
	 */
	public void setDniConductor(String dniConductor) {
		this.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * acelerar la moto
	 * @param velocidad de la moto
	 */
	public void Acelerar(Integer velocidad) {
		//TO DO
	}
	/**
	 * Detener la moto
	 */
	public void Detener() {
		//TO DO
	}

	@Override
	public String toString() {
		return "motocicleta [matricula=" + conductorDatos.motoDatos.matricula + ", color=" + conductorDatos.motoDatos.color + ", combustible=" + conductorDatos.motoDatos.combustible
				+ ", cilindrada=" + conductorDatos.motoDatos.cilindrada + ", nombre_conductor=" + conductorDatos.nombreConductor + ", dniConductor="
				+ conductorDatos.dniConductor + "]";
	}	

}
