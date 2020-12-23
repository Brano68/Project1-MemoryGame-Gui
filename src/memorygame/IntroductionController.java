package memorygame;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

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

    public javafx.scene.image.ImageView im1 = new javafx.scene.image.ImageView(p_1);
    public javafx.scene.image.ImageView im2 = new javafx.scene.image.ImageView(p_2);
    public javafx.scene.image.ImageView im3 = new javafx.scene.image.ImageView(p_3);
    public javafx.scene.image.ImageView im4 = new javafx.scene.image.ImageView(p_4);
    public javafx.scene.image.ImageView im5 = new javafx.scene.image.ImageView(p_5);
    public javafx.scene.image.ImageView im6 = new javafx.scene.image.ImageView(p_6);
    public javafx.scene.image.ImageView im7 = new javafx.scene.image.ImageView(p_7);
    public javafx.scene.image.ImageView im8 = new ImageView(p_8);

    private Group p;
    //

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

        if (name1.equals("") == false && name2.equals("") == false) {
            //creating two players
            Player player1 = new Player(name1);
            players[0] = player1;
            Player player2 = new Player(name2);
            players[1] = player2;
            idStartPane.setVisible(false);

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
                        p.getChildren().setAll(im3);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(500),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im4);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(600),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im5);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(700),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im6);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(800),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im7);
                    }
            ));

            t.getKeyFrames().add(new KeyFrame(
                    Duration.millis(900),
                    (ActionEvent event) -> {
                        p.getChildren().setAll(im8);
                    }
            ));
            t.play();

            Stage primaryStage = new Stage();
            Parent beforeBackground = FXMLLoader.load(getClass().getResource("core.fxml"));
            final Group root = new Group(p, beforeBackground);
            primaryStage.setTitle("Core of the MemoryGame");
            primaryStage.setScene(new Scene(root, 1200, 500));
            primaryStage.initModality(Modality.WINDOW_MODAL);
            primaryStage.show();
        }
    }


}
