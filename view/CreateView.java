package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.*;

import controller.ViewManager;

@SuppressWarnings("serial")
public class CreateView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton submitButton;
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JComboBox bdayBox;
	private JComboBox monthBox;
	private JComboBox yearBox;
	private JTextField phoneField;
	private JTextField addressField;
	private JComboBox stateBox;
	private JTextField cityField;
	private JTextField zipField;
	private JTextField pinField;
	
	
	/**
	 * Constructs an instance (or object) of the CreateView class.
	 * 
	 * @param manager
	 */
	
	public CreateView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the CreateView components.
	 */
	
	private void initialize() {
		
		this.setLayout(null);
		/*JLabel firstNameLabel = new JLabel("First Name", SwingConstants.RIGHT);
		firstNameLabel.setBounds(100, 140, 95, 35);
		firstNameLabel.setLabelFor(firstNameField);
		firstNameLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(firstNameLabel)*/
		firstNameField = new JTextField("First Name");
		firstNameField.setBounds(205, 180, 200, 35);
		this.add(firstNameField);
		
		/*JLabel lastNameLabel = new JLabel("Last Name", SwingConstants.RIGHT);
		lastNameLabel.setBounds(100, 140, 95, 35);
		lastNameLabel.setLabelFor(lastNameField);
		lastNameLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(lastNameLabel); */
		lastNameField = new JTextField("Last Name");
		lastNameField.setBounds(205, 150, 200, 35);
		this.add(lastNameField);
		
		/*JLabel bdayLabel = new JLabel("Birthday", SwingConstants.RIGHT);
		bdayLabel.setBounds(100, 140, 95, 35);
		bdayLabel.setLabelFor(lastNameField);
		bdayLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(bdayLabel); */
		String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		bdayBox = new JComboBox(days);
		bdayBox.setBounds(205, 180, 200, 35);
		this.add(bdayBox);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		monthBox = new JComboBox(months);
		monthBox.setBounds(205, 180, 200, 35);
		this.add(monthBox);
		
		/*JLabel phoneLabel = new JLabel("Phone Number", SwingConstants.RIGHT);
		phoneLabel.setBounds(100, 140, 95, 35);
		phoneLabel.setLabelFor(phoneField);
		phoneLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(phoneLabel); */
		phoneField = new JTextField("Phone #");
		phoneField.setBounds(205, 180, 200, 35);
		this.add(phoneField);
		
		/*JLabel addressLabel = new JLabel("Address");
		addressLabel.setBounds(100, 140, 95, 35);
		addressLabel.setLabelFor(addressField);
		this.add(addressLabel);*/
		addressField = new JTextField("Address");
		addressField.setBounds(205, 180, 200, 35);
		this.add(addressField);
		cityField = new JTextField("City");
		this.add(cityField);
		String[] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "WA", "WV", "WI", "WY"};
		stateBox = new JComboBox(states);
		this.add(stateBox);
		zipField = new JTextField("ZIP");
		this.add(zipField);
		
		/*JLabel pinLabel = new JLabel("PIN", SwingConstants.RIGHT);
		pinLabel.setBounds(100, 140, 95, 35);
		pinLabel.setLabelFor(pinField);
		pinLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(pinLabel); */
		pinField = new JTextField("PIN");
		pinField.setBounds(205, 180, 200, 35);
		this.add(pinField);
		
		submitButton = new JButton("Submit");
		submitButton.setBounds(205, 180, 200, 35);
		submitButton.addActionListener(this);
		this.add(submitButton);
	}
	
	/*
	 * CreateView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The CreateView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the CreateView.
	 * 
	 * @param e
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
}