package com.test.refactoring.Business;
/**
 * Clase coche
 * @author Alberto
 *@version 1.0
 */
public class Coche {
	/**
	 * Información del coche y del conductor
	 */
	private CocheInfo cocheDatos = new CocheInfo(new ConductorInfoCoche());
	/**
	 * Constructor de coche
	 */
	public Coche() {
		super();
	}
	/**
	 * Constructor coche
	 * @param matricula del coche
	 * @param color del coche
	 * @param combustible  del coche
	 * @param numPlazas del coche
	 * @param nombreConductor del coche
	 * @param dniConductor del coche
	 */
	public Coche(String matricula, String color, String combustible, Integer numPlazas, String nombreConductor, String dniConductor) {
		super();
		this.cocheDatos.matricula = matricula;
		this.cocheDatos.color = color;
		this.cocheDatos.combustible = combustible;
		this.cocheDatos.numPlazas =  numPlazas;
		this.cocheDatos.conductorDatos.nombreConductor = nombreConductor;
		this.cocheDatos.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * get de la matricula
	 * @return matricula del coche
	 */
	public String getMatricula() {
		return cocheDatos.matricula;
	}
	/**
	 * Set matricula del coche
	 * @param matricula del coche
	 */
	public void setMatricula(String matricula) {
		this.cocheDatos.matricula = matricula;
	}
	/**
	 * Get color del coche
	 * @return color del coche
	 */
	public String getColor() {
		return cocheDatos.color;
	}
	/**
	 *  Set color del coche
	 * @param color del coche
	 */
	public void setColor(String color) {
		this.cocheDatos.color = color;
	}
	/**
	 * Get combustible del coche
	 * @return combustible del coche
	 */
	public String getCombustible() {
		return cocheDatos.combustible;
	}
	/**
	 * Set combustible del coche
	 * @param combustible del coche
	 */
	public void setCombustible(String combustible) {
		this.cocheDatos.combustible = combustible;
	}
	/**
	 * Get numero de plazas del coche
	 * @return numero de plazas del del coche
	 */
	public Integer getNumPlazas() {
		return cocheDatos.numPlazas;
	}
	/**
	 * Set numero de plazas del coche
	 * @param numPlazas del coche
	 */
	public void setNumPlazas(Integer numPlazas) {
		this.cocheDatos.numPlazas = numPlazas;
	}
	/**
	 * Get nombre del conductor
	 * @return del conductor
	 */
	public String getNombre_conductor() {
		return cocheDatos.conductorDatos.nombreConductor;
	}
	/**
	 * Set nombre del conductor
	 * @param nombreConductor del coche
	 */
	public void setNombreConductor(String nombreConductor) {
		this.cocheDatos.conductorDatos.nombreConductor = nombreConductor;
	}
	/**
	 * Get dni del conductor
	 * @return dni del conductor
	 */
	public String getDniConductor() {
		return cocheDatos.conductorDatos.dniConductor;
	}
	/**
	 * Set dni del conductor del coche
	 * @param dniConductor del coche
	 */
	public void setDniConductor(String dniConductor) {
		this.cocheDatos.conductorDatos.dniConductor = dniConductor;
	}
	/**
	 * Acelerar el coche
	 * @param velocidad del coche
	 */
	public void acelerar(Integer velocidad) {
		if (velocidad > 0 && velocidad < 120) {
			System.out.println("El coche estï¿½ acelerando y llegarï¿½ la velocidad de " + velocidad.intValue() + " km/h");
		} else {
			System.out.println("La velocidad indicada no estï¿½ permitida en un coche segï¿½n la DGT");
		}
	}
	/**
	 * Detener el coche
	 */
	public void detener() {
		System.out.println("El coche se detendrï¿½ en breve, asegï¿½rese de buscar un lugar adecuado para estacionar");
	}

	@Override
	public String toString() {
		return "Coche [matricula=" + cocheDatos.matricula + ", color=" + cocheDatos.color + ", combustible=" + cocheDatos.combustible + ", numPlazas="
				+ cocheDatos.numPlazas + ", nombre_conductor=" + cocheDatos.conductorDatos.nombreConductor + ", dniConductor=" + cocheDatos.conductorDatos.dniConductor + "]";
	}

}
