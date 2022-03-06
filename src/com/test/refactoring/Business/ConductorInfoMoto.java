package com.test.refactoring.Business;
/**
 *  Info del conductor de moto
 * @author Alberto
 * @version 1.0
 */
public class ConductorInfoMoto {
	/**
	 * Información de la moto
	 */
	public MotocicletaInfo motoDatos;
	/**
	 * nomnbre del conductor
	 */
	public String nombreConductor;
	/**
	 * dni del conductor
	 */
	public String dniConductor;
	/**
	 * info del conductor de motos
	 * @param motoDatos datos
	 */
	public ConductorInfoMoto(MotocicletaInfo motoDatos) {
		this.motoDatos = motoDatos;
	}
}