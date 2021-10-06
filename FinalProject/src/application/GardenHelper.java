package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.stage.Stage;


public class GardenHelper extends Application {
	
	@Override 
	// Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Create user interface
		GridPane pane = new GridPane();
		pane.setVgap(5);
		pane.setHgap(5);
		pane.add(new Label("Vegetable name \n(Tomatoes, Beans, Potatoes, Zucchini, Asparagus)"), 0, 0);
		pane.add(tfvegetableName, 1, 0);
		
		pane.add(btCalcDays, 3, 1);
		pane.add(new Label("Days til harvest"), 0, 1);
		pane.add(tfharvestDay, 1, 1);
		pane.add(new Label("Ground Temp"), 0, 2);
		pane.add(tfgroundTemp, 1, 2);
		
		pane.add(btTemp, 3, 2);
		

		// Set user interface properties
		pane.setAlignment(Pos.CENTER);
		tfvegetableName.setAlignment(Pos.BOTTOM_RIGHT);
		tfharvestDay.setAlignment(Pos.BOTTOM_RIGHT);
		tfgroundTemp.setAlignment(Pos.BOTTOM_RIGHT);
		
		pane.setHalignment(btCalcDays, HPos.RIGHT);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHalignment(btTemp, HPos.RIGHT);
		pane.setPadding(new Insets(10, 10, 10, 10));
		

		// Process events
		btCalcDays.setOnAction(e -> harvestDay());
		btTemp.setOnAction(e -> groundTemp());

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		// Set the stage title
		primaryStage.setTitle("Gardening Helper"); 
		// Place the scene in the stage
		primaryStage.setScene(scene); 
		// Display the stage
		primaryStage.show(); 
	}

	private void groundTemp() {
		String vegetableName = tfvegetableName.getText();
		if (vegetableName.equalsIgnoreCase("Tomatoes")) {
			tfgroundTemp.setText("65 - 70");}
			else if (vegetableName.equalsIgnoreCase("Beans")) {
				tfgroundTemp.setText("80");}
				else if (vegetableName.equalsIgnoreCase("Potatoes")) {
					tfgroundTemp.setText("59 - 68");}
					else if (vegetableName.equalsIgnoreCase("Zucchini")) {
						tfgroundTemp.setText("65 - 70");}
						else if (vegetableName.equalsIgnoreCase("Asparagus")) {
							tfgroundTemp.setText("77 - 86");}
	}
	

	private void harvestDay() {
		String vegetableName = tfvegetableName.getText();
		if (vegetableName.equalsIgnoreCase("Tomatoes")) {
			tfharvestDay.setText("70 - 80");}
			else if (vegetableName.equalsIgnoreCase("Beans")) {
				tfharvestDay.setText("50 - 60");}
				else if (vegetableName.equalsIgnoreCase("Potatoes")) {
					tfharvestDay.setText("120");}
					else if (vegetableName.equalsIgnoreCase("Zucchini")) {
						tfharvestDay.setText("40 - 50");}
						else if (vegetableName.equalsIgnoreCase("Asparagus")) {
							tfharvestDay.setText("1 year, 7 days");}
	}
	
	private TextField tfvegetableName = new TextField();
	private TextField tfharvestDay = new TextField();
	private TextField tfgroundTemp = new TextField();
	private Button btCalcDays = new Button("Harvest days");
	private Button btTemp = new Button("Ground Temp");
	
	
	
public static void main(String[]args) {
		Application.launch(args);
	}	

}
