package com.codeontheweb.usefulapp;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class UsefulApp extends Application
{
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		Group root = new Group();
		Scene scene = new Scene(root, 600, 300);
		primaryStage.setTitle("This is a test.");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String args[])
	{
		launch(args);
	}
}
