package GUI.view;

import javax.swing.*;
import GUI.controller.*;
import java.awt.Color;
import java.awt.event.*;

public class GUIPanel extends JPanel {
	private GUIController appController;
	private JButton firstButton;
	private SpringLayout appLayout;
	public GUIPanel(GUIController appController) {
		super();
		this.appController = appController;
		firstButton = new JButton("Click on the button");
		appLayout = new SpringLayout();
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	/**
	 * Used to add all components to the screen and install a layout manager.
	 * Also set color :D
	 */
	private void setupPanel() {
		this.setBackground(Color.CYAN);
		this.setLayout(appLayout);
		this.add(firstButton);
	}
	private void setupLayout() {
		
		appLayout.putConstraint(SpringLayout.NORTH, firstButton, 200, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, firstButton, 150, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, firstButton, 250, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.EAST, firstButton, 350, SpringLayout.WEST, this);
	}
	private void setupListeners() {
		firstButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent click) {
				
			}
		});
	}
}
