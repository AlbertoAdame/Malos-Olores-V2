package com.test.refactoring.Business;
/**
 * Clase camión
 * @author alberto
 * @version 1.0
 *
 */
public class Camion {
	/**
	 * Datos del camión y  el conductor
	 */
	private CamionDatos camion = new CamionDatos(new ConductorInfoCamion());
	/**
	 * Constructor de camión
	 */
	public Camion() {
		super();
	}
	/**
	 * Constructor de camión
	 * 
	 * @param matricula del camion
	 * @param color del camion
	 * @param combustible que usa el camion
	 * @param tipoCarnet del conductor
	 * @param nombreConductor del camion
	 * @param dniConductor del camion
	 */
	public Camion(String matricula, String color, String combustible, String tipoCarnet, String nombreConductor, String dniConductor) {
		super();
		this.camion.matricula = matricula;
		this.camion.color = color;
		this.camion.combustible = combustible;
		this.camion.Conductor.tipoCarnet = tipoCarnet;
		this.camion.Conductor.nombreConductor = nombreConductor;
		this.camion.Conductor.dniConductor = dniConductor;
	}
	/**
	 * Get matricula del camion
	 * @return la matricula
	 */
	public String getMatricula() {
		return camion.matricula;
	}
	/**
	 * Set matricula del camion
	 * @param matricula del camion
	 */
	public void setMatricula(String matricula) {
		this.camion.matricula = matricula;
	}
	/**
	 * Get color del camion
	 * @return color del camion
	 */
	public String getColor() {
		return camion.color;
	}
	/**
	 * Set color del camión
	 * @param color del camion
	 */
	public void setColor(String color) {
		this.camion.color = color;
	}
	/**
	 * Get combustible
	 * @return combustible del camion
	 */
	public String getCombustible() {
		return camion.combustible;
	}
	/**
	 * Set del combustible
	 * @param combustible del camion
	 */
	public void setCombustible(String combustible) {
		this.camion.combustible = combustible;
	}
	/**
	 * Get tipo de carnet
	 * @return tipoCarnet del conductor
	 */
	public String getTipoCarnet() {
		return camion.Conductor.tipoCarnet;
	}
	/**
	 * Set tipo de carnet
	 * @param tipoCarnet del conductor
	 */
	public void setTipoCarnet(String tipoCarnet) {
		this.camion.Conductor.tipoCarnet = tipoCarnet;
	}
	/**
	 * Get nombre del conductor
	 * @return nombre del conductor
	 */
	public String getNombreConductor() {
		return camion.Conductor.nombreConductor;
	}
	/**
	 * Set nombre del conductor
	 * @param nombreConductor del camion
	 */
	public void setNombreConductor(String nombreConductor) {
		this.camion.Conductor.nombreConductor = nombreConductor;
	}
	/**
	 * Get dni del conductor
	 * @return dni del conductor
	 */
	public String getDniConductor() {
		return camion.Conductor.dniConductor;
	}
	/**
	 * Set dni del conductor
	 * @param dniConductor del camion
	 */
	public void setDniConductor(String dniConductor) {
		this.camion.Conductor.dniConductor = dniConductor;
	}
	/**
	 * Acelerar el camion
	 * @param velocidad del camion
	 */
	public void Acelerar(Integer velocidad) {
		System.out.println("La aceleraciï¿½n del camiï¿½n se realizarï¿½ progresivamente para conservar sus neumï¿½ticos");
		
		//TO DO
		//Incluir lï¿½gica de movimiento
	}
	/**
	 * Detener el camion
	 */
	public void Detener() {
		System.out.println("CUIDADO!! La detenciï¿½n de un vehï¿½culo de gran tamaï¿½o puede ocasionar accidentes de trï¿½fico");
	}

	@Override
	public String toString() {
		return "Camion [matricula=" + camion.matricula + ", color=" + camion.color + ", combustible=" + camion.combustible + ", tipoCarnet="
				+ camion.Conductor.tipoCarnet + ", nombre_conductor=" + camion.Conductor.nombreConductor + ", dniConductor=" + camion.Conductor.dniConductor + "]";
	}
	
}
