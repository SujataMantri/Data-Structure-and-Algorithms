import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
  private int s[];   
  private int size;
  private int top=-1;
  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 419);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(173, 216, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblStackDataStructure = new JLabel("STACK DATA STRUCTURE");
		lblStackDataStructure.setForeground(new Color(128, 0, 128));
		lblStackDataStructure.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStackDataStructure.setBounds(107, 10, 213, 20);
		contentPane.add(lblStackDataStructure);
		
		JLabel lblEnterTheStack = new JLabel("ENTER THE STACK SIZE");
		lblEnterTheStack.setForeground(new Color(0, 0, 160));
		lblEnterTheStack.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterTheStack.setBounds(21, 74, 201, 20);
		contentPane.add(lblEnterTheStack);
		
		sizefield = new JTextField();
		sizefield.setForeground(new Color(0, 128, 0));
		sizefield.setFont(new Font("Tahoma", Font.BOLD, 16));
		sizefield.setBounds(250, 65, 96, 29);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton stack = new JButton("CREATE STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//stack creation code
				size=Integer.valueOf(sizefield.getText());
				s=new int[size];
				String message="Stack of size"+size+"Created";
				JOptionPane.showMessageDialog(contentPane,message);
				
			}
		});
		stack.setForeground(new Color(0, 0, 0));
		stack.setFont(new Font("Tahoma", Font.BOLD, 16));
		stack.setBounds(139, 131, 181, 29);
		contentPane.add(stack);
		
		JLabel lblEnterAnElement = new JLabel("ENTER AN ELEMENT");
		lblEnterAnElement.setForeground(new Color(0, 0, 160));
		lblEnterAnElement.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEnterAnElement.setBounds(21, 194, 168, 20);
		contentPane.add(lblEnterAnElement);
		
		element = new JTextField();
		element.setForeground(new Color(0, 128, 0));
		element.setFont(new Font("Tahoma", Font.BOLD, 16));
		element.setColumns(10);
		element.setBounds(195, 185, 96, 28);
		contentPane.add(element);
		
		JButton Push = new JButton("PUSH");
		Push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push code
				int elem;
				if(top==size-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Push not possible");
				}
				else
				{
					 elem=Integer.valueOf(element.getText());
					++top;
					s[top]=elem;
					JOptionPane.showMessageDialog(contentPane,"Push successfull");
					element.setText("");
				}
			}
		});
		Push.setForeground(new Color(255, 0, 255));
		Push.setFont(new Font("Tahoma", Font.BOLD, 16));
		Push.setBounds(331, 185, 96, 29);
		contentPane.add(Push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop code
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"Pop not possible");
				}
				else
				{
					String message="Element deleted is:"+s[top];
					JOptionPane.showMessageDialog(contentPane,message);
					--top;
			}
			}
		});
		pop.setForeground(Color.MAGENTA);
		pop.setFont(new Font("Tahoma", Font.BOLD, 16));
		pop.setBounds(178, 241, 91, 29);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display code
				String msg="";
				if(top==-1)
				{
					JOptionPane.showMessageDialog(contentPane,"display not possible");
				}
				else
				{
					for(int i=top;i>=0;i--)
					{
						msg=msg+" "+s[i];	
					}
					displaybox.setText(msg);
			}
			}
		});
		display.setForeground(Color.MAGENTA);
		display.setFont(new Font("Tahoma", Font.BOLD, 16));
		display.setBounds(139, 287, 156, 29);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(250, 250, 210));
		displaybox.setForeground(new Color(0, 128, 0));
		displaybox.setFont(new Font("Tahoma", Font.BOLD, 16));
		displaybox.setColumns(10);
		displaybox.setBounds(21, 337, 415, 35);
		contentPane.add(displaybox);
	}
}
