package com.tb.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SummaryConverter {

	private JFrame frame;
	JLabel lblFpath;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SummaryConverter window = new SummaryConverter();
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
	public SummaryConverter() {
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
		
		JButton btnOpenFile = new JButton("Open File");
		btnOpenFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fileChoser = new JFileChooser();
				int res = fileChoser.showDialog(btnOpenFile, "Select The File");
				System.out.println(res);
				if (res == 0)
				{
					lblFpath.setText(fileChoser.getSelectedFile().getPath());
				}
			}
		});
		btnOpenFile.setBounds(335, 36, 89, 23);
		frame.getContentPane().add(btnOpenFile);
		
		lblFpath = new JLabel("New label");
		lblFpath.setBounds(29, 40, 296, 14);
		frame.getContentPane().add(lblFpath);
	}
}
