package memorygame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CoreController extends IntroductionController {


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
    public void setTheGame(ActionEvent actionEvent) {
        idName1.setText(players[0].getName());
        idName2.setText(players[1].getName());
        idScore1.setText(String.valueOf(players[0].getScore()));
        idScore2.setText(String.valueOf(players[1].getScore()));
        idWhoGoes.setText(idName1.getText() + " it is your turn!!!");
        idStartButton.setVisible(false);
    }




    public void click0(ActionEvent actionEvent) {
    }

    public void click1(ActionEvent actionEvent) {
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
