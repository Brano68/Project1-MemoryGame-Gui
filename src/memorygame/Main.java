package memorygame;

import javafx.animation.RotateTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Point3D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.effect.Reflection;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Main extends Application {

    //setting for a introduction-background
    static javafx.scene.image.Image p_1 = new javafx.scene.image.Image(Main.class.getResource("pictureintroduction/background.jpg").toString());
    public javafx.scene.image.ImageView im1 = new javafx.scene.image.ImageView(p_1);
    private Group p;

    private Text text = new Text("Memory Game");
    private Group p2;

    @Override
    public void start(Stage primaryStage) throws Exception{
        text.setFont(Font.font("Verdena", FontWeight.BLACK, 25));
        text.setX(250);
        text.setY(70);
        text.setEffect(new Reflection());
        p2 = new Group(text);
        RotateTransition rotateTransition = new RotateTransition(Duration.seconds(3), text);
        rotateTransition.setFromAngle(0);
        rotateTransition.setToAngle(360);
        rotateTransition.setAutoReverse(true);
        rotateTransition.setCycleCount(Timeline.INDEFINITE);
        rotateTransition.setAxis(new Point3D(15,2,10));
        rotateTransition.play();

        Parent root = FXMLLoader.load(getClass().getResource("introduction.fxml"));
        primaryStage.setTitle("Intro");
        p = new Group(im1);
        final Group root1 = new Group(p, p2, root);
        primaryStage.setScene(new Scene(root1, 700, 400));
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
