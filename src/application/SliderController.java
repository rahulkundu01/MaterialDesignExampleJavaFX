package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXSlider;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.MapChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;

public class SliderController implements Initializable, ChangeListener {
	
	@FXML
    private JFXSlider red;
    @FXML
    private JFXSlider green;
    @FXML
    private JFXSlider blue;
    @FXML
    private AnchorPane background;

    
    
    

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		red.valueProperty().addListener(this);
		green.valueProperty().addListener(this);
		blue.valueProperty().addListener(this);
		
	}
	@Override
	public void changed(ObservableValue observable, Object oldValue, Object newValue) {
		// TODO Auto-generated method stub
		Double r = red.getValue();
	    Double g = green.getValue();
	    Double b = blue.getValue();
	    
	   Color color = Color.rgb(r.intValue(), g.intValue(), b.intValue());
	   System.out.println(color);
	   background.setBackground(new Background(new BackgroundFill(Paint.valueOf(color.toString()), null, null)));
		//background.getBackground().getFills();
	}


}
