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
	private JButton quitButton;
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
		
		JLabel createLabel = new JLabel("Create Account", SwingConstants.CENTER);
		createLabel.setBounds(140, 10, 200, 35);
		createLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(createLabel);

		JLabel firstNameLabel = new JLabel("First Name", SwingConstants.RIGHT);
		firstNameLabel.setBounds(30, 50, 95, 35);
		firstNameLabel.setLabelFor(firstNameField);
		firstNameLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(firstNameLabel);
		firstNameField = new JTextField();
		firstNameField.setBounds(140, 50, 200, 35);
		this.add(firstNameField);
		
		JLabel lastNameLabel = new JLabel("Last Name", SwingConstants.RIGHT);
		lastNameLabel.setBounds(30, 90, 95, 35);
		lastNameLabel.setLabelFor(lastNameField);
		lastNameLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(lastNameLabel);
		lastNameField = new JTextField();
		lastNameField.setBounds(140, 90, 200, 35);
		this.add(lastNameField);
		
		JLabel bdayLabel = new JLabel("Birthday", SwingConstants.RIGHT);
		bdayLabel.setBounds(30, 130, 95, 35);
		bdayLabel.setLabelFor(lastNameField);
		bdayLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(bdayLabel);
		String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
		bdayBox = new JComboBox(days);
		bdayBox.setBounds(140, 130, 50, 35);
		this.add(bdayBox);
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		monthBox = new JComboBox(months);
		monthBox.setBounds(190, 130, 90, 35);
		this.add(monthBox);
		String[] years = {"2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930", "1929", "1928", "1927", "1926", "1925", "1924", "1923", "1922", "1921", "1920", "1919", "1918", "1917", "1916", "1915", "1914", "1913", "1912", "1911", "1910"};
		yearBox = new JComboBox(years);
		yearBox.setBounds(280, 130, 60, 35);
		this.add(yearBox);
		
		JLabel phoneLabel = new JLabel("Phone #", SwingConstants.RIGHT);
		phoneLabel.setBounds(30, 170, 95, 35);
		phoneLabel.setLabelFor(phoneField);
		phoneLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(phoneLabel);
		phoneField = new JTextField();
		phoneField.setBounds(140, 170, 200, 35);
		this.add(phoneField);
		
		JLabel addressLabel = new JLabel("Address", SwingConstants.RIGHT);
		addressLabel.setBounds(30, 210, 95, 35);
		addressLabel.setLabelFor(addressField);
		lastNameLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(addressLabel);
		addressField = new JTextField();
		addressField.setBounds(140, 210, 200, 35);
		this.add(addressField);
		
		cityField = new JTextField();
		JLabel cityLabel = new JLabel("City", SwingConstants.RIGHT);
		cityLabel.setLabelFor(cityField);
		lastNameLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		cityLabel.setBounds(30, 250, 95 ,35);
		cityField.setBounds(140, 250, 150, 35);
		this.add(cityLabel);
		this.add(cityField);
		String[] states = {"AL", "AK", "AZ", "AR", "CA", "CO", "CT", "DE", "DC", "FL", "GA", "HI", "ID", "IL", "IN", "IA", "KS", "KY", "LA", "ME", "MD", "MA", "MI", "MN", "MS", "MO", "MT", "NE", "NV", "NH", "NJ", "NM", "NY", "NC", "ND", "OH", "OK", "OR", "PA", "RI", "SC", "SD", "TN", "TX", "UT", "VT", "WA", "WV", "WI", "WY"};
		stateBox = new JComboBox(states);
		stateBox.setBounds(290, 250, 50, 34);
		this.add(stateBox);
		
		JLabel zipLabel = new JLabel("ZIP", SwingConstants.CENTER);
		zipLabel.setBounds(345, 250, 25, 35);
		zipLabel.setLabelFor(zipField);
		lastNameLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		this.add(addressLabel);
		zipField = new JTextField();
		zipField.setBounds(375, 250, 50, 35);
		this.add(zipLabel);
		this.add(zipField);
		
		JLabel pinLabel = new JLabel("PIN", SwingConstants.RIGHT);
		pinLabel.setBounds(30, 290, 95, 35);
		pinLabel.setLabelFor(pinField);
		pinLabel.setFont(new Font("DialogInput", Font.BOLD, 14));
		pinField = new JTextField();
		pinField.setBounds(140, 290, 200, 35);
		this.add(pinLabel); 
		this.add(pinField);
		
		submitButton = new JButton("Submit");
		submitButton.setFont(new Font("DialogInput", Font.BOLD, 14));
		submitButton.setBounds(30, 370, 200, 35);
		submitButton.addActionListener(this);
		this.add(submitButton);
		
		quitButton = new JButton("Quit");
		quitButton.setFont(new Font("DialogInput", Font.BOLD, 14));
		quitButton.setBounds(240, 370, 200, 35);
		quitButton.addActionListener(this);
		this.add(quitButton);
		
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
		
		Object source = e.getSource();
		if (source.equals(quitButton)) {
			manager.switchTo(ATM.LOGIN_VIEW);
		}
		if (source.equals(submitButton)) {
			manager.switchTo(ATM.HOME_VIEW);
		}
	}
}
