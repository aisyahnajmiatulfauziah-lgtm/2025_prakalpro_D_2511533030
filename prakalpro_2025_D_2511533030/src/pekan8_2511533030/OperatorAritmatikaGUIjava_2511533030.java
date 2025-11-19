package pekan8_2511533030;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OperatorAritmatikaGUIjava_2511533030 extends JFrame {

	private static final long serialVersionUID = 1L;
	private final JLabel lblOperatorArtimatika = new JLabel("OPERATOR ARTIMATIKA");
	/**
	 * @wbp.nonvisual location=241,-13
	 */
	private final JLabel lblAngka = new JLabel("Angka 1");
	private final JLabel lblAngka_1 = new JLabel("Angka 1");
	private final JTextField textAngka1 = new JTextField();
	private final JTextField textAngka2 = new JTextField();
	private final JTextField textHasil = new JTextField();
	
	private void pesanPeringatan(String pesan) {
		JOptionPane.showMessageDialog(this,pesan,"Peringatan", JOptionPane.WARNING_MESSAGE);
	}
	private void pesanEror(String pesan) {
		JOptionPane.showMessageDialog(this, pesan,"Kesalahan",JOptionPane.ERROR_MESSAGE);
		
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperatorAritmatikaGUIjava_2511533030 frame = new OperatorAritmatikaGUIjava_2511533030();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OperatorAritmatikaGUIjava_2511533030() {
		textHasil.setBackground(new Color(255, 255, 255));
		textHasil.setHorizontalAlignment(SwingConstants.CENTER);
		textHasil.setEditable(false);
		textHasil.setBounds(73, 170, 75, 27);
		textHasil.setColumns(10);
		textAngka2.setBounds(75, 83, 75, 27);
		textAngka2.setColumns(10);
		textAngka1.setHorizontalAlignment(SwingConstants.CENTER);
		textAngka1.setBounds(73, 45, 75, 27);
		textAngka1.setColumns(10);
		setTitle("Program GUI pertama");
		getContentPane().setLayout(null);
		lblOperatorArtimatika.setHorizontalAlignment(SwingConstants.CENTER);
		lblOperatorArtimatika.setBounds(0, 0, 364, 14);
		getContentPane().add(lblOperatorArtimatika);
		lblAngka_1.setBounds(10, 39, 97, 33);
		getContentPane().add(lblAngka_1);
		
		JLabel lblAngka_1_1 = new JLabel("Angka 2");
		lblAngka_1_1.setBounds(10, 82, 97, 33);
		getContentPane().add(lblAngka_1_1);
		
		JLabel lblAngka_1_1_1 = new JLabel("Operator");
		lblAngka_1_1_1.setBounds(10, 126, 97, 33);
		getContentPane().add(lblAngka_1_1_1);
		
		JLabel lblAngka_1_1_1_1 = new JLabel("Hasil");
		lblAngka_1_1_1_1.setBounds(10, 170, 97, 33);
		getContentPane().add(lblAngka_1_1_1_1);
		
		getContentPane().add(textAngka1);
		
		getContentPane().add(textAngka2);
		
		getContentPane().add(textHasil);
		
		JComboBox cbOperator = new JComboBox();
		cbOperator.setModel(new DefaultComboBoxModel(new String[] {"+", "-", "*", "/", "%"}));
		cbOperator.setBounds(73, 131, 75, 22);
		getContentPane().add(cbOperator);
		
		JButton btnNewButton = new JButton("Hitung");
		btnNewButton.addActionListener(new ActionListener() {
			int hasil;
			public void actionPerformed(ActionEvent e) {
				if(textAngka1.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 1");
				} else if(textAngka2.getText().trim().isEmpty()) {
					pesanPeringatan("Inputkan angka 2");
				} else {
					try {
						int a= Integer.valueOf(textAngka1.getText());
						int b= Integer.parseInt(textAngka2.getText());
						int c= cbOperator.getSelectedIndex();
						if(c==0) {hasil= a+b; }
						if(c==1) { hasil=a-b; }
						if(c==2) { hasil=a*c; }
						if(c==3) { hasil=a/b; }
						if(c==4) { hasil=a%b; }
						textHasil.setText(String.valueOf(hasil));
					}catch (NumberFormatException ex) {
						pesanEror("Angka 1 dan Angka 2 tidak valid");
					}
				}
				
				}
			
		});
		btnNewButton.setBounds(168, 131, 88, 22);
		getContentPane().add(btnNewButton);

	}
}
