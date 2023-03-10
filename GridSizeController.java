package application;

import javafx.fxml.FXML;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;

public class GridSizeController {

    @FXML
    Pane pane;

    private int size = 200;
    private int spots = 100;
    private int squareSize = size / spots; 

    @FXML
    public void initialize() {
        for (int i = 0; i < size; i += squareSize) {
            for (int j = 0; j < size; j += squareSize) {
                Rectangle r = new Rectangle(i, j, squareSize, squareSize);
                r.setFill(Color.WHITE);
                r.setStroke(Color.BLACK);
                Line line1 = new Line(0,0,100,100);
                Line line2 = new Line(1,1,100,100);
                Line line3 = new Line(2,2,100,100);
                Line line4 = new Line(3,3,100,100);
                pane.getChildren().add(r);
                pane.getChildren().addAll(line1, line2, line3, line4);
               
            }
        }
    }
}