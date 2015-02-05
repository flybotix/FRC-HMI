package org.ilite.ui.y2015;
import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class UIBuilder
{
	public static void generateUI(Stage stage)
	{
		Scene scene=new Scene(new Group());
		stage.setTitle("Best UI Bulder EVAAAAAAAH");
		stage.setWidth(600);
		stage.setHeight(400);
		stage.setScene(scene);
		StackPane holder=buildWidgetHolder(stage.getWidth(), stage.getHeight(), new Text("Hi Michael"), new Text("Did you hear I started dating Alex?"), new ArrayList<Node>());
		((Group) (scene.getRoot())).getChildren().add(holder);
		stage.show();
	}
	
	public static StackPane buildWidgetHolder(double width, double height, Text title, Text description, List<Node> widgets)
	{
		StackPane panel=new StackPane();
		panel.setMinWidth(width);
		panel.setPrefWidth(width);
		panel.setMaxWidth(width);
		panel.setMinHeight(height);
		panel.setPrefHeight(height);
		panel.setMaxHeight(height);
		GridPane buttons=new GridPane();
		Button pin=new Button("", new ImageView(new Image("/org/ilite/ui/y2015/SideButtons/PinImage.png")));
		pin.setMinWidth(60);
		pin.setMinHeight(60);
		Button remove=new Button("", new ImageView(new Image("/org/ilite/ui/y2015/SideButtons/RemoveImage.png")));
		remove.setMinWidth(60);
		remove.setMinHeight(60);
		buttons.setMaxWidth(120);
		buttons.setMaxHeight(120);
		buttons.add(pin, 0, 0);
		buttons.add(remove, 1, 0);
		title.setFont(new Font(32));
		description.setFont(new Font(24));
		panel.getChildren().addAll(title, description, buttons);
		panel.setAlignment(title, Pos.TOP_LEFT);
		panel.setAlignment(buttons, Pos.TOP_RIGHT);
		panel.setAlignment(description, Pos.BOTTOM_LEFT);
		if(widgets.size()>0)
		{
			GridPane widget1=buildWidget(widgets.get(0));
			panel.getChildren().add(widget1);
			panel.setAlignment(widget1, Pos.CENTER_LEFT);
			
		}
		if(widgets.size()>1)
		{
			GridPane widget2=buildWidget(widgets.get(1));
			panel.getChildren().add(widget2);
			panel.setAlignment(widget2, Pos.CENTER);
		}
		if(widgets.size()>2)
		{
			GridPane widget3=buildWidget(widgets.get(2));
			panel.getChildren().add(widget3);
			panel.setAlignment(widget3, Pos.CENTER_RIGHT);
		}
		return panel;
	}
	
	public static GridPane buildWidget(Node widget)
	{
		GridPane selection=new GridPane();
		selection.add(widget, 0, 0);
		Button widgetPin=new Button("", new ImageView(new Image("/org/ilite/ui/y2015/SideButtons/WidgetPinImage.png")));
		widgetPin.setMinWidth(15);
		widgetPin.setMinHeight(15);
		selection.add(widgetPin, 1, 0);
		Button widgetRemove=new Button("", new ImageView(new Image("/org/ilite/ui/y2015/SideButtons/WidgetRemoveImage.png")));
		widgetRemove.setMinWidth(15);
		widgetRemove.setMinHeight(15);
		selection.add(widgetRemove, 1, 1);
		return selection;
	}
}
