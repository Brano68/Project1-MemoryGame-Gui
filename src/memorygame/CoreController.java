package memorygame;

import javafx.animation.KeyFrame;
import javafx.animation.PauseTransition;
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
import java.util.ArrayList;
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

    //according this you can find out which card is turned
    private int seenCards = 0;
    private int id0, id1, id2, id3, id4, id5, id6, id7, id8, id9, id10, id11, id12,
            id13, id14, id15, id16, id17, id18, id19 = 0;

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
        idWhoGoes.setText("1Player: " + idName1.getText() + " it is your turn!!!");
        idStartButton.setVisible(false);

        //filling the arrays with the images
        fillArrays();
        //mixing pictures for example 1 with pictures one...
        createMixArr();
        //putting the cards
        putTheCards();
    }


    //a clicking method what happened if you press the button
    public void click0(ActionEvent actionEvent) {
        //if the seenCards are less then two
        if(seenCards<2){
            //incremet seenCards and id0
            seenCards++;
            id0++;
            //set a picture0
            idPic0.setVisible(true);
            //compare with another card
            compareTheCards();
        }
    }

    public void click1(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id1++;
            idPic1.setVisible(true);
            compareTheCards();
        }
    }

    public void click2(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id2++;
            idPic2.setVisible(true);
            compareTheCards();
        }
    }

    public void click3(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id3++;
            idPic3.setVisible(true);
            compareTheCards();
        }
    }

    public void click4(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id4++;
            idPic4.setVisible(true);
            compareTheCards();
        }
    }

    public void click5(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id5++;
            idPic5.setVisible(true);
            compareTheCards();
        }
    }

    public void click6(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id6++;
            idPic6.setVisible(true);
            compareTheCards();
        }
    }

    public void click7(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id7++;
            idPic7.setVisible(true);
            compareTheCards();
        }
    }

    public void click8(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id8++;
            idPic8.setVisible(true);
            compareTheCards();
        }
    }

    public void click9(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id9++;
            idPic9.setVisible(true);
            compareTheCards();
        }
    }

    public void click10(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id10++;
            idPic10.setVisible(true);
            compareTheCards();
        }
    }

    public void click11(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id11++;
            idPic11.setVisible(true);
            compareTheCards();
        }
    }

    public void click12(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id12++;
            idPic12.setVisible(true);
            compareTheCards();
        }
    }

    public void click13(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id13++;
            idPic13.setVisible(true);
            compareTheCards();
        }
    }

    public void click14(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id14++;
            idPic14.setVisible(true);
            compareTheCards();
        }
    }

    public void click15(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id15++;
            idPic15.setVisible(true);
            compareTheCards();
        }
    }

    public void click16(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id16++;
            idPic16.setVisible(true);
            compareTheCards();
        }
    }

    public void click17(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id17++;
            idPic17.setVisible(true);
            compareTheCards();
        }
    }

    public void click18(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id18++;
            idPic18.setVisible(true);
            compareTheCards();
        }
    }

    public void click19(ActionEvent actionEvent) {
        if(seenCards<2){
            seenCards++;
            id19++;
            idPic19.setVisible(true);
            compareTheCards();
        }
    }


    //a method for comparing the cards
    private void compareTheCards() {
        if (seenCards == 2) {
            ArrayList<Image> array = new ArrayList<>();
            if (id0 == 1) {
                array.add(idPic0.getImage());
            }
            if (id1 == 1) {
                array.add(idPic1.getImage());
            }
            if (id2 == 1) {
                array.add(idPic2.getImage());
            }
            if (id3 == 1) {
                array.add(idPic3.getImage());
            }
            if (id4 == 1) {
                array.add(idPic4.getImage());
            }
            if (id5 == 1) {
                array.add(idPic5.getImage());
            }
            if (id6 == 1) {
                array.add(idPic6.getImage());
            }
            if (id7 == 1) {
                array.add(idPic7.getImage());
            }
            if (id8 == 1) {
                array.add(idPic8.getImage());
            }
            if (id9 == 1) {
                array.add(idPic9.getImage());
            }
            if (id10 == 1) {
                array.add(idPic10.getImage());
            }
            if (id11 == 1) {
                array.add(idPic11.getImage());
            }
            if (id12 == 1) {
                array.add(idPic12.getImage());
            }
            if (id13 == 1) {
                array.add(idPic13.getImage());
            }
            if (id14 == 1) {
                array.add(idPic14.getImage());
            }
            if (id15 == 1) {
                array.add(idPic15.getImage());
            }
            if (id16 == 1) {
                array.add(idPic16.getImage());
            }
            if (id17 == 1) {
                array.add(idPic17.getImage());
            }
            if (id18 == 1) {
                array.add(idPic18.getImage());
            }
            if (id19 == 1) {
                array.add(idPic19.getImage());
            }
            //check if the player was right
            boolean result = findOutIndexes(array);
            //turning the cards
            if(result == false){
                PauseTransition pause = new PauseTransition(Duration.seconds(1.2));
                pause.setOnFinished(event -> turnTheCardsBack(array));
                pause.play();
                String string = idWhoGoes.getText();
                if(string.charAt(0) == '1'){
                    idWhoGoes.setText("2Player: " + idName2.getText() + " it is your turn!!!");
                }else {
                    idWhoGoes.setText("1Player: " + idName1.getText() + " it is your turn!!!");
                }
            }else {
                String string = idWhoGoes.getText();
                if(string.charAt(0) == '1'){
                    players[0].setScore(2);
                    idScore1.setText(String.valueOf(players[0].getScore()));
                }else {
                    players[1].setScore(2);
                    idScore2.setText(String.valueOf(players[1].getScore()));
                }
            }
            //set all zero
            setAllZero();
        }
    }


    //a method if the cards are the same
    private boolean findOutIndexes(ArrayList<Image> array){
        Image image1 = array.get(0);
        Image image2 = array.get(1);
        for(int i=0; i<arrNumberImages.length; i++){
            for(int j=0; j<arrNumberText.length; j++){
                if(image1.equals(arrNumberImages[i]) && image2.equals(arrNumberText[j])
                        && i==j) return true;
            }
        }

        return false;

    }



    //a method for turning the cards back
    private void turnTheCardsBack(ArrayList<Image> array){
        if(array.contains(idPic0.getImage())) idPic0.setVisible(false);
        if(array.contains(idPic1.getImage())) idPic1.setVisible(false);
        if(array.contains(idPic2.getImage())) idPic2.setVisible(false);
        if(array.contains(idPic3.getImage())) idPic3.setVisible(false);
        if(array.contains(idPic4.getImage())) idPic4.setVisible(false);
        if(array.contains(idPic5.getImage())) idPic5.setVisible(false);
        if(array.contains(idPic6.getImage())) idPic6.setVisible(false);
        if(array.contains(idPic7.getImage())) idPic7.setVisible(false);
        if(array.contains(idPic8.getImage())) idPic8.setVisible(false);
        if(array.contains(idPic9.getImage())) idPic9.setVisible(false);
        if(array.contains(idPic10.getImage())) idPic10.setVisible(false);
        if(array.contains(idPic11.getImage())) idPic11.setVisible(false);
        if(array.contains(idPic12.getImage())) idPic12.setVisible(false);
        if(array.contains(idPic13.getImage())) idPic13.setVisible(false);
        if(array.contains(idPic14.getImage())) idPic14.setVisible(false);
        if(array.contains(idPic15.getImage())) idPic15.setVisible(false);
        if(array.contains(idPic16.getImage())) idPic16.setVisible(false);
        if(array.contains(idPic17.getImage())) idPic17.setVisible(false);
        if(array.contains(idPic18.getImage())) idPic18.setVisible(false);
        if(array.contains(idPic19.getImage())) idPic19.setVisible(false);
    }



    //a method which is used for setting for the seenCards, id0, id1, id2..... set everything 0 value
    private void setAllZero(){
        seenCards = 0;
        id0 = 0;
        id1 = 0;
        id2 = 0;
        id3 = 0;
        id4 = 0;
        id5 = 0;
        id6 = 0;
        id7 = 0;
        id8 = 0;
        id9 = 0;
        id10 = 0;
        id11 = 0;
        id12 = 0;
        id13 = 0;
        id14 = 0;
        id15 = 0;
        id16 = 0;
        id17 = 0;
        id18 = 0;
        id19 = 0;
    }

}


