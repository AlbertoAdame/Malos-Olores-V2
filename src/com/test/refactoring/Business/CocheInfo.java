package com.test.refactoring.Business;
/**
 * Info del coche
 * @author Alberto
 * @version 1.0
 */
public class CocheInfo {
	/**
	 * matricula del coche
	 */
	public String matricula;
	/**
	 * color del coche
	 */
	public String color;
	/**
	 * combustible del coche
	 */
	public String combustible;
	/**
	 * numero de plazas del coche
	 */
	public Integer numPlazas;
	/**
	 * conductor del coche
	 */
	public ConductorInfoCoche conductorDatos;
	/**
	 * info del conductor del coche
	 * @param conductorDatos información
	 */
	public CocheInfo(ConductorInfoCoche conductorDatos) {
		this.conductorDatos = conductorDatos;
	}
}