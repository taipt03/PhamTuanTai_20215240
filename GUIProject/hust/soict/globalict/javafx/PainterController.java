package hust.soict.globalict.javafx;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class PleaseProvideControllerClassName {
 
    @FXML
    private BorderPane drawingAreaP;

    @FXML
    private VBox drawingAreaPane;

    @FXML
    void drawingAreaMouseDragged(ActionEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void clearButtonPressed(ActionEvent event) {
    	drawingAreaPane.getChildren().clear();
    }
}