package view;

import controller.ComplexCalcFullController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class CalculatorApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ComplexCalcFullView.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
//        String css = this.getClass().getResource("darkStyle.css").toExternalForm();
//        scene.getStylesheets().add(0,"darkStyle.css");
        stage.setScene(scene);
        stage.setTitle("Complex Calculator");
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setResizable(false);
        ((ComplexCalcFullController)fxmlLoader.getController()).init(stage);

        stage.show();
    }

    public void run(){
        launch();
    }
}
