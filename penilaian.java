import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class penilaian extends JFrame {

	private JPanel contentPane;
	private JTextField nama;
	private JTextField nilai;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					penilaian frame = new penilaian();
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
	public penilaian() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama :");
		lblNama.setBounds(23, 11, 46, 14);
		contentPane.add(lblNama);
		
		nama = new JTextField();
		nama.setBounds(10, 36, 86, 20);
		contentPane.add(nama);
		nama.setColumns(10);
		
		JLabel lblNailai = new JLabel("Nailai :");
		lblNailai.setBounds(23, 67, 46, 14);
		contentPane.add(lblNailai);
		
		nilai = new JTextField();
		nilai.setBounds(10, 92, 86, 20);
		contentPane.add(nilai);
		nilai.setColumns(10);
		
		JButton btnOk = new JButton("ok");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String namaku = nama.getText();
				String nilaiku = nilai.getText();
				String grade,ket;
				
				int nilaikuda = Integer.parseInt(nilaiku);
				
				if(nilaikuda >= 90){
					grade="A";
					ket="pulang";
				}else if(nilaikuda >= 80){
					grade="B";
					ket="pulang";
				}else if(nilaikuda >= 70){
					grade="C";
					ket="pulang";
				}else if(nilaikuda >= 60){
					grade="D";
					ket="pulang";
				}else{
					grade="E";
					ket="nginep";
				}
				
				JOptionPane.showConfirmDialog(null, "Nilai Kamu" + "\n" +grade +"\n"+"Kamu Boleh"+ket);
			}
		});
		btnOk.setBounds(20, 123, 49, 23);
		contentPane.add(btnOk);
	}

}
