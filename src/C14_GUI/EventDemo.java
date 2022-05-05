package C14_GUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class ButtonListener implements ActionListener{
	JLabel jl;
	int nClicks = 0;
	
	ButtonListener(JLabel jl){
		this.jl = jl;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		nClicks++;
		jl.setText("Button clicked " + nClicks + " times");
	}
}

public class EventDemo extends JFrame {
	EventDemo() {
		setSize(50, 100);
		setLocation(1500, 600);

		JLabel jl1 = new JLabel("Nothing...");
		JButton jb1 = new JButton("Click me");
		
		ButtonListener bl = new ButtonListener(jl1);
		jb1.addActionListener(bl);
		
//		jb1.addActionListener(new ButtonListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				jl1.setText("Button clicked !");
//			}
//		});
		
		this.setLayout(new FlowLayout());
		
		this.add(jb1);
		this.add(jl1);

		this.setVisible(true);
	}

	public static void main(String[] args) {
		EventDemo e = new EventDemo();
		
	}
}
