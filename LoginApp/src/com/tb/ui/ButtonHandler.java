package com.tb.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonHandler implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("Action Occured");
		System.out.println("Button's Command is : " +e.getActionCommand());

	}
}
