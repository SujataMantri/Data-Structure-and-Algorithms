import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField Sizefield;
	private JTextField element;
	private JTextField DisplayBox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;
   
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 553, 420);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR QUEUE DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 128, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(102, 10, 306, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblEnterCircularQueue = new JLabel("ENTER CIRCULAR QUEUE SIZE :");
		lblEnterCircularQueue.setForeground(new Color(255, 0, 128));
		lblEnterCircularQueue.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterCircularQueue.setBounds(10, 64, 255, 20);
		contentPane.add(lblEnterCircularQueue);
		
		Sizefield = new JTextField();
		Sizefield.setForeground(Color.MAGENTA);
		Sizefield.setFont(new Font("Tahoma", Font.BOLD, 16));
		Sizefield.setColumns(10);
		Sizefield.setBounds(295, 61, 156, 26);
		contentPane.add(Sizefield);
		
		JButton btnCreateCircularQueue = new JButton("CREATE CIRCULAR QUEUE");
		btnCreateCircularQueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for CircularQueue
				size=Integer.valueOf(Sizefield.getText());
				cq=new int[size];
				String message="circularqueue of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane,message);
			}
		});
		btnCreateCircularQueue.setForeground(new Color(128, 0, 255));
		btnCreateCircularQueue.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCreateCircularQueue.setBackground(Color.MAGENTA);
		btnCreateCircularQueue.setBounds(121, 118, 289, 29);
		contentPane.add(btnCreateCircularQueue);
		
		JLabel lblEnterTheElement = new JLabel("ENTER THE ELEMENT ");
		lblEnterTheElement.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterTheElement.setBounds(10, 175, 180, 20);
		contentPane.add(lblEnterTheElement);
		
		element = new JTextField();
		element.setForeground(Color.MAGENTA);
		element.setFont(new Font("Tahoma", Font.BOLD, 16));
		element.setColumns(10);
		element.setBounds(200, 172, 156, 26);
		contentPane.add(element);
		
		JButton btnInsert = new JButton("INSERT");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for insertion
				int elem;
				if(count==size)
				{
					JOptionPane.showMessageDialog(contentPane,"insertion not possible");
				}
				else
				{
					 elem=Integer.valueOf(element.getText());
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane,"insertion successfull");
					element.setText("");
			    }
			}
		});
		btnInsert.setForeground(new Color(128, 0, 64));
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnInsert.setBackground(Color.MAGENTA);
		btnInsert.setBounds(392, 171, 114, 29);
		contentPane.add(btnInsert);
		
		JButton btnDelete = new JButton("DELETE");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for deletion
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"insertion not possible");
				}
				else
				{
					String message="Element deleted is:"+cq[f];
					f=(f+1)%size;
					count--;
					JOptionPane.showMessageDialog(contentPane,message);
					++f;
			    }
			}
		});
		btnDelete.setForeground(Color.CYAN);
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDelete.setBackground(Color.MAGENTA);
		btnDelete.setBounds(209, 218, 114, 29);
		contentPane.add(btnDelete);
		
		JButton btnDisplay = new JButton("DISPLAY");
		btnDisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code for display
				int f1=f;
				String msg="";
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane,"display not possible");
				}
				else
				{
					for(int i=1;i<=count;i++)
					{
						msg=msg+" "+cq[f1];	
						f1=(f1+1)%size;
					}
					DisplayBox.setText(msg);
			}
			}
		});
		btnDisplay.setForeground(Color.MAGENTA);
		btnDisplay.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDisplay.setBackground(new Color(192, 192, 192));
		btnDisplay.setBounds(204, 278, 152, 29);
		contentPane.add(btnDisplay);
		
		DisplayBox = new JTextField();
		DisplayBox.setForeground(new Color(0, 0, 205));
		DisplayBox.setFont(new Font("Tahoma", Font.BOLD, 16));
		DisplayBox.setColumns(10);
		DisplayBox.setBackground(new Color(255, 128, 64));
		DisplayBox.setBounds(67, 333, 403, 26);
		contentPane.add(DisplayBox);
	}
}
