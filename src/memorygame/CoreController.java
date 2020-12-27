package memorygame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
    private Button idBut0, idBut1, idBut2, idBut3, idBut4, idBut5, idBut6, idBut7, idBut8, idBut9,
            idBut10, idBut11, idBut12, idBut13, idBut14, idBut15, idBut16, idBut17, idBut18, idBut19;
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
    private void putTheCards(){
        idPic0.setImage(arrMix[0]); idPic0.setVisible(false);
        idPic1.setImage(arrMix[1]); idPic1.setVisible(false);
        idPic2.setImage(arrMix[2]); idPic2.setVisible(false);
        idPic3.setImage(arrMix[3]); idPic3.setVisible(false);
        idPic4.setImage(arrMix[4]); idPic4.setVisible(false);
        idPic5.setImage(arrMix[5]); idPic5.setVisible(false);
        idPic6.setImage(arrMix[6]); idPic6.setVisible(false);
        idPic7.setImage(arrMix[7]); idPic7.setVisible(false);
        idPic8.setImage(arrMix[8]); idPic8.setVisible(false);
        idPic9.setImage(arrMix[9]); idPic9.setVisible(false);
        idPic10.setImage(arrMix[10]); idPic10.setVisible(false);
        idPic11.setImage(arrMix[11]); idPic11.setVisible(false);
        idPic12.setImage(arrMix[12]); idPic12.setVisible(false);
        idPic13.setImage(arrMix[13]); idPic13.setVisible(false);
        idPic14.setImage(arrMix[14]); idPic14.setVisible(false);
        idPic15.setImage(arrMix[15]); idPic15.setVisible(false);
        idPic16.setImage(arrMix[16]); idPic16.setVisible(false);
        idPic17.setImage(arrMix[17]); idPic17.setVisible(false);
        idPic18.setImage(arrMix[18]); idPic18.setVisible(false);
        idPic19.setImage(arrMix[19]); idPic19.setVisible(false);
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
        putTheCards();
    }




    public void click0(ActionEvent actionEvent) {
        //iba pre skusku
        idPic0.setVisible(true);
        idBut0.setVisible(false);
    }

    public void click1(ActionEvent actionEvent) {
        //iba pre skusku
        idPic1.setVisible(true);
        idBut1.setVisible(false);

    }

    public void click2(ActionEvent actionEvent) {
        idPic2.setVisible(true);
        idBut2.setVisible(false);
    }

    public void click3(ActionEvent actionEvent) {
        idPic3.setVisible(true);
        idBut3.setVisible(false);
    }

    public void click4(ActionEvent actionEvent) {
        idPic4.setVisible(true);
        idBut4.setVisible(false);
    }

    public void click5(ActionEvent actionEvent) {
        idPic5.setVisible(true);
        idBut5.setVisible(false);
    }

    public void click6(ActionEvent actionEvent) {
        idPic6.setVisible(true);
        idBut6.setVisible(false);
    }

    public void click7(ActionEvent actionEvent) {
        idPic7.setVisible(true);
        idBut7.setVisible(false);
    }

    public void click8(ActionEvent actionEvent) {
        idPic8.setVisible(true);
        idBut8.setVisible(false);
    }

    public void click9(ActionEvent actionEvent) {
        idPic9.setVisible(true);
        idBut9.setVisible(false);
    }

    public void click10(ActionEvent actionEvent) {
        idPic10.setVisible(true);
        idBut10.setVisible(false);
    }

    public void click11(ActionEvent actionEvent) {
        idPic11.setVisible(true);
        idBut11.setVisible(false);
    }

    public void click12(ActionEvent actionEvent) {
        idPic12.setVisible(true);
        idBut12.setVisible(false);
    }

    public void click13(ActionEvent actionEvent) {
        idPic13.setVisible(true);
        idBut13.setVisible(false);
    }

    public void click14(ActionEvent actionEvent) {
        idPic14.setVisible(true);
        idBut14.setVisible(false);
    }

    public void click15(ActionEvent actionEvent) {
        idPic15.setVisible(true);
        idBut15.setVisible(false);
    }

    public void click16(ActionEvent actionEvent) {
        idPic16.setVisible(true);
        idBut16.setVisible(false);
    }

    public void click17(ActionEvent actionEvent) {
        idPic17.setVisible(true);
        idBut17.setVisible(false);
    }

    public void click18(ActionEvent actionEvent) {
        idPic18.setVisible(true);
        idBut18.setVisible(false);
    }

    public void click19(ActionEvent actionEvent) {
        idPic19.setVisible(true);
        idBut19.setVisible(false);
    }

}
