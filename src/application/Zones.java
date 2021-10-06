package application;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.Image ;
import javafx.scene.image.ImageView;


public class Zones extends Application {
	
	
	
	@Override 
	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create user interface
		// Place nodes in the pane
		
		GridPane pane = new GridPane();
		pane.add(new ImageView(new Image("growzonemap.jpg")), 0, 0);
		pane.setVgap(5);
		pane.setHgap(5);
		pane.add(new Label("Enter your grow zone: "), 1, 0);
		pane.add(tfgrowZone, 2, 0);
		pane.add(new Label("Your growing season is: "), 1, 2);
		pane.add(tfgrowSeason, 2, 2);
		
		pane.add(btSeason, 1, 1);
		

		// Set user interface properties
		pane.setAlignment(Pos.CENTER);
		tfgrowZone.setAlignment(Pos.BOTTOM_RIGHT);
		tfgrowSeason.setAlignment(Pos.BOTTOM_RIGHT);
		
		
		pane.setHalignment(btSeason, HPos.RIGHT);
		pane.setPadding(new Insets(10, 10, 10, 10));
		

		// Process events
		btSeason.setOnAction(e -> growSeason());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		// Set the stage title
		primaryStage.setTitle("Grow Zones"); 
		// Place the scene in the stage
		primaryStage.setScene(scene); 
		// Display the stage
		primaryStage.show(); 
	}
	
	private TextField tfgrowZone = new TextField();
	public static TextField tfgrowSeason = new TextField();
	private Button btSeason = new Button("Find my grow season");
	
	
	
	public static void main(String[]args) {
		Application.launch(args);
	}	
	
	public void growSeason() {
		
		String growZone = tfgrowZone.getText();
				
		if (growZone.equals("1") ||
			growZone.equals("2") ||
			growZone.equals("8")) {
			tfgrowSeason.setText("All year round!");
			tfgrowSeason.setEditable(false);
			}
		else if (growZone.equals("3")) {
			tfgrowSeason.setText("February - November");
			tfgrowSeason.setEditable(false);
			}
		else if (growZone.equals("4")) {
			tfgrowSeason.setText("March - November");
			tfgrowSeason.setEditable(false);
			}
		else if (growZone.equals("5")) {
			tfgrowSeason.setText("March - October");
			tfgrowSeason.setEditable(false);
			}
		else if (growZone.equals("6")) {
			tfgrowSeason.setText("April - October");
			tfgrowSeason.setEditable(false);
			}		
		else if (growZone.equals("7")) {
			tfgrowSeason.setText("April - September");
			tfgrowSeason.setEditable(false);
			}		
		
		
	}
}
