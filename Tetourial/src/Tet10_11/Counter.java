package Tet10_11;
import javax.swing.*;
import java.awt.*;

public class Counter extends JFrame {
	private JPanel pnl1 = new JPanel(new FlowLayout());
	private JLabel lbl = new JLabel("Counter");
	private JTextField txt = new JTextField("print the count",15);
	private JButton btn = new JButton("Count");
	
	public Counter() {
		
		pnl1.setLayout(new FlowLayout());
		pnl1.setLayout(new GridLayout(7,3,0,2));
		//pnl1.setLayout(new BorderLayout(0,0));
		pnl1.add(lbl); 
		pnl1.add(txt);
		pnl1.add(btn);
		
		add(pnl1);
		
		setTitle("Saleh Program");
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		Counter count = new Counter();

	}

}
