import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;

public class Home extends JFrame {

	private JPanel contentPane;
	private JLabel lblChooseADatastrucure;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
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
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblChooseADatastrucure = new JLabel("CHOOSE A DATA STRUCTURE");
		lblChooseADatastrucure.setBounds(92, 14, 208, 18);
		lblChooseADatastrucure.setHorizontalAlignment(SwingConstants.CENTER);
		lblChooseADatastrucure.setFont(new Font("Constantia", Font.BOLD, 14));
		lblChooseADatastrucure.setForeground(new Color(0, 0, 0));
		contentPane.add(lblChooseADatastrucure);
		
		JButton array = new JButton("ARRAY");
		array.setForeground(new Color(0, 0, 64));
		array.setBounds(159, 42, 81, 27);
		buttonGroup.add(array);
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE ARRAY WINDOW OPENING CODE HERE
		//		Array a=new Array();
		//		a.setVisible(true);
				new Array().setVisible(true);
			}
		});
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE STACK WINDOW OPENING CODE HERE
				new Stack().setVisible(true);
			}
		});
		stack.setForeground(new Color(255, 0, 0));
		stack.setFont(new Font("Tahoma", Font.BOLD, 14));
		stack.setBounds(32, 97, 79, 25);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE QUEUE WINDOW OPENING CODE HERE
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(128, 0, 128));
		queue.setFont(new Font("Tahoma", Font.BOLD, 14));
		queue.setBounds(281, 99, 83, 25);
		contentPane.add(queue);
		
		JButton button = new JButton("CIRCULARQUEUE");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE CIRCULARQUEUE WINDOW OPENING CODE HERE
				new CircularQueue().setVisible(true);
			}
		});
		button.setForeground(new Color(128, 0, 0));
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBounds(32, 165, 157, 25);
		contentPane.add(button);
		
		JButton sll = new JButton("SINGLELINKRDLIST");
		sll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE SINGLYLINKEDLIST WINDOW OPENING CODE HERE
				new SinglyLinkedList().setVisible(true);
			}
		});
		sll.setForeground(new Color(139, 0, 139));
		sll.setFont(new Font("Tahoma", Font.BOLD, 14));
		sll.setBounds(250, 165, 179, 25);
		contentPane.add(sll);
		
		JButton dll = new JButton("DOUBLYLINKEDLIST");
		dll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PLACE DOUBLYLINKEDLIST WINDOW OPENING CODE HERE
				new DoublyLinkedList().setVisible(true);
			}
		});
		dll.setForeground(Color.MAGENTA);
		dll.setFont(new Font("Tahoma", Font.BOLD, 14));
		dll.setBounds(136, 228, 183, 25);
		contentPane.add(dll);
	}

	protected JLabel getLblNewLabel() {
		return lblChooseADatastrucure;
	}
}
