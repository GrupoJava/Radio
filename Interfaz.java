import java.awt.EventQueue;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;

public class Interfaz {
	private JFrame frame;
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
		frame.setBounds(100, 100, 622, 379);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnOffon = new JButton("Off/On");
		btnOffon.setBounds(10, 11, 89, 23);
		frame.getContentPane().add(btnOffon);
		
		JButton btnAmfm = new JButton("AM/FM");
		btnAmfm.setBounds(10, 45, 89, 23);
		frame.getContentPane().add(btnAmfm);
		
		JLabel lblAm = new JLabel("107.9 FM");
		lblAm.setFont(new Font("Tahoma", Font.PLAIN, 89));
		lblAm.setBounds(208, 99, 388, 229);
		frame.getContentPane().add(lblAm);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(10, 99, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.setBounds(10, 136, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.setBounds(10, 170, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4");
		btnNewButton_3.setBounds(10, 204, 89, 23);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("5");
		btnNewButton_4.setBounds(10, 237, 89, 23);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.setBounds(10, 271, 89, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(109, 99, 89, 23);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("8");
		btnNewButton_7.setBounds(109, 136, 89, 23);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("9");
		btnNewButton_8.setBounds(109, 170, 89, 23);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("10");
		btnNewButton_9.setBounds(109, 204, 89, 23);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("11");
		btnNewButton_10.setBounds(109, 237, 89, 23);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("12");
		btnNewButton_11.setBounds(109, 271, 89, 23);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.setBounds(109, 11, 89, 23);
		frame.getContentPane().add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(109, 45, 89, 23);
		frame.getContentPane().add(btnSiguiente);
		
		JButton button = new JButton(">>");
		button.setBounds(109, 305, 89, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("<<");
		button_1.setBounds(10, 305, 89, 23);
		frame.getContentPane().add(button_1);
		
		JLabel lblVolumen = new JLabel("Volumen: 50");
		lblVolumen.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblVolumen.setBounds(222, 15, 352, 53);
		frame.getContentPane().add(lblVolumen);
	}
}