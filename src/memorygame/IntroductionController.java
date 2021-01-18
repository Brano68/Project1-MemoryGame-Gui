package memorygame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.IOException;

public class IntroductionController {
    //
    static javafx.scene.image.Image p_1 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background1.jpg").toString());
    static javafx.scene.image.Image p_2 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background2.jpg").toString());
    static javafx.scene.image.Image p_3 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background3.jpg").toString());
    static javafx.scene.image.Image p_4 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background4.jpg").toString());
    static javafx.scene.image.Image p_5 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background5.jpg").toString());
    static javafx.scene.image.Image p_6 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background6.jpg").toString());
    static javafx.scene.image.Image p_7 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background7.jpg").toString());
    static javafx.scene.image.Image p_8 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background8.jpg").toString());
    static javafx.scene.image.Image p_9 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background9.jpg").toString());
    static javafx.scene.image.Image p_10 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background10.jpg").toString());
    static javafx.scene.image.Image p_11 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background11.jpg").toString());
    static javafx.scene.image.Image p_12 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background12.jpg").toString());
    static javafx.scene.image.Image p_13 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background13.jpg").toString());
    static javafx.scene.image.Image p_14 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background14.jpg").toString());
    static javafx.scene.image.Image p_15 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background15.jpg").toString());
    static javafx.scene.image.Image p_16 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background16.jpg").toString());
    static javafx.scene.image.Image p_17 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background17.jpg").toString());
    static javafx.scene.image.Image p_18 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background18.jpg").toString());
    static javafx.scene.image.Image p_19 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background19.jpg").toString());
    static javafx.scene.image.Image p_20 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background20.jpg").toString());
    static javafx.scene.image.Image p_21 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background21.jpg").toString());
    static javafx.scene.image.Image p_22 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background22.jpg").toString());
    static javafx.scene.image.Image p_23 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background23.jpg").toString());
    static javafx.scene.image.Image p_24 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background24.jpg").toString());
    static javafx.scene.image.Image p_25 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background25.jpg").toString());
    static javafx.scene.image.Image p_26 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background26.jpg").toString());
    static javafx.scene.image.Image p_27 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background27.jpg").toString());
    static javafx.scene.image.Image p_28 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background28.jpg").toString());
    static javafx.scene.image.Image p_29 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background29.jpg").toString());
    static javafx.scene.image.Image p_30 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background30.jpg").toString());
    static javafx.scene.image.Image p_31 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background31.jpg").toString());
    static javafx.scene.image.Image p_32 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background32.jpg").toString());
    static javafx.scene.image.Image p_33 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background33.jpg").toString());
    static javafx.scene.image.Image p_34 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background34.jpg").toString());
    static javafx.scene.image.Image p_35 = new javafx.scene.image.Image(Main.class.getResource("picturecore/background35.jpg").toString());

    public javafx.scene.image.ImageView im1 = new javafx.scene.image.ImageView(p_1);
    public javafx.scene.image.ImageView im2 = new javafx.scene.image.ImageView(p_2);
    public javafx.scene.image.ImageView im3 = new javafx.scene.image.ImageView(p_3);
    public javafx.scene.image.ImageView im4 = new javafx.scene.image.ImageView(p_4);
    public javafx.scene.image.ImageView im5 = new javafx.scene.image.ImageView(p_5);
    public javafx.scene.image.ImageView im6 = new javafx.scene.image.ImageView(p_6);
    public javafx.scene.image.ImageView im7 = new javafx.scene.image.ImageView(p_7);
    public javafx.scene.image.ImageView im8 = new javafx.scene.image.ImageView(p_8);
    public javafx.scene.image.ImageView im9 = new javafx.scene.image.ImageView(p_9);
    public javafx.scene.image.ImageView im10 = new javafx.scene.image.ImageView(p_10);
    public javafx.scene.image.ImageView im11 = new javafx.scene.image.ImageView(p_11);
    public javafx.scene.image.ImageView im12 = new javafx.scene.image.ImageView(p_12);
    public javafx.scene.image.ImageView im13 = new javafx.scene.image.ImageView(p_13);
    public javafx.scene.image.ImageView im14 = new javafx.scene.image.ImageView(p_14);
    public javafx.scene.image.ImageView im15 = new javafx.scene.image.ImageView(p_15);
    public javafx.scene.image.ImageView im16 = new javafx.scene.image.ImageView(p_16);
    public javafx.scene.image.ImageView im17 = new javafx.scene.image.ImageView(p_17);
    public javafx.scene.image.ImageView im18 = new javafx.scene.image.ImageView(p_18);
    public javafx.scene.image.ImageView im19 = new javafx.scene.image.ImageView(p_19);
    public javafx.scene.image.ImageView im20 = new javafx.scene.image.ImageView(p_20);
    public javafx.scene.image.ImageView im21 = new javafx.scene.image.ImageView(p_21);
    public javafx.scene.image.ImageView im22 = new javafx.scene.image.ImageView(p_22);
    public javafx.scene.image.ImageView im23 = new javafx.scene.image.ImageView(p_23);
    public javafx.scene.image.ImageView im24 = new javafx.scene.image.ImageView(p_24);
    public javafx.scene.image.ImageView im25 = new javafx.scene.image.ImageView(p_25);
    public javafx.scene.image.ImageView im26 = new javafx.scene.image.ImageView(p_26);
    public javafx.scene.image.ImageView im27 = new javafx.scene.image.ImageView(p_27);
    public javafx.scene.image.ImageView im28 = new javafx.scene.image.ImageView(p_28);
    public javafx.scene.image.ImageView im29 = new javafx.scene.image.ImageView(p_29);
    public javafx.scene.image.ImageView im30 = new javafx.scene.image.ImageView(p_30);
    public javafx.scene.image.ImageView im31 = new javafx.scene.image.ImageView(p_31);
    public javafx.scene.image.ImageView im32 = new javafx.scene.image.ImageView(p_32);
    public javafx.scene.image.ImageView im33 = new javafx.scene.image.ImageView(p_33);
    public javafx.scene.image.ImageView im34 = new javafx.scene.image.ImageView(p_34);
    public javafx.scene.image.ImageView im35 = new javafx.scene.image.ImageView(p_35);
    @FXML
    private Button idStartButton;

    @FXML
    private Label sameNames;

    private Group p;

    @FXML
    private Pane idStartPane;
    @FXML
    private TextField idPlayer1;
    @FXML
    private TextField idPlayer2;

    //array for 2 players
    public static Player[] players = new Player[2];

    //a method for creating two players and passing to another scene-Core
    public void startGame(ActionEvent actionEvent) throws IOException {
        String name1 = idPlayer1.getText();
        String name2 = idPlayer2.getText();

        if (name1.equals(name2) && name1.equals("") == false && name2.equals("") == false) {
            sameNames.setVisible(true);
        }

        if (name1.equals("") == false && name2.equals("") == false && name1.equals(name2) == false) {
            //creating two players
            Player player1 = new Player(name1);
            players[0] = player1;
            Player player2 = new Player(name2);
            players[1] = player2;
            idStartPane.setVisible(false);

            //closing the first scene
            Stage stage = (Stage) idStartButton.getScene().getWindow();
            stage.close();

            //effect for background
            p = new Group(im1);
            Timeline t = new Timeline();
            t.setCycleCount(Timeline.INDEFINITE);
            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(200),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im2);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(300),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im3);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(400),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im4);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(500),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im5);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(600),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im6);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(700),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im7);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(800),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im8);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(900),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im9);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1000),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im10);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1100),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im11);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1200),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im12);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1300),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im13);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1400),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im14);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1500),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im15);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1600),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im16);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1700),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im17);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1800),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im18);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(1900),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im19);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2000),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im20);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2100),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im21);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2200),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im22);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2300),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im23);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2400),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im24);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2500),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im25);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2600),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im26);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2700),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im27);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2800),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im28);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(2900),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im29);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(3000),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im30);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(3100),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im31);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(3200),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im32);
                    }
            ));
/*
            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(3300),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im33);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(3400),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im34);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(3500),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im35);
                    }
            ));
*/


            t.play();

            Stage primaryStage = new Stage();
            //set the icon
            String path1 = "src/memorygame/icon/an_icon.png";
            FileInputStream inputstream1 = new FileInputStream(path1);
            Image image = new Image(inputstream1);
            primaryStage.getIcons().add(image);

            Parent beforeBackground = FXMLLoader.load(getClass().getResource("core.fxml"));
            final Group root = new Group(p, beforeBackground);
            primaryStage.setTitle("Winter Memory Game");
            primaryStage.setScene(new Scene(root, 1200, 640));
            primaryStage.setResizable(false);
            //primaryStage.initModality(Modality.WINDOW_MODAL);
            primaryStage.show();
        }
    }


}
