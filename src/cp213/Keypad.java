package cp213;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Keypad extends JPanel{

	JButton btn[] = new JButton[18];
	String btnLabel[] = {"A", "B", "C", "D", "E", "F", "1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
	
	public Buttons cash1 = new Buttons("$3");
	public Buttons cash2 = new Buttons("$5");
	public Buttons cash3 = new Buttons("$10");
	public Buttons cancel = new Buttons("Cancel");
	private static JTextField txt;
	
	public static Product A1 = new Product("A1",5,3.00);
	public static Product A2 = new Product("A2",5,3.00);
	public static Product A3 = new Product("A3",5,3.00);
	public static Product A4 = new Product("A4",5,3.00);
	public static Product B1 = new Product("B1",5,3.00);
	public static Product B2 = new Product("B2",5,3.00);
	public static Product B3 = new Product("B3",5,3.00);
	public static Product B4 = new Product("B4",5,3.00);
	public static Product C1 = new Product("C1",5,3.00);
	public static Product C2 = new Product("C2",5,3.00);
	public static Product C3 = new Product("C3",5,3.00);
	public static Product C4 = new Product("C4",5,3.00);
	public static Product D1 = new Product("D1",5,3.00);
	public static Product D2 = new Product("D2",5,3.00);
	public static Product D3 = new Product("D3",5,3.00);
	public static Product D4 = new Product("D4",5,3.00);
	public static Product E1 = new Product("E1",5,3.00);
	public static Product E2 = new Product("E2",5,3.00);
	public static Product E3 = new Product("E3",5,3.00);
	public static Product E4 = new Product("E4",5,3.00);
	public static Product F1 = new Product("F1",5,3.00);
	public static Product F2 = new Product("F2",5,3.00);
	public static Product F3 = new Product("F3",5,3.00);
	public static Product F4 = new Product("F4",5,3.00);

	
	public static final Product[] codes = { A1, A2, A3, A4, B1, B2, B3, B4, C1, C2, C3, C4, D1,
			D2, D3, D4, E1, E2, E3, E4, F1, F2, F3, F4 }; 
	private static double total = 0;

	private static final String[] orders = new String[0];
	public Keypad(String name) {
		
		
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		JPanel pad = new JPanel();
		pad.setLayout(new GridLayout(6,3));
		

		for (int i=0; i<btn.length;i++) {
			
			btn[i] = new JButton(btnLabel[i]);
			pad.add(btn[i]);

			btn[i].addActionListener((ActionListener) new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub

					if (txt.getText().length() == 1) {
						
						txt.setText(txt.getText() + e.getActionCommand());
						String order = txt.getText();
						boolean contains = false;
						int count = 0;
						while(count<codes.length && contains == false) {
							String code = codes[count].getNum();
							if (txt.getText().compareTo(code) == 0) {
								
								if (codes[count].getStock() > 0) {
									double currPrice = (double) (total + codes[count].getPrice());
									total = total + currPrice;
									JOptionPane.showMessageDialog(null, "Your total is: $" + total + ". Choose one of the payment options, or add more items.");
									codes[count].updateStock();
									txt.setText("");
									contains = true;
								} else {
									JOptionPane.showMessageDialog(null, codes[count].num + " is out of stock.");
								}
								
							}
							count = count + 1;
						}
						if (!contains) {
							JOptionPane.showMessageDialog(null, order + " is an invalid selection");
							txt.setText("");
						}
						
					} else {
						txt.setText(e.getActionCommand());
					}
				}
				
			});
		}
	
		this.add(pad);
		txt = new JTextField(5);
		this.add(txt);
		this.add(cash1, BorderLayout.WEST);
		this.add(cash2, BorderLayout.WEST);
		this.add(cash3, BorderLayout.WEST);
		this.add(cancel, BorderLayout.EAST);
		
		cash1.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double payment = 3.0;
				double change = payment - total;
				if (payment >= total) {
					JOptionPane.showMessageDialog(null, "Your total is: $" + total + ". Your change is: $" + change);
					total = 0;
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient funds. Your total is: $" + total);
				}
			}
		});
		
		cash2.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double payment = 5.0;
				double change = payment - total;
				if (payment >= total) {
					JOptionPane.showMessageDialog(null, "Your total is: $" + total + ". Your change is: $" + change);
					total = 0;
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient funds. Your total is: $" + total);
				}
			}
		});
		
		cash3.addActionListener((ActionListener) new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				double payment = 10.0;
				double change = payment - total;
				if (payment >= total) {
					JOptionPane.showMessageDialog(null, "Your total is: $" + total + ". Your change is: $" + change);
					total = 0;
				} else {
					JOptionPane.showMessageDialog(null, "Insufficient funds. Your total is: $" + total);
				}

			}
		});
		
	}
	
}
