import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class ke2 extends JFrame {

	private JPanel contentPane;
	private JTextField angka1;
	private JTextField angka2;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ke2 frame = new ke2();
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
	public ke2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAngka = new JLabel("Angka ");
		lblAngka.setBounds(10, 11, 46, 14);
		contentPane.add(lblAngka);
		
		angka1 = new JTextField();
		angka1.setBounds(111, 8, 46, 20);
		contentPane.add(angka1);
		angka1.setColumns(10);
		
		JLabel lblAngkaKe = new JLabel("angka ke 2");
		lblAngkaKe.setBounds(10, 36, 66, 14);
		contentPane.add(lblAngkaKe);
		
		angka2 = new JTextField();
		angka2.setBounds(111, 33, 46, 20);
		contentPane.add(angka2);
		angka2.setColumns(10);
		
		JRadioButton rdbtnTambah = new JRadioButton("tambah");
		buttonGroup.add(rdbtnTambah);
		rdbtnTambah.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnTambah.setBounds(10, 72, 109, 23);
		contentPane.add(rdbtnTambah);
		
		JRadioButton rdbtnKurang = new JRadioButton("kurang");
		buttonGroup.add(rdbtnKurang);
		rdbtnKurang.setBounds(10, 109, 109, 23);
		contentPane.add(rdbtnKurang);
		
		JRadioButton rdbtnKali = new JRadioButton("kali");
		buttonGroup.add(rdbtnKali);
		rdbtnKali.setBounds(121, 72, 109, 23);
		contentPane.add(rdbtnKali);
		
		JRadioButton rdbtnBagi = new JRadioButton("bagi");
		buttonGroup.add(rdbtnBagi);
		rdbtnBagi.setBounds(121, 109, 109, 23);
		contentPane.add(rdbtnBagi);
		
		JButton btnHitung = new JButton("Hitung");
		btnHitung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hasil1 = angka1.getText();
				int nilaihasil1 = Integer.parseInt(hasil1);
				String hasil2 = angka2.getText();
				int nilaihasil2 = Integer.parseInt(hasil2);
				int hasil;
				String ket;
				
				if(rdbtnTambah.isSelected()){
					hasil = nilaihasil1 + nilaihasil2;
					ket = "tambah";
				}else if(rdbtnKurang.isSelected()){
					hasil = nilaihasil1 - nilaihasil2;
					ket = "kurang";
				}else if(rdbtnBagi.isSelected()){
					hasil = nilaihasil1 / nilaihasil2;
					ket = "bagi";
				}else if(rdbtnKali.isSelected()){
					hasil = nilaihasil1 * nilaihasil2;
					ket = "kali";
				}else{
					hasil = nilaihasil1 = nilaihasil2;
					ket = "sama dengan";
				}
				
				JOptionPane.showConfirmDialog(null, "jumlah nya" + "\n" +hasil);
			}
		});
		btnHitung.setBounds(10, 139, 89, 23);
		contentPane.add(btnHitung);
	}
}
