package com.UNA.tarea2;

public class Application {
    public static void main(String[] args) {
        Prestamo p;
        p = new Prestamo(10000, 6, .02);

        p.agregarMensualidad(10000);
        p.agregarMensualidad(8415);
        p.agregarMensualidad(6798);
        p.agregarMensualidad(5148);
        p.agregarMensualidad(3466);
        p.agregarMensualidad(1750);
        PrestamoDisplay ps = new PrestamoDisplay();
        ps.setVisible(true);
        ps.show(p);
    }
}
