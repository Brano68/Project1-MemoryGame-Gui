package memorygame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CoreController extends IntroductionController {


    @FXML
    private ImageView idPic0;
    @FXML
    private ImageView idPic1;
    @FXML
    private Button idStartButton;
    @FXML
    private TextField idWhoGoes;
    @FXML
    private TextField idName1;
    @FXML
    private TextField idName2;
    @FXML
    private TextField idScore2;
    @FXML
    private TextField idScore1;

    //a method for initializing a game
    public void setTheGame(ActionEvent actionEvent) throws FileNotFoundException {
        idName1.setText(players[0].getName());
        idName2.setText(players[1].getName());
        idScore1.setText(String.valueOf(players[0].getScore()));
        idScore2.setText(String.valueOf(players[1].getScore()));
        idWhoGoes.setText(idName1.getText() + " it is your turn!!!");
        idStartButton.setVisible(false);

        //skusobne
        FileInputStream inputstream = new FileInputStream("src/memorygame/numberimages/number0.jpg");

        Image image = new Image(inputstream);
        idPic0.setImage(image);
        idPic0.setVisible(false);

        inputstream = new FileInputStream("src/memorygame/numberimages/number1.jpg");
        image = new Image(inputstream);
        idPic1.setImage(image);
        idPic1.setVisible(false);

    }




    public void click0(ActionEvent actionEvent) {
        //skusobne
        idPic0.setVisible(true);
    }

    public void click1(ActionEvent actionEvent) {
        //skusobne
        idPic1.setVisible(true);

        Timeline timeline = new Timeline(
                new KeyFrame(
                        Duration.seconds(1),
                        event -> {
                            idPic0.setVisible(false);
                            idPic1.setVisible(false);
                        }
                )
        );
        timeline.play();
    }

    public void click2(ActionEvent actionEvent) {
    }

    public void click3(ActionEvent actionEvent) {
    }

    public void click4(ActionEvent actionEvent) {
    }

    public void click5(ActionEvent actionEvent) {
    }

    public void click6(ActionEvent actionEvent) {
    }

    public void click7(ActionEvent actionEvent) {
    }

    public void click8(ActionEvent actionEvent) {
    }

    public void click9(ActionEvent actionEvent) {
    }

    public void click10(ActionEvent actionEvent) {
    }

    public void click11(ActionEvent actionEvent) {
    }

    public void click12(ActionEvent actionEvent) {
    }

    public void click13(ActionEvent actionEvent) {
    }

    public void click14(ActionEvent actionEvent) {
    }

    public void click15(ActionEvent actionEvent) {
    }

    public void click16(ActionEvent actionEvent) {
    }

    public void click17(ActionEvent actionEvent) {
    }

    public void click18(ActionEvent actionEvent) {
    }

    public void click19(ActionEvent actionEvent) {
    }

}
