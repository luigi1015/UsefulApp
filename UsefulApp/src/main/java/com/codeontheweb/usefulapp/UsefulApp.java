package com.codeontheweb.usefulapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;

public class UsefulApp extends Application
{
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

		//Set up the window
		StackPane root = new StackPane();
		root.getChildren().add(helloWorldBtn);
		Scene scene = new Scene(root, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String args[])
	{
		launch(args);
	}
}
