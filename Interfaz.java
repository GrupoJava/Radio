import java.awt.EventQueue;
import java.awt.Window;
import java.math.BigDecimal;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;

/**
 * @author 
 *
 */
public class Interfaz {
	private JFrame frame;
	private String frecuencia = "AM";
	private Radio radio = new Radio();
	private int posicionFavorita = 0;
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
	private JLabel lblRadioApagada;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			/* (non-Javadoc)
			 * @see java.lang.Runnable#run()
			 */
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
	
	/**
	 * 
	 */
	public Interfaz(){
		initialize();
	}
	/**
	 * 
	 */
	public void initialize(){
		frame = new JFrame();
		frame.setBounds(100, 100, 671, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnOffon = new JButton ("Off/On");
		btnOffon.setBounds(10, 11, 89, 23);
		btnOffon.addActionListener(new Evento());
		frame.getContentPane().add(btnOffon);
		
		btnAmfm = new JButton ("AM/FM");
		btnAmfm.setBounds(109, 11, 89, 23);
		btnAmfm.addActionListener(new Evento());
		frame.getContentPane().add(btnAmfm);
		
		lblAm = new JLabel("Emisora");
		lblAm.setFont(new Font("Tahoma", Font.PLAIN, 89));
		lblAm.setBounds(208, 153, 388, 175);
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
		btnAnterior.setBounds(208, 136, 89, 23);
		btnAnterior.addActionListener(new Evento());
		frame.getContentPane().add(btnAnterior);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(307, 136, 89, 23);
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
		
		lblVolumen = new JLabel("Volumen: ---");
		lblVolumen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVolumen.setBounds(322, 11, 224, 53);
		frame.getContentPane().add(lblVolumen);
		
		btnSubir = new JButton("Subir");
		btnSubir.setBounds(556, 11, 89, 23);
		btnSubir.addActionListener(new Evento());
		frame.getContentPane().add(btnSubir);
		
		btnBajar = new JButton("Bajar");
		btnBajar.setBounds(556, 38, 89, 23);
		btnBajar.addActionListener(new Evento());
		frame.getContentPane().add(btnBajar);
		
		chckbxGuardarEstacion = new JCheckBox("Guardar Estacion");
		chckbxGuardarEstacion.setBounds(10, 75, 126, 23);
		frame.getContentPane().add(chckbxGuardarEstacion);
		
		JLabel lblCheckeeEstaOpcion = new JLabel("Checkee esta opcion para guardar la estacion y no cargar la guardada en la posicion");
		lblCheckeeEstaOpcion.setFont(new Font("Tahoma", Font.PLAIN, 9));
		lblCheckeeEstaOpcion.setBounds(144, 79, 449, 14);
		frame.getContentPane().add(lblCheckeeEstaOpcion);
		
		lblRadioApagada = new JLabel("Radio Apagada");
		lblRadioApagada.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblRadioApagada.setBounds(10, 38, 188, 28);
		frame.getContentPane().add(lblRadioApagada);
		  btnAmfm.setEnabled(false);
		  btnNewButton.setEnabled(false);
		  btnNewButton_1.setEnabled(false);
		  btnNewButton_2.setEnabled(false);
		  btnNewButton_3.setEnabled(false);
		  btnNewButton_4.setEnabled(false);
		  btnNewButton_5.setEnabled(false);
		  btnNewButton_6.setEnabled(false);
		  btnNewButton_7.setEnabled(false);
		  btnNewButton_8.setEnabled(false);
		  btnNewButton_9.setEnabled(false);
		  btnNewButton_10.setEnabled(false);
		  btnNewButton_11.setEnabled(false);
		  btnAnterior.setEnabled(false);
		  btnSiguiente.setEnabled(false);
		  forward.setEnabled(false);
		  backward.setEnabled(false);
		  btnSubir.setEnabled(false);
		  btnBajar.setEnabled(false);
		  chckbxGuardarEstacion.setEnabled(false);
	}
	private class Evento implements ActionListener{

		/* (non-Javadoc)
		 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
		 */
		public void actionPerformed(ActionEvent a) {
			if(a.getSource()== btnOffon){
				radio.encenderApagar();
				if(!radio.getEncendido()){
					lblRadioApagada.setText("Radio Agapada");
					lblAm.setText("Emisora");
					lblVolumen.setText("Volumen: ---");
					btnAmfm.setEnabled(false);
					  btnNewButton.setEnabled(false);
					  btnNewButton_1.setEnabled(false);
					  btnNewButton_2.setEnabled(false);
					  btnNewButton_3.setEnabled(false);
					  btnNewButton_4.setEnabled(false);
					  btnNewButton_5.setEnabled(false);
					  btnNewButton_6.setEnabled(false);
					  btnNewButton_7.setEnabled(false);
					  btnNewButton_8.setEnabled(false);
					  btnNewButton_9.setEnabled(false);
					  btnNewButton_10.setEnabled(false);
					  btnNewButton_11.setEnabled(false);
					  btnAnterior.setEnabled(false);
					  btnSiguiente.setEnabled(false);
					  forward.setEnabled(false);
					  backward.setEnabled(false);
					  btnSubir.setEnabled(false);
					  btnBajar.setEnabled(false);
					  chckbxGuardarEstacion.setEnabled(false);
				}else{
					lblRadioApagada.setText("Radio Encendida");
					lblAm.setText((int)radio.getEmisora()+"AM");
					btnAmfm.setEnabled(true);
					  btnNewButton.setEnabled(true);
					  btnNewButton_1.setEnabled(true);
					  btnNewButton_2.setEnabled(true);
					  btnNewButton_3.setEnabled(true);
					  btnNewButton_4.setEnabled(true);
					  btnNewButton_5.setEnabled(true);
					  btnNewButton_6.setEnabled(true);
					  btnNewButton_7.setEnabled(true);
					  btnNewButton_8.setEnabled(true);
					  btnNewButton_9.setEnabled(true);
					  btnNewButton_10.setEnabled(true);
					  btnNewButton_11.setEnabled(true);
					  btnAnterior.setEnabled(true);
					  btnSiguiente.setEnabled(true);
					  forward.setEnabled(true);
					  backward.setEnabled(true);
					  btnSubir.setEnabled(true);
					  btnBajar.setEnabled(true);
					  chckbxGuardarEstacion.setEnabled(true);
				}
			}else if(a.getSource() == btnAmfm){
				radio.cambiarFrec();
				if(radio.getFrec().equals("AM")){
					frecuencia = "AM";
					lblAm.setText(radio.MIN_AM+frecuencia);
					
				}else {
					frecuencia = "FM";
					lblAm.setText(radio.MIN_FM+frecuencia);
					
				}
			}else if(a.getSource() == btnNewButton){
				posicionFavorita=0;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 0);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(0);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(0);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
			}else if(a.getSource() == btnNewButton_1){
				posicionFavorita=1;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 1);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(1);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(1);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_2){
				posicionFavorita=2;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 2);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(2);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(2);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_3){
				posicionFavorita=3;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 3);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(3);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(3);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_4){
				posicionFavorita=4;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 4);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(4);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(4);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_5){
				posicionFavorita=5;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 5);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(5);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(5);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_6){
				posicionFavorita=6;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 6);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(6);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(6);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_7){
				posicionFavorita=7;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 7);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(7);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(7);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_8){
				posicionFavorita=8;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 8);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(8);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(8);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_9){
				posicionFavorita=9;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 9);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(9);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(9);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_10){
				posicionFavorita=10;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 10);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(10);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(10);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource() == btnNewButton_11){
				posicionFavorita=11;
				if(chckbxGuardarEstacion.isSelected()){
					radio.guardarEmisora(radio.getEmisora(), 11);
				}else{
					if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
						radio.cargarEmisora(11);
						lblAm.setText((int)(radio.getEmisora())+"AM");
					}else{ //Cargando emisora de FM
						radio.cargarEmisora(11);
						lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
					}
				}
				
			}else if(a.getSource()==btnAnterior){
				radio.atrasarEmisora();
				if(frecuencia.equals("AM")){
					lblAm.setText((int)(radio.getEmisora())+frecuencia);
				}else{
					lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+frecuencia);
				}
			}else if(a.getSource()==btnSiguiente){
				radio.adelantarEmisora();
				if(frecuencia.equals("AM")){
					lblAm.setText((int)(radio.getEmisora())+frecuencia);
				}else{
					lblAm.setText((new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue())+frecuencia);
				}
			}else if(a.getSource()==btnSubir){
				radio.subirVolumen();
				lblVolumen.setText("Volumen:"+radio.getVolumen());
			}else if(a.getSource()==btnBajar){
				radio.bajarVolumen();
				lblVolumen.setText("Volumen:"+radio.getVolumen());
			}else if(a.getSource()==forward){
				if(posicionFavorita ==11){
					posicionFavorita=0;
				}else{
					posicionFavorita++;
				}
				if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
					radio.cargarEmisora(posicionFavorita);
					lblAm.setText((int)(radio.getEmisora())+"AM");
				}else{ //Cargando emisora de FM
					radio.cargarEmisora(posicionFavorita);
					lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
				}
			}else if(a.getSource()==backward){
				if(posicionFavorita ==0){
					posicionFavorita=11;
				}else{
					posicionFavorita--;
				}
				if(radio.getFrec().equals("AM")){ //Cargando emisora de AM
					radio.cargarEmisora(posicionFavorita);
					lblAm.setText((int)(radio.getEmisora())+"AM");
				}else{ //Cargando emisora de FM
					radio.cargarEmisora(posicionFavorita);
					lblAm.setText(new BigDecimal(radio.getEmisora() ).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue()+"FM");
				}
			}
			
		}
	}
}
