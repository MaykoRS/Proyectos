

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class GUI {

	private JFrame frame;
	private JLabel lbl;
	private JTextArea textArea;
	private JButton btn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GREEN);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btn = new JButton("Presionar");
		btn.setBounds(137, 227, 141, 31);
		btn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				textArea.setText("'Para mentir se necesitan dos, uno que mienta y otro que crea'");
			}
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btn);
		
		lbl = new JLabel("");
		lbl.setBounds(24, 30, 170, 177);
		ImageIcon img = new ImageIcon("src/homero.gif");
		Icon icono = new ImageIcon(img.getImage().getScaledInstance(lbl.getWidth(), lbl.getHeight(), img.getIconWidth()));
		lbl.setIcon(icono);
		frame.getContentPane().add(lbl);
		
		textArea = new JTextArea();
		textArea.setForeground(Color.BLUE);
		textArea.setFont(new Font("Comic Sans MS", Font.ITALIC, 17));
		textArea.setBackground(new Color(255, 255, 255));
		textArea.setBounds(254, 30, 162, 177);
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setWrapStyleWord(true);
		frame.getContentPane().add(textArea);
	}
}