package com.tb.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JList;
import java.awt.SystemColor;
import javax.swing.AbstractListModel;
import javax.swing.JTabbedPane;
import javax.swing.JComboBox;
import javax.swing.JToggleButton;
import javax.swing.JSeparator;

public class ChatRoomUI {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChatRoomUI window = new ChatRoomUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ChatRoomUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 250);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(SystemColor.inactiveCaption);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		tabbedPane.setBounds(10, 102, 180, 126);
		panel.add(tabbedPane);
		
		JPanel pnlContacts = new JPanel();
		tabbedPane.addTab("Contacts", null, pnlContacts, null);
		pnlContacts.setLayout(null);
		
		JList list = new JList();
		list.setBounds(0, 5, 76, 93);
		pnlContacts.add(list);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Abhishek", "Raj ", "Rohit"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		JPanel pnlGroup = new JPanel();
		tabbedPane.addTab("Groups", null, pnlGroup, null);
		
		JList list_1 = new JList();
		list_1.setBounds(296, 180, 79, -94);
		panel.add(list_1);
		
		JList list_2 = new JList();
		list_2.setModel(new AbstractListModel() {
			String[] values = new String[] {"Contact", "PhoneNo"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list_2.setBounds(241, 180, 107, -135);
		panel.add(list_2);
	}
}
