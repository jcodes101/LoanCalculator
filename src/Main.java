import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage appStage) {
        FormPane formPane = new FormPane();
        Scene scene = new Scene(formPane, 300, 200);

        appStage.setScene(scene);
        appStage.setTitle("Loan Calculator");
        appStage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}