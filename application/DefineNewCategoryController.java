package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

import java.io.IOException;

public class DefineNewCategoryController {
    @FXML
    private TextField categoryNameField;
    
    @FXML Label errorLabel;
    
    @FXML
    private void resetErrorLabel() {
    	errorLabel.setVisible(false);
    }

    @FXML
    private void saveCategory() {
    	String input = categoryNameField.getText();
    	
    	// Strips whitespace from both ends of the string and sets errorLabel if input is only whitespace
        if (input.replaceAll("^[ \t]+|[ \t]+$", "").equals("")) {
        	errorLabel.setVisible(true);
        }
        else {
        	String categoryName = input;
        }
    }

    @FXML
    private void returnToHome(ActionEvent event) throws IOException {
        Parent homePage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene homeScene = new Scene(homePage);

        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(homeScene);
        window.show();
    }
}