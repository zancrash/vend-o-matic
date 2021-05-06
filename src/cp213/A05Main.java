package cp213;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

/**
 * Main class for the Vending Machine.
 *
 * @author your name here
 * @version 2021-03-19
 */
public class A05Main {

    public static void main(String[] args) {
	VendModel model = new VendModel();
	VendView vv = new VendView(model);
	final JFrame frame = new JFrame();
	frame.setContentPane(vv);
	frame.setMinimumSize(new Dimension(800, 500));
	//frame.setSize(300, 300);
	frame.pack();
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setVisible(true);
    }

}