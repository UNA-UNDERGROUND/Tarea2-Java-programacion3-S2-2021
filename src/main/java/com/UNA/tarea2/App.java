package com.UNA.tarea2;

public class App {
	public static void main(String[] args) {
		Prestamo p = new Prestamo(10000, 6, .02);
		try {
			p.agregarMensualidad(10000);
			p.agregarMensualidad(8415);
			p.agregarMensualidad(6798);
			p.agregarMensualidad(5148);
			p.agregarMensualidad(3466);
			p.agregarMensualidad(1750);

			System.out.println(p);
		} catch (Exception ex) {
			System.err.println("Error: " + ex.getMessage());
		}

	}

}
