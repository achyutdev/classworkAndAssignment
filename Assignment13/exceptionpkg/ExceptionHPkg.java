package exceptionpkg;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ExceptionHPkg {

	private JFrame frame;
	private JTextField tname;
	private JTextField txtAge;
	private JTextField txtMmddyyyy;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExceptionHPkg window = new ExceptionHPkg();
					window.frame.setVisible(true);
					window.frame.setSize(400,250);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ExceptionHPkg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		
		JPanel title = new JPanel();
		title.setBackground(new Color(0, 204, 204));
		frame.getContentPane().add(title, BorderLayout.NORTH);
		
		JLabel lblNewLabel_2 = new JLabel("Exception Testing.");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		title.add(lblNewLabel_2);
		
		JPanel footer = new JPanel();
		footer.setBackground(new Color(51, 204, 204));
		frame.getContentPane().add(footer, BorderLayout.SOUTH);
		
		JLabel copyright = new JLabel("(c) copyright reserved.");
		copyright.setHorizontalAlignment(SwingConstants.RIGHT);
		footer.add(copyright);
		
		JPanel left = new JPanel();
		frame.getContentPane().add(left, BorderLayout.WEST);
		left.setLayout(new BoxLayout(left, BoxLayout.Y_AXIS));
		
		JButton Reset = new JButton("Reset   ");
		Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tname.setText("");
				txtAge.setText("");
				txtMmddyyyy.setText("");
			}
		});
		
		Component verticalStrut_2 = Box.createVerticalStrut(5);
		left.add(verticalStrut_2);
		left.add(Reset);
		
		Component horizontalStrut = Box.createHorizontalStrut(7);
		left.add(horizontalStrut);
		
		Component verticalStrut = Box.createVerticalStrut(30);
		left.add(verticalStrut);
		JButton Submit = new JButton("Submit");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean flag=true;
				String msg="";
				try {
					SimpleDateFormat dateformat = new SimpleDateFormat("mm/dd/yyyy");
					if(tname.getText().getClass()!="foo".getClass()){
						throw new Exception();
					}
					Date date =dateformat.parse(txtMmddyyyy.getText());
					int age = Integer.parseInt(txtAge.getText());
				} catch (ParseException  ex) {
					msg+="error: "+ex+"\n";
					flag=false;
				}catch(Exception e1){
					msg+="error: "+e1;
					flag=false;
				}finally{
					if(!flag){
						JOptionPane.showMessageDialog(null, msg);
					}else{
						JOptionPane.showMessageDialog(null, "Submit Successfully.");
					}
				}
			}
		});
		left.add(Submit);
		
		Component verticalStrut_1 = Box.createVerticalStrut(30);
		left.add(verticalStrut_1);
		
		JButton close = new JButton(" Close  ");
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		left.add(close);
		
		Component verticalStrut_3 = Box.createVerticalStrut(5);
		left.add(verticalStrut_3);
		
		JPanel center = new JPanel();
		frame.getContentPane().add(center, BorderLayout.CENTER);
		center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
		
		JPanel Name = new JPanel();
		center.add(Name);
		
		JLabel name = new JLabel("Name");
		Name.add(name);
		
		tname = new JTextField();
		tname.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				tname.setText("");
			}
		});
		tname.setText(" e.g.  Achyut Dev");
		tname.setBackground(Color.WHITE);
		Name.add(tname);
		tname.setColumns(20);
		
		JPanel age = new JPanel();
		center.add(age);
		
		JLabel lblNewLabel = new JLabel("Age    ");
		age.add(lblNewLabel);
		
		txtAge = new JTextField();
		txtAge.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtAge.setText("");
			}
		});
		txtAge.setText("e.g. 25");
		age.add(txtAge);
		txtAge.setColumns(20);
		
		JPanel dob = new JPanel();
		center.add(dob);
		
		JLabel lblNewLabel_1 = new JLabel("DoB    ");
		dob.add(lblNewLabel_1);
		
		txtMmddyyyy = new JTextField();
		txtMmddyyyy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtMmddyyyy.setText("");
			}
		});
		txtMmddyyyy.setText("mm/dd/yyyy");
		dob.add(txtMmddyyyy);
		txtMmddyyyy.setColumns(20);
	}

}
