package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import Model.*;

public class RestoController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Bonchon bonchon = new Bonchon();
    Botejyu botejyu = new Botejyu();
    Jabee jabee = new Jabee();
    Mcdo mcdo = new Mcdo();
    Popeyes popeyes = new Popeyes();
    
    public void initialize() {

        bonchon.setPrice("Affordable");
        bonchon.setTaste("Delicious");

        botejyu.setPrice("Expensive");
        botejyu.setTaste("Something of a kind");

        jabee.setPrice("Budget Friendly");
        jabee.setTaste("Splendid");
        
        mcdo.setPrice("Affordable");
        mcdo.setTaste("Tasty");

        popeyes.setPrice("Not Affordable");
        popeyes.setTaste("Juicy");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Price:  " + bonchon.getPrice() + " Taste: " + bonchon.getTaste());
        }

        if (sourceButton.equals (btn2)) {
            alert.setContentText("Price: " +botejyu.getPrice() + " Taste: " + botejyu.getTaste());
        }
        if (sourceButton.equals (btn3)) {
            alert.setContentText("Price: " + jabee.getPrice() + " Taste: " + jabee.getTaste());
        }
        if (sourceButton.equals (btn4)) {
            alert.setContentText("Price: " + mcdo.getPrice() + " Taste: " + mcdo.getTaste());
        }
        if (sourceButton.equals (btn5)) {
            alert.setContentText("Price: " + popeyes.getPrice() + " Taste: " + popeyes.getTaste());
        }

        alert.showAndWait();

    }
}
