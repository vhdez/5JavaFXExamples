package org.sla;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class JavaFX_Example extends Application {
    // Fields for all of the UIElements
    Label someText;
    Label moreText;
    Button myFirstButton;
    int numberOfClicks;

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        numberOfClicks = 0;
        stage.setTitle("Hello class!");

        // 1. create UIElements
        myFirstButton = new Button("click me please!!!!");
        myFirstButton.setOnAction(actionEvent -> {
            userClickedTheButton();
        });
        someText = new Label("hi for real");
        moreText = new Label("he's still talking?");

        // 2. create Layout
        VBox myLayout = new VBox(myFirstButton, someText, moreText);
        //HBox myLayout = new HBox(myFirstButton, someText, moreText);

        // 3. create Scene
        Scene myScene = new Scene(myLayout);
        stage.setScene(myScene);

        // 4. Display scene
        stage.setWidth(400);
        stage.setHeight(100);
        stage.show();
    }

    public void userClickedTheButton() {
        numberOfClicks = numberOfClicks + 1;
        moreText.setText("he's finally done! " + numberOfClicks);
    }
}
