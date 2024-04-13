package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class HomePageController {

    @FXML
    private void openDefineNewCategoryPage(ActionEvent event) throws IOException {
        Parent defineNewCategoryPage = FXMLLoader.load(getClass().getResource("DefineNewCategory.fxml"));
        Scene defineNewCategoryScene = new Scene(defineNewCategoryPage, 600, 400);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(defineNewCategoryScene);
        window.show();
    }
}
