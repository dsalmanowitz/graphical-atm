package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import controller.ViewManager;

@SuppressWarnings("serial")
public class HomeView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JButton logoutButton;
	private JButton depositButton;
	private JButton withdrawButton;
	private JButton transferButton;
	
	/**
	 * Constructs an instance (or objects) of the HomeView class.
	 * 
	 * @param manager
	 */
	
	public HomeView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the HomeView components.
	 */
	
	private void initialize() {
		
		this.setLayout(null);
		
		/*this.add(new javax.swing.JLabel("Account Number: " + manager.getAcc().getAccountNumber(), javax.swing.SwingConstants.CENTER));
		this.add(new javax.swing.JLabel("First Name: " + manager.getAcc().getUser().getFirstName(), javax.swing.SwingConstants.CENTER));
		this.add(new javax.swing.JLabel("Last Name: " + manager.getAcc().getUser().getLastName(), javax.swing.SwingConstants.CENTER));
		this.add(new javax.swing.JLabel("Balance: " + manager.getAcc().getBalance(), javax.swing.SwingConstants.CENTER));
		*/
		depositButton = new JButton("Deposit");
		depositButton.setBounds(140, 50, 200, 35);
		depositButton.addActionListener(this);
		this.add(depositButton);
		withdrawButton = new JButton("Withdraw");
		withdrawButton.setBounds(140, 90, 200, 35);
		withdrawButton.addActionListener(this);
		this.add(withdrawButton);
		transferButton = new JButton("Transfer");
		transferButton.setBounds(140, 130, 200, 35);
		transferButton.addActionListener(this);
		this.add(transferButton);
		logoutButton = new JButton("Logout");
		logoutButton.setBounds(140, 170, 200, 35);
		logoutButton.addActionListener(this);
		this.add(logoutButton);
	}
	
	private void getInfo() {
		
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
		if (source.equals(logoutButton)) {
			manager.logout();
			manager.switchTo(ATM.LOGIN_VIEW);
		}
		if (source.equals(depositButton)) {
			manager.switchTo(ATM.DEPOSIT_VIEW);

		}
		if (source.equals(withdrawButton)) {
			manager.switchTo(ATM.WITHDRAW_VIEW);

		}
		if (source.equals(transferButton)) {
			manager.switchTo(ATM.TRANSFER_VIEW);

		}
	}
}
