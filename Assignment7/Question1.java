package question1;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
class GuiDev extends JFrame {
	GuiDev(String title) {
		super(title);

		AddCompanent();

		// initialization
		initializationWindow();
	}

	private void AddCompanent() {

		// Top title - Student Registration
		JPanel north = new JPanel();
		JLabel title = new JLabel("Student Registration");
		title.setFont(new Font("Aril", Font.BOLD, 14));
		north.add(title);
		this.add(north, BorderLayout.NORTH);

		// name panel
		JPanel name = new JPanel();
		JLabel lname = new JLabel("Name            ");
		name.add(lname);
		JTextArea tname = new JTextArea(2, 20);
		tname.setText("Name ");
		name.add(tname);

		// Dob
		JPanel dob = new JPanel();
		dob.add(new JLabel("Date of Birth"));
		JTextArea tdob = new JTextArea(2, 20);
		tdob.setText("MM/DD/YYYY");
		dob.add(tdob);

		// DI
		JPanel id = new JPanel();
		id.add(new JLabel("ID                   "));
		JTextArea tid = new JTextArea(2, 20);
		tid.setText("ID");
		id.add(tid);

		// Address
		JPanel address = new JPanel();
		address.add(new JLabel("Address       "));
		JTextArea taddress = new JTextArea(4, 20);
		taddress.setText("Address");
		address.add(taddress);

		// Postal code field
		JPanel postal = new JPanel();
		postal.add(new JLabel("Postal Code "));
		JTextArea tpostal = new JTextArea(2, 20);
		tpostal.setText("Postal Code");
		postal.add(tpostal);

		// Gender
		JPanel gender = new JPanel();
		gender.add(new JLabel("Gender                                         "));

		JRadioButton male = new JRadioButton("male");
		JRadioButton female = new JRadioButton("Female");
		ButtonGroup bG = new ButtonGroup();
		bG.add(male);
		bG.add(female);
		gender.add(male);
		gender.add(female);

		// Nationality
		String[] nations = { "Select Country", "Nepal", "Japan", "United State",
				"Australia                                              ", "Other   " };
		JComboBox<String> nation= new JComboBox<String>(nations);
		JPanel qualification = new JPanel();
		qualification.add(new JLabel("Nationality     "));
		qualification.add(nation);

		
		// Other Nationality
		JPanel other = new JPanel();
		other.add(new JLabel(" Other         "));
		other.setVisible(false);
		other.add(new JTextArea(1, 10));

		nation.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> box = (JComboBox<String>) e.getSource();
				String str = (String) box.getSelectedItem();
				if (str.equals("Other   ")) {
					other.setVisible(true);
				} else {
					other.setVisible(false);
				}
			}
		});

		
		
		// List of program
		JPanel program = new JPanel();
		program.add(new JLabel("List of Programs"));
		String[] programs = { "Select Program", "Management                                    ", "Computer Science",
				"Humanity" };
		JComboBox<String> com = new JComboBox<String>(programs);
		program.add(com);

		
		// List of Campus
		JPanel campus = new JPanel();
		campus.add(new JLabel("List of Programs"));
		String[] campuss = { "Select Campus", "Maharishi University                       ", "Standford University",
				"Varginia University","Kathmandu University" };
		JComboBox<String> campuslist = new JComboBox<String>(campuss);
		campus.add(campuslist);
		 
		
		// center
		JPanel center = new JPanel();
		center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
		center.add(name);
		center.add(dob);
		center.add(id);
		center.add(address);
		center.add(postal);
		center.add(gender);
		center.add(qualification);
		center.add(other);
		center.add(program);
		center.add(campus);

		this.add(center, BorderLayout.CENTER);


		// Control button - reset submit and close
		JPanel buttoms = new JPanel();
		
//		reset
		JButton reset = new JButton("Reset");
		reset.setActionCommand("reset");
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				tname.setText("");
				tid.setText("");
				taddress.setText("");
				tdob.setText("");
				bG.clearSelection();
				com.setSelectedItem("Select Program");
				nation.setSelectedItem("Select Country");
				campuslist.setSelectedItem("Select Campus");
				
			}
		});

		buttoms.add(reset);
		
//		Submit
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = "Incomplete ERROR ! \n";
				boolean flag = true;
				if (tname.getText().toString().equals("Name ")||tname.getText().toString().equals("")) {
					msg = msg + "Enter your Name.\n";
					tname.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					tname.setBorder(null);
				}
				if (tdob.getText().toString().equals("MM/DD/YYYY")||tdob.getText().toString().equals("")) {
					msg = msg + "Enter your Dob.\n";
					tdob.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					tdob.setBorder(null);
				}
				if (tid.getText().toString().equals("ID")||tid.getText().toString().equals("")) {
					msg = msg + "Enter your ID.\n";
					tid.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					tid.setBorder(null);
				}
				if (taddress.getText().toString().equals("Address")||taddress.getText().toString().equals("")) {
					msg = msg + "Enter your Address.\n";
					taddress.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					taddress.setBorder(null);
				}
				if (tpostal.getText().toString().equals("Postal Code")||tpostal.getText().toString().equals("")) {
					msg = msg + "Enter your Postal code.\n";
					tpostal.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					tpostal.setBorder(null);
				}

				if (bG.isSelected(null)) {
					msg = msg + "Select your gender.\n";
					flag = false;
				}
				if (nation.getSelectedIndex() != 1) {
					msg = msg + "Select your Nationality.\n";
					nation.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					tpostal.setBorder(null);
				}

				if (com.getSelectedIndex() != 1) {
					msg = msg + "Select your Program.\n";
					com.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					com.setBorder(null);
				}
				if (campuslist.getSelectedIndex() != 1) {
					msg = msg + "Select your Campus.\n";
					campuslist.setBorder(BorderFactory.createDashedBorder(Color.RED));
					flag = false;
				}else{
					campuslist.setBorder(null);
				}

				if (flag)
					JOptionPane.showMessageDialog(null, "Form Successfully submitted.");
				else
					JOptionPane.showMessageDialog(null, msg);
			}
		});
		buttoms.add(submit);
		
//		close 
		JButton close = new JButton("Close");
		close.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		buttoms.add(close);
		

		// south panel
		JPanel south = new JPanel();
		south.add(buttoms);
		this.add(south, BorderLayout.SOUTH);

	}

	private void initializationWindow() {
		this.setSize(450, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		centerFrameOnDesktop(this);
	}

	public static void centerFrameOnDesktop(Component f) {
		Toolkit toolkid = Toolkit.getDefaultToolkit();
		int height = toolkid.getScreenSize().height;
		int width = toolkid.getScreenSize().width;
		int frameHeight = f.getSize().height;
		int frameWight = f.getSize().width;
		f.setLocation(((width + frameWight) / 2), (height - frameWight) / 2);
	}

}

public class Question1 {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				JFrame frame = new GuiDev("Student Details");
				frame.setVisible(true);
			}
		});
	}

}
