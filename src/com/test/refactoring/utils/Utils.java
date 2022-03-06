package com.test.refactoring.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 * Clase Utiles
 * @author Alberto
 *@version 1.0
 */
public class Utils {
	/**
	 * Constante del precio por mes
	 */
	private static final int PRECIOMES = 750;
	/**
	 * Constante del iva
	 */
	private static final float IVA = 1.21f;
	/**
	 * Constante del precio por dia
	 */
	private static final int PRECIODIA = 50;
	/**
	 * Hora actual
	 * @return hora
	 */
	public static String hora_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        //System.out.println("HH:mm:ss-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * Fecha actual
	 * @return fecha
	 */
	public static String fecha_actual() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //System.out.println("yyyy/MM/dd-> "+dtf.format(LocalDateTime.now()));
        
        return dtf.format(LocalDateTime.now());
	}
	/**
	 * Calcular precio del alquiler
	 * @param dias que se va a estar
	 * @return precio por alquiler
	 */
	public static float calcularPrecioAlquiler (Integer dias) {
		float result = 0;
		//El coste de un d�a de alquiler son 50� + 21% de IVA
		result = dias * PRECIODIA * IVA;
		return result;
	}
	/**
	 * CAlcular renting
	 * @param meses que se va a estar
	 * @return precio del renting
	 */
	public static float calcularPrecioRenting (Integer meses ) {
		//El coste de un mes de renting son 750� + 21% IVA
		return meses * PRECIOMES * IVA;
	}

}
