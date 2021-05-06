package cp213;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * Handles the GUI portion of the vending machine. May use other GUI classes for
 * individual elements of the vending machine. Should use the VendModel for all
 * control logic.
 *
 * @author your name here
 * @version 2021-03-19
 */
@SuppressWarnings("serial")
public class VendView extends JPanel {

    private VendModel model = null;
    
    static JButton msg;
	
	static JLabel l;
	
	private static JButton btn;

    public VendView(VendModel model) {
    	this.model = model;
    	// your code
    	
    	Foods vendFoods = new Foods("vendFoods");
    	add(vendFoods);
    	
    	Keypad vendPad = new Keypad("vendPad");
    	add(vendPad);

    }

}
