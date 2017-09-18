package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;

public class TextFieldController  {
	
	@FXML
	private JFXTextField txtUname;
	@FXML
	private JFXTextField txtPassword;

	
	@FXML
 void btnClicked(ActionEvent event){
    RequiredFieldValidator validator = new RequiredFieldValidator();
    RequiredFieldValidator passv = new RequiredFieldValidator();
    NumberValidator nv = new NumberValidator();
		
		//txtUname.getValidators().add(validator);
		//validator.setMessage("No Input Provided");
		
		/*txtUname.focusedProperty().addListener(new ChangeListener<Boolean>(){
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue){
				
				if(! newValue){
					txtUname.validate();
				}
			}
		});*/
		
		txtUname.getValidators().add(validator);
		validator.setMessage("Please Enter User Name");
		txtUname.validate();
		txtUname.focusedProperty().addListener(new ChangeListener< Boolean>(){
			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				
				if(!newValue){
					txtUname.validate();
				}
				
			}
			
		});
		
		txtPassword.getValidators().add(passv);
		passv.setMessage("Please enter Password");
		txtPassword.validate();
		
		txtPassword.getValidators().add(nv);
		nv.setMessage("Please enter numeric value only");
		txtPassword.validate();
		
		
		
		/*txtPassword.focusedProperty().addListener(new ChangeListener< Boolean>(){

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				
				if(!newValue){
					txtPassword.validate();
				}
				
			}
			
		});*/
		
	}

}
