package garden_planner.gui;

import garden_planner.model.GardenPlanner;
import garden_planner.model.RectBed;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * Main class to launch the Garden Planner GUI.
 */
public class GuiMain extends Application {

    private GardenPlanner planner;

    public GuiMain() {
        // Initialize the GardenPlanner and create a default design
        planner = new GardenPlanner();
        planner.createBasicDesign(); // create the basic design with three rectangles
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Create a Pane as the root of the scene
        Pane root = new Pane();

        // Set the background color of the pane to green
        root.setStyle("-fx-background-color: #007700;");

        // Loop through all RectBed objects in the planner and create a rectangle for each
        for (RectBed bed : planner.getBeds()) {
            // Create a new Rectangle for each garden bed
            Rectangle rect = new Rectangle();
            rect.setWidth(bed.getWidth() * 100);  // Scale the width by 100 for visibility
            rect.setHeight(bed.getHeight() * 100); // Scale the height by 100 for visibility
            rect.setX(bed.getLeft() * 100);  // Scale and set the X position
            rect.setY(bed.getTop() * 100);   // Scale and set the Y position

            // Set a default color for the rectangle (optional: you can customize later)
            rect.setFill(Color.LIGHTGREEN);

            // Add the rectangle to the pane
            root.getChildren().add(rect);
        }

        // Create the scene with the larger size of 800x600 pixels
        Scene scene = new Scene(root, 800, 600);

        // Set the stage properties and show the stage
        primaryStage.setTitle("Garden Planner");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
