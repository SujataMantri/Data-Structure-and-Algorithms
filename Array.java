import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField insertposition;
	private JTextField deleteposition;
	private JTextField displaybox;
    private int arr[];
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 493);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblArrayDataStructure = new JLabel("ARRAY DATA STUCTURE");
		lblArrayDataStructure.setHorizontalAlignment(SwingConstants.CENTER);
		lblArrayDataStructure.setBounds(125, 10, 173, 17);
		lblArrayDataStructure.setForeground(new Color(0, 0, 128));
		lblArrayDataStructure.setFont(new Font("Tahoma", Font.BOLD, 14));
		contentPane.add(lblArrayDataStructure);
		
		JLabel lblEnterArrayLength = new JLabel("ENTER ARRAY LENGTH");
		lblEnterArrayLength.setForeground(new Color(128, 0, 0));
		lblEnterArrayLength.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterArrayLength.setHorizontalAlignment(SwingConstants.LEFT);
		lblEnterArrayLength.setBounds(61, 48, 164, 17);
		contentPane.add(lblEnterArrayLength);
		
		length = new JTextField();
		length.setBounds(264, 49, 120, 19);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnCreateArray = new JButton("CREATEARRAY");
		btnCreateArray.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for creating array
	//			String len=length.getText();
	//			int l=Integer.valueOf(len);
				int len=Integer.valueOf(length.getText());
				arr=new int[len];
				String message="Array of length"+len+"Created";
				Component contentPan;
				JOptionPane.showMessageDialog(contentPane, message);
			}
		});
		btnCreateArray.setForeground(new Color(128, 0, 128));
		btnCreateArray.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCreateArray.setBounds(190, 99, 180, 25);
		contentPane.add(btnCreateArray);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN INTEGER ELEMENT");
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterAnElement.setForeground(new Color(0, 100, 0));
		lblEnterAnElement.setBounds(0, 173, 214, 17);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(222, 171, 63, 19);
		contentPane.add(element);
		
		JLabel lblPosition = new JLabel("POSITION");
		lblPosition.setHorizontalAlignment(SwingConstants.LEFT);
		lblPosition.setForeground(new Color(128, 0, 0));
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPosition.setBounds(295, 173, 75, 17);
		contentPane.add(lblPosition);
		
		insertposition = new JTextField();
		insertposition.setColumns(10);
		insertposition.setBounds(381, 171, 63, 19);
		contentPane.add(insertposition);
		
		JButton Insert = new JButton("INSERT");
		Insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insertion
				int elem=Integer.valueOf(element.getText());
				int pos=Integer.valueOf(insertposition.getText());
				arr[pos]=elem;
				String message="Element"+elem+"Inserted@position"+pos;
				JOptionPane.showMessageDialog(contentPane,message);
				element.setText("");
				insertposition.setText("");
			}
		});
		Insert.setForeground(new Color(128, 0, 128));
		Insert.setFont(new Font("Tahoma", Font.BOLD, 14));
		Insert.setBounds(453, 165, 97, 25);
		contentPane.add(Insert);
		
		JLabel lblEnterThePosition = new JLabel("DELETE  POSITION");
		lblEnterThePosition.setForeground(new Color(0, 100, 0));
		lblEnterThePosition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblEnterThePosition.setBounds(10, 260, 138, 17);
		contentPane.add(lblEnterThePosition);
		
		deleteposition = new JTextField();
		deleteposition.setFont(new Font("Tahoma", Font.PLAIN, 10));
		deleteposition.setColumns(10);
		deleteposition.setBounds(190, 261, 63, 19);
		contentPane.add(deleteposition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for deletion
				int pos=Integer.valueOf(deleteposition.getText());
				arr[pos]=0;
				String message="element Deleted@ the position"+pos;
				JOptionPane.showMessageDialog(contentPane,message);
				deleteposition.setText("");
			}
		});
		delete.setForeground(new Color(128, 0, 128));
		delete.setFont(new Font("Tahoma", Font.BOLD, 14));
		delete.setBounds(332, 256, 97, 25);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				for(int i=0;i<=arr.length-1;i++)
				{
					msg=msg+" "+arr[i];
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(128, 0, 128));
		display.setFont(new Font("Tahoma", Font.BOLD, 14));
		display.setBounds(233, 342, 115, 25);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 16));
		displaybox.setBackground(new Color(127, 255, 212));
		displaybox.setForeground(new Color(128, 0, 128));
		displaybox.setBounds(102, 395, 306, 26);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
	}
}
