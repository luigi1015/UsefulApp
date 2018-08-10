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

		TabPane tabPane = new TabPane();
		Tab tab1 = new Tab();
		tab1.setText("new tab");
		tab1.setContent(new Rectangle(200,200, Color.LIGHTSTEELBLUE));
		tabPane.getTabs().add(tab1);
		Tab tab2 = new Tab();
		tab2.setText("button tab");
		tab2.setContent(helloWorldBtn);
		tabPane.getTabs().add(tab2);

		//Set up the window
		Scene scene = new Scene(tabPane, 600, 300);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String args[])
	{
		launch(args);
	}
}
