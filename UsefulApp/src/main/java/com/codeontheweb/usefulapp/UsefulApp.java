package com.codeontheweb.usefulapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.Tab;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
//import javafx.scene.control.Spinner;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class UsefulApp extends Application
{
	TextField minRngTextField;
	TextField maxRngTextField;
	TextField countRngTextField;
	TextArea outputTextArea;

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		primaryStage.setTitle("Hello World");//Main title of the window

		//Set up the button
		Button helloWorldBtn = new Button();
		helloWorldBtn.setText("Say Hello World!");
		helloWorldBtn.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Hello World!");
			}
		});

		TabPane tabPane = new TabPane();
		Tab tab1 = new Tab();
		tab1.setText("new tab");
		tab1.setContent(new Rectangle(200,200, Color.LIGHTSTEELBLUE));
		tab1.setClosable(false);
		tabPane.getTabs().add(tab1);
		Tab tab2 = new Tab();
		tab2.setText("button tab");
		tab2.setContent(helloWorldBtn);
		tab2.setClosable(false);
		tabPane.getTabs().add(tab2);

		//Set up the random number generator tab
		Tab rngTab = new Tab();
		rngTab.setText("RNG Tab");

		//Set up the left part of the tab
		VBox rngLeftVbox = new VBox();
		rngLeftVbox.setPadding(new Insets(10));
		rngLeftVbox.setSpacing(8);
		//Set up the generate button
		Button generateRngBtn = new Button();
		generateRngBtn.setText("Generate");
		generateRngBtn.setOnAction(this::handleGenerateRng);
		rngLeftVbox.getChildren().add(generateRngBtn);

		//Set up the center part of the tab
		VBox rngCenterVbox = new VBox();
		rngCenterVbox.setPadding(new Insets(10));
		rngCenterVbox.setSpacing(8);
		//Set up the output text area
		outputTextArea = new TextArea();
		outputTextArea.setEditable(false);
		rngCenterVbox.getChildren().add(outputTextArea);

		//Set up the right part of the tab
		VBox rngRightVbox = new VBox();
		rngRightVbox.setPadding(new Insets(10));
		rngRightVbox.setSpacing(8);
		//Min value
		Label minRngLabel = new Label("Minimum value:");
		rngRightVbox.getChildren().add(minRngLabel);
		minRngTextField = new TextField("1");//Could probably use a JavaFx spinner once I upgrade my version of Java
		rngRightVbox.getChildren().add(minRngTextField);
		//Max value
		Label maxRngLabel = new Label("Maximum value:");
		rngRightVbox.getChildren().add(maxRngLabel);
		maxRngTextField = new TextField("100");//Could probably use a JavaFx spinner once I upgrade my version of Java
		rngRightVbox.getChildren().add(maxRngTextField);
		//Count value
		Label countRngLabel = new Label("Count:");
		rngRightVbox.getChildren().add(countRngLabel);
		countRngTextField = new TextField("10");//Could probably use a JavaFx spinner once I upgrade my version of Java
		rngRightVbox.getChildren().add(countRngTextField);

		//Set up a border layout for the tab
		BorderPane rngBorderLayout = new BorderPane();
		rngBorderLayout.setLeft(rngLeftVbox);
		rngBorderLayout.setCenter(rngCenterVbox);
		rngBorderLayout.setRight(rngRightVbox);

		//Finish setting up the random number generator tab
		rngTab.setContent(rngBorderLayout);
		rngTab.setClosable(false);
		tabPane.getTabs().add(rngTab);

		//Set up the window
		Scene scene = new Scene(tabPane, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String args[])
	{
		launch(args);
	}

	private void handleGenerateRng(ActionEvent event) {
		System.out.println( "Generating random numbers" );
		System.out.println( "Min: " + minRngTextField.getText() );
		System.out.println( "Max: " + maxRngTextField.getText() );
		System.out.println( "Count: " + countRngTextField.getText() );
		outputTextArea.setText("Testing");
	}
}
