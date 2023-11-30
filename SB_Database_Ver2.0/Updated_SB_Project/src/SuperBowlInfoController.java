import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class SuperBowlInfoController {

    @FXML
    private TextArea infoTextArea;

    public void initialize() {
        // Initialize and load Super Bowl information into the TextArea
        String superBowlInfo = "Super Bowl History:\n" +
                "...\n" +
                "Super Bowl Winners:\n" +
                "...\n" +
                "Super Bowl MVPs:\n" +
                "...";
        infoTextArea.setText(superBowlInfo);
    }
}
