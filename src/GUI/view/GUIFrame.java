package GUI.view;

import GUI.controller.*;
import javax.swing.JFrame;

public class GUIFrame extends JFrame {
	private GUIController appController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIController appController) {
		super();
		this.appController = appController;
		this.appPanel = new GUIPanel(appController);
		setupFrame();
		
	}
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setTitle("Title goes here");
		this.setSize(500, 500);
		this.setVisible(true);
	}
	public GUIController getBaseController() {
		// TODO Auto-generated method stub
		return appController;
	}
}
