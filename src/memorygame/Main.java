package memorygame;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    //setting for a introduction-background
    static javafx.scene.image.Image p_1 = new javafx.scene.image.Image(Main.class.getResource("pictureintroduction/background.jpg").toString());
    public javafx.scene.image.ImageView im1 = new javafx.scene.image.ImageView(p_1);
    private Group p;

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("introduction.fxml"));
        primaryStage.setTitle("Introduction-MemoryGame");
        p = new Group(im1);
        final Group root1 = new Group(p, root);
        primaryStage.setScene(new Scene(root1, 700, 400));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
