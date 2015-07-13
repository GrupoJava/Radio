import java.awt.EventQueue;
import java.awt.Window;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;


import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;

public class Interfaz {
	private JFrame frame;
	private Radio radio;
	private JButton btnOffon;
	private JButton btnAmfm;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JButton btnNewButton_10;
	private JButton btnNewButton_11;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton forward;
	private JButton backward;
	private JButton btnSubir;
	private JButton btnBajar;
	private JCheckBox chckbxGuardarEstacion;
	private JLabel lblVolumen;
	private JLabel lblAm;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz window = new Interfaz();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Interfaz(){
		initialize();
	}
	public void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnOffon = new JButton("Off/On");
		btnOffon.setBounds(10, 11, 89, 23);
		btnOffon.addActionListener(new Evento());
		frame.getContentPane().add(btnOffon);
		
		btnAmfm = new JButton("AM/FM");
		btnAmfm.setBounds(10, 45, 89, 23);
		btnAmfm.addActionListener(new Evento());
		frame.getContentPane().add(btnAmfm);
		
		lblAm = new JLabel("107.9 FM");
		lblAm.setFont(new Font("Tahoma", Font.PLAIN, 89));
		lblAm.setBounds(208, 99, 388, 229);
		frame.getContentPane().add(lblAm);
		
		btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 99, 89, 23);
		btnNewButton.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(10, 136, 89, 23);
		btnNewButton_1.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_1);
		
		btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(10, 170, 89, 23);
		btnNewButton_2.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(10, 204, 89, 23);
		btnNewButton_3.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(10, 237, 89, 23);
		btnNewButton_4.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(10, 271, 89, 23);
		btnNewButton_5.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(109, 99, 89, 23);
		btnNewButton_6.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_6);
		
		btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(109, 136, 89, 23);
		btnNewButton_7.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_7);
		
		btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(109, 170, 89, 23);
		btnNewButton_8.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_8);
		
		btnNewButton_9 = new JButton("10");
		btnNewButton_9.setBounds(109, 204, 89, 23);
		btnNewButton_9.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_9);
		
		btnNewButton_10 = new JButton("11");
		btnNewButton_10.setBounds(109, 237, 89, 23);
		btnNewButton_10.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_10);
		
		btnNewButton_11 = new JButton("12");
		btnNewButton_11.setBounds(109, 271, 89, 23);
		btnNewButton_11.addActionListener(new Evento());
		frame.getContentPane().add(btnNewButton_11);
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(109, 11, 89, 23);
		btnAnterior.addActionListener(new Evento());
		frame.getContentPane().add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(109, 45, 89, 23);
		btnSiguiente.addActionListener(new Evento());
		frame.getContentPane().add(btnSiguiente);
		
		forward = new JButton(">>");
		forward.setBounds(109, 305, 89, 23);
		forward.addActionListener(new Evento());
		frame.getContentPane().add(forward);
		
		backward = new JButton("<<");
		backward.setBounds(10, 305, 89, 23);
		backward.addActionListener(new Evento());
		frame.getContentPane().add(backward);
		
		lblVolumen = new JLabel("Volumen: 100");
		lblVolumen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVolumen.setBounds(222, 15, 224, 53);
		frame.getContentPane().add(lblVolumen);
		
		btnSubir = new JButton("Subir");
		btnSubir.setBounds(456, 11, 89, 23);
		btnSubir.addActionListener(new Evento());
		frame.getContentPane().add(btnSubir);
		
		btnBajar = new JButton("Bajar");
		btnBajar.setBounds(456, 38, 89, 23);
		btnBajar.addActionListener(new Evento());
		frame.getContentPane().add(btnBajar);
		
		chckbxGuardarEstacion = new JCheckBox("Guardar Estacion");
		chckbxGuardarEstacion.setBounds(10, 75, 126, 23);
		frame.getContentPane().add(chckbxGuardarEstacion);
		
		JLabel lblCheckeeEstaOpcion = new JLabel("Marque esta opcion para guardar la estacion y no cargar la guardada en la posicion");
		lblCheckeeEstaOpcion.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCheckeeEstaOpcion.setBounds(144, 79, 449, 14);
		frame.getContentPane().add(lblCheckeeEstaOpcion);
	}
	private class Evento implements ActionListener{

		public void actionPerformed(ActionEvent a) {
			if(a.getSource()== btnOffon){
				radio.encenderApagar();
			}else if(a.getSource() == btnAmfm){
				radio.cambiarFrec();
			}else if(a.getSource() == btnNewButton){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 0);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[0]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[0]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
			}else if(a.getSource() == btnNewButton_1){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 1);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[1]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[1]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_2){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 2);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[2]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[2]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_3){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 3);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[3]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[3]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_4){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 4);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[4]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[4]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_5){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 5);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[5]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[5]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_6){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 6);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[6]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[6]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_7){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 7);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[7]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[7]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_8){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 8);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[8]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[8]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_9){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 9);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[9]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[9]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_10){
				if(chckbxGuardarEstacion.isEnabled()){
					radio.guardarEmisora(radio.getEmisora(), 10);
				}else{
					if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
						radio.setEmisora(radio.getEmiAM()[10]);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.setEmisora(radio.getEmiFM()[10]);
						lblAm.setText((radio.getEmisora())+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_11){if(chckbxGuardarEstacion.isEnabled()){
				radio.guardarEmisora(radio.getEmisora(), 11);
			}else{
				if(radio.getFrecuencia() == 1){ //Cargando emisora de AM
					radio.setEmisora(radio.getEmiAM()[11]);
					lblAm.setText((int)(radio.getEmisora())+"AM");
				}else{ //Cargando emisora de FM
					radio.setEmisora(radio.getEmiFM()[11]);
					lblAm.setText((radio.getEmisora())+"FM");
				}
			}
				
			}
		}
		
		
		
	}
}
