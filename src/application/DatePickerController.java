package application;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXColorPicker;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class DatePickerController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private JFXColorPicker cpSelect;
    @FXML
    private JFXCheckBox flag_cb;

    @FXML
    private AnchorPane pane;

    @FXML
    void changeColor(ActionEvent event) {
    	
    	if(flag_cb.isSelected()){
    	
    	Color selectdcolor = cpSelect.getValue();
    	pane.setBackground(new Background(new BackgroundFill(Paint.valueOf(selectdcolor.toString()), null, null)));
    		//Paint.valueOf(selectdcolor.toString()), null, null)
    }
    	}

    

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		cpSelect.setValue(Color.BLUE);
	}
}