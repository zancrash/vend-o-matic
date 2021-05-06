package cp213;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public abstract class Lab_A05 extends JPanel implements ActionListener {
	
	static JFrame f;
	
	static JButton msg;
	
	static JLabel l;
	
	private static JButton btn;
	
	private static JTextField txt;
		
	public static void main(String[] args) {
		f = new JFrame("panel");
		JLabel ImageLabel = new JLabel();
		ImageLabel.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		JLabel TextLabel = new JLabel("Text here");
		txt = new JTextField(12);
		btn = new JButton("Show Message");
	
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String msg = txt.getText();
				JOptionPane.showMessageDialog(null, msg);
				txt.setText("");
			}
		});
		
		JButton one = new JButton("1");
		JButton two = new JButton("2");
		JButton three = new JButton("3");
		JButton four = new JButton("4");
		JButton five = new JButton("5");
		JButton six = new JButton("6");
		JButton seven = new JButton("7");
		JButton eight = new JButton("8");
		JButton nine = new JButton("9");

		
		JPanel p = new JPanel();
		p.add(ImageLabel);
		p.add(txt);
		p.add(btn);
		p.setSize(500, 150);
		JPanel numpad = new JPanel();
		
		numpad.add(one);
		numpad.add(two);
		numpad.add(three);
		numpad.add(four);
		numpad.add(five);
		numpad.add(six);
		numpad.add(seven);
		numpad.add(eight);
		numpad.add(nine);
		
		numpad.setSize(150, 150);
		
		f.add(p, BorderLayout.WEST);
		f.add(numpad);
		f.setSize(500, 300);
		f.setVisible(true);
		
	}

}
