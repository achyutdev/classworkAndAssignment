package question1;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

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

		// initialization
		initializationWindow();
		AddCompanent();
	}

	private void AddCompanent() {

		// north panel
		JPanel north = new JPanel();
		north.add(new JLabel("Student Details"));
		this.add(north, BorderLayout.NORTH);

		// name panel
		JPanel name = new JPanel();
		name.add(new JLabel("Name          "));
		JTextArea tname = new JTextArea(2, 20);
		name.add(tname);

		// Dob
		JPanel dob = new JPanel();
		dob.add(new JLabel("Date of Birth"));
		JTextArea tdob = new JTextArea(2, 20);
		dob.add(tdob);
		
		
		Calendar selectedValue = (Calendar) datePicker.getModel().getValue();
		Date selectedDate = selectedValue.getTime();

		// DI
		JPanel id = new JPanel();
		id.add(new JLabel("ID                   "));
		JTextArea tid = new JTextArea(2, 20);
		id.add(tid);

		// Address
		JPanel address = new JPanel();
		address.add(new JLabel("Address       "));
		JTextArea taddress = new JTextArea(2, 20);
		address.add(taddress);

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

		JRadioButton mradio = new JRadioButton("Male");
		mradio.setSelected(true);
		JRadioButton fradio = new JRadioButton("Female");
		ButtonGroup grp = new ButtonGroup();
		grp.add(mradio);
		grp.add(fradio);

		JComboBox<String> quali = new JComboBox<String>();
		quali.addItem("Select Qualification");
		quali.addItem(" BSc                                                     ");
		quali.addItem("BBS   ");
		quali.addItem("MSCS  ");
		quali.addItem("MBBS  ");
		quali.addItem("MAC   ");
		quali.addItem("Other   ");
		quali.setSize(20, 4);
		quali.setMaximumSize(quali.getPreferredSize());

		// Other
		JPanel other = new JPanel();
		other.add(new JLabel("Other       "));
		other.setVisible(false);
		other.add(new JTextArea(2, 20));

		quali.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> box = (JComboBox<String>) e.getSource();
				String str = (String) box.getSelectedItem();
				// System.out.println(str);
				if (str.equals("Other   ")) {
					other.setVisible(true);
				} else {
					other.setVisible(false);
				}
			}
		});

		// Qualification
		JPanel qualification = new JPanel();
		qualification.add(new JLabel("Qualification "));
		qualification.add(quali);

		// program
		JPanel program = new JPanel();
		program.add(new JLabel("Program     "));
		String[] programs = { "Select Program", "Management                                       ", "Computer Science",
				"Humanity" };
		JComboBox<String> com = new JComboBox<String>(programs);
		program.add(com);

		// center
		JPanel center = new JPanel();
		center.setLayout(new BoxLayout(center, BoxLayout.Y_AXIS));
		center.add(name);
		center.add(dob);
		center.add(id);
		center.add(address);
		center.add(gender);
		center.add(qualification);
		center.add(other);
		center.add(program);

		this.add(center, BorderLayout.CENTER);

		// last reset and submit
		// Bottom
		JPanel buttoms = new JPanel();
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
				quali.setSelectedItem("Select Qualification");
			}
		});

		buttoms.add(reset);
		JButton submit = new JButton("Submit");
		submit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = "Incomplete ERROR ! \n";
				boolean flag = true;
				if (tname.getText().toString().equals("")) {
					msg = msg + "Wright you Name.\n";
					flag = false;
				}
				if (tdob.getText().toString().equals("")) {
					msg = msg + "Wright you Dob.\n";
					flag = false;
				}
				if (tid.getText().toString().equals("")) {
					msg = msg + "Wright you ID.\n";
					flag = false;
				}
				if (taddress.getText().toString().equals("")) {
					msg = msg + "Wright you Address.\n";
					flag = false;
				}
				
				if (bG.isSelected(null)) {
					msg = msg + "Select your gender.\n";
					flag = false;
				}
				if (quali.getSelectedIndex()!=1) {
					msg = msg + "Select your Qualification.\n";
					flag = false;
				}
				
				if (com.getSelectedIndex()!=1) {
					msg = msg + "Select your Program.\n";
					flag = false;
				}

				if (flag)
					JOptionPane.showMessageDialog(null, "Form Successfully submitted.");
				else
					JOptionPane.showMessageDialog(null, msg);
			}
		});
		buttoms.add(submit);

		// south panel
		JPanel south = new JPanel();
		south.add(buttoms);
		this.add(south, BorderLayout.SOUTH);

	}

	private void initializationWindow() {
		this.setSize(500, 450);
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
