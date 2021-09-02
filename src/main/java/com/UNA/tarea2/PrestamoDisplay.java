package com.UNA.tarea2;

public class PrestamoDisplay extends javax.swing.JFrame {
	private javax.swing.JScrollPane scrollMensualidades;
	private javax.swing.JLabel lblPrestamo;
	private javax.swing.JTable tblMensualidades;

	public PrestamoDisplay() {
		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setTitle("Préstamo");
		setLayout(null);
		setSize(500, 250);

		lblPrestamo = new javax.swing.JLabel();
		lblPrestamo.setBackground(new java.awt.Color(204, 204, 204));
		lblPrestamo.setOpaque(true);
		lblPrestamo.setBounds(10, 10, 400, 25);
		add(lblPrestamo);

		tblMensualidades = new javax.swing.JTable();
		scrollMensualidades = new javax.swing.JScrollPane();
		scrollMensualidades.setBounds(10, 50, 400, 120);
		scrollMensualidades.setViewportView(tblMensualidades);
		add(scrollMensualidades);
	}

	public void show(Prestamo p){
		lblPrestamo.setText(p.toString());
		tblMensualidades.setModel(new MensualidadTableModel(p.getMensualidades()));
	}
}
