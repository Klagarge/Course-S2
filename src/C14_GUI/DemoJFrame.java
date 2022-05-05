package C14_GUI;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class DemoJFrame extends JFrame{
	DemoJFrame(){
		this.setTitle("Our first demo");

		// Creating components
		JLabel jl1 = new JLabel("A text");
		JButton jb1 = new JButton("Foo");
		JButton jb2 = new JButton("Bar");

		// Choosing a layout manager for the JFrame
		FlowLayout fl = new FlowLayout();
		this.setLayout(fl);

		// Creating the panels for putting the components on
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.BLUE);
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.GREEN);

		// Adding components to panels
		jp1.add(jl1);
		jp2.add(jb1);
		jp2.add(jb2);

		// Adding panels to JFrame
		this.add(jp1);
		this.add(jp2);

		this.setSize(300,300);
		this.setVisible(true);
	}
}
