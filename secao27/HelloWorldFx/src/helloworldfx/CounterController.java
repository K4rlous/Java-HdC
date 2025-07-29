package helloworldfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CounterController {
    
    private CounterModel model;

    @FXML
    private Label countLabel;

    public CounterController() {
        model = new CounterModel();
    }

    @FXML
    private void handleIncrement() {
        model.increment();
        updateCountLabel();
    }

    @FXML
    private void handleDecrement() {
        model.decrement();
        updateCountLabel();
    }

    @FXML
    private void handleReset() {
        model.reset();
        updateCountLabel();
    }

    

    private void updateCountLabel() {
        countLabel.setText(Integer.toString(model.getCount()));
    }
}
