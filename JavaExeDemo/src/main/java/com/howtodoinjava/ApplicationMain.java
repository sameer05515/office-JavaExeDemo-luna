package com.howtodoinjava;

import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDialog;

public class ApplicationMain extends JDialog 
{
	private static final long serialVersionUID = 1L;

	public ApplicationMain() 
	{
		//Create a frame
		Frame f = new Frame();
		f.setSize(500, 300);
		
		//Prepare font
		Font font = new Font( "SansSerif", Font.PLAIN, 22 );
		
		//Write something
		Label label = new Label("Launch4j Maven Demo with HowToDoInJava.com");
		label.setForeground(Color.RED);
		label.setFont(font);
		f.add(label);

		//Make visible
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}

	public static void main(final String[] args) 
	{
		new ApplicationMain();
	}

}