package addcomponent;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {
    @FXML
    public TextArea textArea;

    @FXML
    public TextField textField;

    @FXML
    public void clickSend(ActionEvent actionEvent) {
        textArea.appendText(textField.getText() +"\n");
        textField.clear();
        textField.requestFocus();
    }

    @FXML
    public void closeWindow(ActionEvent actionEvent) {
        Platform.runLater(() -> {
            Stage stage = (Stage) textField.getScene().getWindow();
            stage.close();
        });
    }
}
