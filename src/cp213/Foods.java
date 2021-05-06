package cp213;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


@SuppressWarnings("serial")
public class Foods extends JPanel{
	
	JLabel  A1 = new JLabel("A1");
	JLabel  A2 = new JLabel("A2");
	JLabel  A3 = new JLabel("A3");
	JLabel  A4 = new JLabel("A4");
	JLabel  B1 = new JLabel("B1");
	JLabel  B2 = new JLabel("B2");
	JLabel  B3 = new JLabel("B3");
	JLabel  B4 = new JLabel("B4");
	JLabel  C1 = new JLabel("C1");
	JLabel  C2 = new JLabel("C2");
	JLabel  C3 = new JLabel("C3");
	JLabel  C4 = new JLabel("C4");
	JLabel  D1 = new JLabel("D1");
	JLabel  D2 = new JLabel("D2");
	JLabel  D3 = new JLabel("D3");
	JLabel  D4 = new JLabel("D4");
	JLabel  E1 = new JLabel("E1");
	JLabel  E2 = new JLabel("E2");
	JLabel  E3 = new JLabel("E3");
	JLabel  E4 = new JLabel("E4");
	JLabel  F1 = new JLabel("F1");
	JLabel  F2 = new JLabel("F2");
	JLabel  F3 = new JLabel("F3");
	JLabel  F4 = new JLabel("F4");
	
	public Foods(String name) {
		this.setLayout(new GridLayout(5,6));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		JLabel a1img = new JLabel();
		a1img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel a2img = new JLabel();
		a2img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel a3img = new JLabel();
		a3img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel a4img = new JLabel();
		a4img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		Item a_row = new Item("a_row");

		Item a1 = new Item("a1");
		a1.add(a1img);
		//a1.setLayout(new BoxLayout(a1, BoxLayout.Y_AXIS));
		a1.add(A1);
		a1.setLayout(new BoxLayout(a1, BoxLayout.Y_AXIS));
		a_row.add(a1);
		
		Item a2 = new Item("a2");
		a2.add(a2img);
		a2.add(A2);
		a2.setLayout(new BoxLayout(a2, BoxLayout.Y_AXIS));
		a_row.add(a2);
		
		Item a3 = new Item("a3");
		a3.add(a3img);
		a3.add(A3);
		a3.setLayout(new BoxLayout(a3, BoxLayout.Y_AXIS));
		a_row.add(a3);
		
		Item a4 = new Item("a4");
		a4.add(a4img);
		a4.add(A4);
		a4.setLayout(new BoxLayout(a4, BoxLayout.Y_AXIS));
		a_row.add(a4);
		
		a_row.setLayout(new BoxLayout(a_row, BoxLayout.X_AXIS));
		this.add(a_row);
		
		
		//--- B ROW
		
		
		JLabel b1img = new JLabel();
		b1img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel b2img = new JLabel();
		b2img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel b3img = new JLabel();
		b3img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel b4img = new JLabel();
		b4img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		Item b_row = new Item("b_row");

		Item b1 = new Item("b1");
		b1.add(b1img);
		b1.add(B1);
		b1.setLayout(new BoxLayout(b1, BoxLayout.Y_AXIS));
		b_row.add(b1);
		
		Item b2 = new Item("b2");
		b2.add(b2img);
		b2.add(B2);
		b2.setLayout(new BoxLayout(b2, BoxLayout.Y_AXIS));
		b_row.add(b2);
		
		Item b3 = new Item("b3");
		b3.add(b3img);
		b3.add(B3);
		b3.setLayout(new BoxLayout(b3, BoxLayout.Y_AXIS));
		b_row.add(b3);
		
		Item b4 = new Item("b4");
		b4.add(b4img);
		b4.add(B4);
		b4.setLayout(new BoxLayout(b4, BoxLayout.Y_AXIS));
		b_row.add(b4);
		
		b_row.setLayout(new BoxLayout(b_row, BoxLayout.X_AXIS));
		this.add(b_row);
		
		
		//--- C ROW
		
		JLabel c1img = new JLabel();
		c1img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel c2img = new JLabel();
		c2img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel c3img = new JLabel();
		c3img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel c4img = new JLabel();
		c4img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		Item c_row = new Item("c_row");

		Item c1 = new Item("c1");
		c1.add(c1img);
		c1.add(C1);
		c1.setLayout(new BoxLayout(c1, BoxLayout.Y_AXIS));
		c_row.add(c1);
		
		Item c2 = new Item("c2");
		c2.add(c2img);
		c2.add(C2);
		c2.setLayout(new BoxLayout(c2, BoxLayout.Y_AXIS));
		c_row.add(c2);
		
		Item c3 = new Item("c3");
		c3.add(c3img);
		c3.add(C3);
		c3.setLayout(new BoxLayout(c3, BoxLayout.Y_AXIS));
		c_row.add(c3);
		
		Item c4 = new Item("c4");
		c4.add(c4img);
		c4.add(C4);
		c4.setLayout(new BoxLayout(c4, BoxLayout.Y_AXIS));
		c_row.add(c4);
		
		c_row.setLayout(new BoxLayout(c_row, BoxLayout.X_AXIS));
		this.add(c_row);
		
		
		//-- D ROW
		
		JLabel d1img = new JLabel();
		d1img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel d2img = new JLabel();
		d2img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel d3img = new JLabel();
		d3img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel d4img = new JLabel();
		d4img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		Item d_row = new Item("d_row");

		Item d1 = new Item("d1");
		d1.add(d1img);
		d1.add(D1);
		d1.setLayout(new BoxLayout(d1, BoxLayout.Y_AXIS));
		d_row.add(d1);
		
		Item d2 = new Item("d2");
		d2.add(d2img);
		d2.add(D2);
		d2.setLayout(new BoxLayout(d2, BoxLayout.Y_AXIS));
		d_row.add(d2);
		
		Item d3 = new Item("d3");
		d3.add(d3img);
		d3.add(D3);
		d3.setLayout(new BoxLayout(d3, BoxLayout.Y_AXIS));
		d_row.add(d3);
		
		Item d4 = new Item("d4");
		d4.add(d4img);
		d4.add(D4);
		d4.setLayout(new BoxLayout(d4, BoxLayout.Y_AXIS));
		d_row.add(d4);
		
		d_row.setLayout(new BoxLayout(d_row, BoxLayout.X_AXIS));
		this.add(d_row);
		

		//-- E ROW
		
		JLabel e1img = new JLabel();
		e1img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel e2img = new JLabel();
		e2img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel e3img = new JLabel();
		e3img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel e4img = new JLabel();
		e4img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		Item e_row = new Item("e_row");

		Item e1 = new Item("e1");
		e1.add(e1img);
		e1.add(E1);
		e1.setLayout(new BoxLayout(e1, BoxLayout.Y_AXIS));
		e_row.add(e1);
		
		Item e2 = new Item("e2");
		e2.add(e2img);
		e2.add(E2);
		e2.setLayout(new BoxLayout(e2, BoxLayout.Y_AXIS));
		e_row.add(e2);
		
		Item e3 = new Item("e3");
		e3.add(e3img);
		e3.add(E3);
		e3.setLayout(new BoxLayout(e3, BoxLayout.Y_AXIS));
		e_row.add(e3);
		
		Item e4 = new Item("e4");
		e4.add(e4img);
		e4.add(E4);
		e4.setLayout(new BoxLayout(e4, BoxLayout.Y_AXIS));
		e_row.add(e4);
		
		e_row.setLayout(new BoxLayout(e_row, BoxLayout.X_AXIS));
		this.add(e_row);
		
		

		//-- F ROW
		
		JLabel f1img = new JLabel();
		f1img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel f2img = new JLabel();
		f2img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel f3img = new JLabel();
		f3img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		JLabel f4img = new JLabel();
		f4img.setIcon(new ImageIcon(Lab_A05.class.getResource("/images/chocolate-bar-small.png")));
		
		Item f_row = new Item("f_row");

		Item f1 = new Item("f1");
		f1.add(f1img);
		f1.add(F1);
		f1.setLayout(new BoxLayout(f1, BoxLayout.Y_AXIS));
		f_row.add(f1);
		
		Item f2 = new Item("f2");
		f2.add(f2img);
		f2.add(F2);
		f2.setLayout(new BoxLayout(f2, BoxLayout.Y_AXIS));
		f_row.add(f2);
		
		Item f3 = new Item("f3");
		f3.add(f3img);
		f3.add(F3);
		f3.setLayout(new BoxLayout(f3, BoxLayout.Y_AXIS));
		f_row.add(f3);
		
		Item f4 = new Item("f4");
		f4.add(f4img);
		f4.add(F4);
		f4.setLayout(new BoxLayout(f4, BoxLayout.Y_AXIS));
		f_row.add(f4);
		
		f_row.setLayout(new BoxLayout(f_row, BoxLayout.X_AXIS));
		this.add(f_row);
		
		
	}
	
	
	
}
