package com.test.refactoring.Business;
/**
 * Datos del camion
 * @author Alberto
 * @version 1.0
 */
public class CamionDatos {
	/**
	 * matricula del camion
	 */
	public String matricula;
	/**
	 * color del camion
	 */
	public String color;
	/**
	 * combustible del camion
	 */
	public String combustible;
	/**
	 * combustible del camion
	 */
	public ConductorInfoCamion Conductor;
	/**
	 * COnstructor
	 * @param conductor del camion
	 */
	public CamionDatos(ConductorInfoCamion conductor) {
		Conductor = conductor;
	}
}