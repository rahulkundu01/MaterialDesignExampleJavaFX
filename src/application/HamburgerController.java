package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXRippler;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerBasicCloseTransition;
import com.jfoenix.transitions.hamburger.HamburgerNextArrowBasicTransition;
import com.jfoenix.transitions.hamburger.HamburgerSlideCloseTransition;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

public class HamburgerController implements Initializable {
	
	@FXML
    private AnchorPane basepane;
    @FXML
    private Pane pane;
	
    @FXML
    private JFXHamburger ham4;
    @FXML
    private JFXHamburger ham1;
    @FXML
    private JFXHamburger ham2;
    @FXML
    private JFXHamburger ham3;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		// First animation for Hamburger is HamburgerSlideCloseTransition
		HamburgerSlideCloseTransition transition1 = new HamburgerSlideCloseTransition(ham1);
		transition1.setRate(-1);  // There are two type of setRate(-1) & setRate(1)
		ham1.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			transition1.setRate(transition1.getRate()* -1);
			transition1.play();
			//  if we want to do any coding we can do it hear
			
			//
			
		});
		
		// Second animation for Hamburger is HamburgerBasicCloseTransition
		HamburgerBasicCloseTransition transition2 = new HamburgerBasicCloseTransition(ham2);
		transition2.setRate(-1);  // There are two type of setRate(-1) & setRate(1)
		ham2.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
			transition2.setRate(transition2.getRate()* -1);
			transition2.play();
		});
		
		// Third animation for Hamburger is HamburgerBackArrowBasicTransition
		HamburgerBackArrowBasicTransition transition3 = new HamburgerBackArrowBasicTransition(ham3);
		transition3.setRate(-1);  // There are two type of setRate(-1) & setRate(1)
		ham3.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
		transition3.setRate(transition3.getRate()* -1);
		transition3.play();
		});
				
		// Fourth animation for Hamburger is HamburgerNextArrowBasicTransition
		HamburgerNextArrowBasicTransition transition4 = new HamburgerNextArrowBasicTransition(ham4);
		transition4.setRate(-1);  // There are two type of setRate(-1) & setRate(1)
		ham4.addEventHandler(MouseEvent.MOUSE_CLICKED, (e)->{
		transition4.setRate(transition4.getRate()* -1);
		transition4.play();

		JFXRippler rippler = new JFXRippler(pane);   //Example to Add JFXRippler
		basepane.getChildren().add(rippler);
		});
		
		
		  
		
		
	}


}
