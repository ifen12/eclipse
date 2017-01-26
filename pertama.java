import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class pertama extends JFrame {

	private JPanel contentPane;
	private JTextField nama;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pertama frame = new pertama();
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
	public pertama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNama = new JLabel("Nama :");
		lblNama.setBounds(10, 11, 46, 14);
		contentPane.add(lblNama);
		
		nama = new JTextField();
		nama.setBounds(10, 36, 86, 20);
		contentPane.add(nama);
		nama.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String a = nama.getText();
				
				JOptionPane.showConfirmDialog(null, "Hallo "+ a +" Kamu Boleh pulang !!!" );
			}
		});
		btnOk.setBounds(10, 71, 52, 23);
		contentPane.add(btnOk);
	}

}
