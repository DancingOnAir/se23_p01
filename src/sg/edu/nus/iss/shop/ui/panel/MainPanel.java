package sg.edu.nus.iss.shop.ui.panel;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import sg.edu.nus.iss.shop.ui.ShopApplication;

public class MainPanel extends JPanel {
	private ShopApplication shopApplication;

	public MainPanel(ShopApplication shopApplication) {
		this.shopApplication = shopApplication;
		setLayout(new BorderLayout());
		JLabel mainLebel = new JLabel("Souvenir Shop");
		mainLebel.setHorizontalAlignment(SwingConstants.CENTER);
		add("North", mainLebel);
		add("Center", createOptionsPanel());
	}

	private JPanel createOptionsPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2));



		panel.add(new JButton("Checkout "));
		panel.add(new JButton("New Member"));
		panel.add(new JButton("New Product"));
		panel.add(new JButton("New Category"));
		panel.add(new JButton("Check Inventory"));
		panel.add(new JButton("Reporting"));
		return panel;
	}

}