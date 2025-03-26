package loose.oose.fis.lab.student.manager;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}


@Override
public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("fxml/login.fxml"));
    primaryStage.setTitle("FIS - Student Manager");
    primaryStage.setScene(new Scene(root, 600, 400));
    primaryStage.show();
}
