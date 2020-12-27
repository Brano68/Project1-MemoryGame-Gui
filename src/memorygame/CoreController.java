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
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CoreController extends IntroductionController {



    @FXML
    private ImageView idPic0;
    @FXML
    private ImageView idPic1;
    @FXML
    private ImageView idPic2;
    @FXML
    private ImageView idPic3;
    @FXML
    private ImageView idPic4;
    @FXML
    private ImageView idPic5;
    @FXML
    private ImageView idPic6;
    @FXML
    private ImageView idPic7;
    @FXML
    private ImageView idPic8;
    @FXML
    private ImageView idPic9;
    @FXML
    private ImageView idPic10;
    @FXML
    private ImageView idPic11;
    @FXML
    private ImageView idPic12;
    @FXML
    private ImageView idPic13;
    @FXML
    private ImageView idPic14;
    @FXML
    private ImageView idPic15;
    @FXML
    private ImageView idPic16;
    @FXML
    private ImageView idPic17;
    @FXML
    private ImageView idPic18;
    @FXML
    private ImageView idPic19;


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

    //arrays for images
    private Image[] arrNumberImages = new Image[10];
    private Image[] arrNumberText = new Image[10];
    private Image[] arrMix = new Image[20];

    //a method for the filling arrays with the pictures
    private void fillArrays() throws FileNotFoundException {
        for(int i = 0; i < 10; i++){
            String path1 = "src/memorygame/numberimages/number" + i + ".jpg";
            String path2 = "src/memorygame/numbertext/text" + i + ".jpg";
            FileInputStream inputstream1 = new FileInputStream(path1);
            FileInputStream inputstream2 = new FileInputStream(path2);
            Image image1 = new Image(inputstream1);
            Image image2 = new Image(inputstream2);
            arrNumberImages[i] = image1;
            arrNumberText[i] = image2;
        }
    }

    //a method for generating numbers from 0 to 19
    private int[] generateNumbersFrom0to19(){
        int[] randomArray = new int[20];
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<randomArray.length; i++){
            for(;;){
                int num = new Random().nextInt(20);
                if(set.add(num)==true){ randomArray[i]=num; break; }
            }
        }

        return randomArray;
    }

    //a method for creating arrMix
    private void createMixArr(){
        int[] arrIndex = generateNumbersFrom0to19();
        for(int i=0; i<10; i++)
            arrMix[arrIndex[i]]=arrNumberText[i];
        for(int j=0; j<10; j++)
            arrMix[arrIndex[j+10]]=arrNumberImages[j];
    }

    //a method for putting the cards
    private void putThecards(){
        for(int i=0; i<arrMix.length; i++){

        }
    }


    //a method for an initializing game
    public void setTheGame(ActionEvent actionEvent) throws FileNotFoundException {
        idName1.setText(players[0].getName());
        idName2.setText(players[1].getName());
        idScore1.setText(String.valueOf(players[0].getScore()));
        idScore2.setText(String.valueOf(players[1].getScore()));
        idWhoGoes.setText(idName1.getText() + " it is your turn!!!");
        idStartButton.setVisible(false);
        //filling the arrays with the images
        fillArrays();
        //mixing the pictures
        createMixArr();
        //putting the cards
        putThecards();
    }




    public void click0(ActionEvent actionEvent) {
        //iba pre skusku
        idPic0.setVisible(true);
    }

    public void click1(ActionEvent actionEvent) {
        //iba pre skusku
        idPic1.setVisible(true);

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
