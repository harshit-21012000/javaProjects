package application;
 
import javax.swing.*;

import javafx.application.Platform;
import javafx.embed.swing.JFXPanel;
import javafx.embed.swing.JFXPanel.*;
import javafx.scene.Scene;
import javafx.scene.web.WebView;


public  class WebBrowser extends JFrame implements Runnable {
	
	private JFXPanel panel;
	
	public void run(){
		setBounds(0, 0, 1950, 1050);
		setVisible(true);
		
		panel = new JFXPanel();
		add(panel);

		//to create the web engine we use web view which is a part of javafx class and it automatically genrates and creates web engines
		//and display its contents. We can not change the content of the web page. and it automatically adds scroll bar
		
		
		Platform.runLater(() -> {
		
		WebView view = new WebView();
		view.getEngine().load("http://www.google.com");
		
		panel.setScene(new Scene(view));
	
	
		});
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SwingUtilities.invokeLater(new WebBrowser());	
		

	}

}
