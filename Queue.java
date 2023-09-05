import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField DisplayBox;
	private int q[];
	private int size;
	private int r=-1;
	private int f=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 421);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 228, 225));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbLQueueDataStructure = new JLabel("QUEUE DATA STRUCTURE");
		lbLQueueDataStructure.setBounds(144, 10, 217, 20);
		lbLQueueDataStructure.setForeground(new Color(64, 0, 128));
		lbLQueueDataStructure.setFont(new Font("Tahoma", Font.BOLD, 16));
		contentPane.add(lbLQueueDataStructure);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE :");
		lblEnterQueueSize.setForeground(new Color(0, 128, 64));
		lblEnterQueueSize.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterQueueSize.setBounds(10, 62, 173, 20);
		contentPane.add(lblEnterQueueSize);
		
		sizefield = new JTextField();
		sizefield.setForeground(new Color(255, 0, 255));
		sizefield.setFont(new Font("Tahoma", Font.BOLD, 16));
		sizefield.setBounds(205, 59, 156, 26);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton btnCreateQueue = new JButton("CREATE QUEUE");
		btnCreateQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for creating Queue
				size=Integer.valueOf(sizefield.getText());
				q=new int[size];
				String message="queue of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		btnCreateQueue.setForeground(new Color(128, 0, 255));
		btnCreateQueue.setBackground(new Color(255, 0, 255));
		btnCreateQueue.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCreateQueue.setBounds(188, 110, 173, 29);
		contentPane.add(btnCreateQueue);
		
		JLabel lblNewLabel = new JLabel("ENTER AN ELEMENT ");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(10, 175, 173, 20);
		contentPane.add(lblNewLabel);
		
		element = new JTextField();
		element.setForeground(Color.MAGENTA);
		element.setFont(new Font("Tahoma", Font.BOLD, 16));
		element.setColumns(10);
		element.setBounds(205, 172, 156, 26);
		contentPane.add(element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
				int elem;
				if(r==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"insertion not possible");
				}
				else
				{
					 elem=Integer.valueOf(element.getText());
					++r;
					q[r]=elem;
					JOptionPane.showMessageDialog(contentPane,"insertion successfull");
					element.setText("");
			    }
		    }
		});
		btnInsert.setForeground(new Color(128, 0, 64));
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsert.setBackground(Color.MAGENTA);
		btnInsert.setBounds(386, 171, 114, 29);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for deletion
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"deletion not possible");
				}
				else
				{
					String message="Element deleted is:"+q[f];
					JOptionPane.showMessageDialog(contentPane,message);
					++f;
			}
			}
		});
		btnDelete.setForeground(new Color(0, 255, 255));
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBackground(Color.MAGENTA);
		btnDelete.setBounds(209, 222, 114, 29);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display
				String msg="";
				if(r==-1||f>r)
				{
					JOptionPane.showMessageDialog(contentPane,"display not possible");
				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg=msg+" "+q[i];	
					}
					DisplayBox.setText(msg);
			}
			}
		});
		btnDisplay.setForeground(new Color(255, 0, 255));
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDisplay.setBackground(new Color(192, 192, 192));
		btnDisplay.setBounds(209, 275, 119, 29);
		contentPane.add(btnDisplay);
		
		DisplayBox = new JTextField();
		DisplayBox.setBackground(new Color(255, 128, 64));
		DisplayBox.setForeground(new Color(0, 0, 205));
		DisplayBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		DisplayBox.setColumns(10);
		DisplayBox.setBounds(96, 330, 371, 26);
		contentPane.add(DisplayBox);
	}
}
