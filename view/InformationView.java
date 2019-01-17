package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ViewManager;

@SuppressWarnings("serial")
public class InformationView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton quitButton;
	private JButton editButton;
	private JLabel accountNumberLabel;
	private JLabel firstNameLabel;
	private JLabel lastNameLabel;
	private JLabel addressLabel;
	private JLabel zipLabel;
	private JLabel phoneLabel;
	private JLabel bdayLabel;
	
	
	
	/**
	 * Constructs an instance (or objects) of the HomeView class.
	 * 
	 * @param manager
	 */
	
	public InformationView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initButtons();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the HomeView components.
	 */
	
	public void initLabels() {
		
		this.setLayout(null);
		
		accountNumberLabel = new JLabel("Account Number: " + manager.getAcc().getAccountNumber());
		accountNumberLabel.setBounds(30, 50, 95, 35);
		this.add(accountNumberLabel);
		firstNameLabel = new JLabel("First Name: " + manager.getAcc().getUser().getFirstName());
		firstNameLabel.setBounds(30, 90, 95, 35);
		this.add(firstNameLabel);
		lastNameLabel = new JLabel("Last Name: " + manager.getAcc().getUser().getLastName());
		lastNameLabel.setBounds(30, 130, 95, 35);
		this.add(lastNameLabel);
		bdayLabel = new JLabel("Birthday: " + manager.getAcc().getUser().getFormattedDob());
		bdayLabel.setBounds(140, 170, 200, 35);
		this.add(bdayLabel);
		addressLabel = new JLabel("Address: " + manager.getAcc().getUser().getFormattedAddress());
		addressLabel.setBounds(140, 210, 200, 35);
		this.add(addressLabel);
		zipLabel = new JLabel("ZIP: " + manager.getAcc().getUser().getZip());
		zipLabel.setBounds(140, 250, 200, 35);
		this.add(zipLabel);
		phoneLabel = new JLabel("Phone #: " + manager.getAcc().getUser().getFormattedPhone());
		phoneLabel.setBounds(140, 290, 200, 35);
		this.add(phoneLabel);
	}
	
	private void initButtons() {
		
		editButton = new JButton("Edit");
		editButton.setBounds(140, 130, 200, 35);
		editButton.addActionListener(this);
		this.add(editButton);
		quitButton = new JButton("Quit");
		quitButton.setBounds(140, 130, 200, 35);
		quitButton.addActionListener(this);
		this.add(quitButton);
	}
	
	
	/*
	 * HomeView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The HomeView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the HomeView.
	 * 
	 * @param e
	 */
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		if (source.equals(editButton)) {
			manager.switchTo(ATM.EDIT_VIEW);
		}
		if (source.equals(quitButton)) {
			manager.switchTo(ATM.HOME_VIEW);
		}
	}
}
