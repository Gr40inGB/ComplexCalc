package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import model.Calculator;
import model.CalculatorFunctions;
import service.ExpressionLogic;

import javax.swing.text.html.ImageView;
import java.net.URL;
import java.util.ResourceBundle;

public class ComplexCalcFullController {

    ExpressionLogic mathLogic = new ExpressionLogic();



    @FXML
    private Pane titlePane;
    @FXML
    private ImageView btnMinimize, btnClose;
    @FXML
    private TextField expression;

    @FXML
    void getResult(ActionEvent event) {
        expression.setText(mathLogic.getResult(expression.getText()));
    }


    private double x, y;


    public void init(Stage stage) {
        titlePane.setOnMousePressed(mouseEvent -> {
            x = mouseEvent.getSceneX();
            y = mouseEvent.getSceneY();
        });
        titlePane.setOnMouseDragged(mouseEvent -> {
            stage.setX(mouseEvent.getScreenX() - x);
            stage.setY(mouseEvent.getScreenY() - y);
        });




//
//        btnClose.setOnMouseClicked(mouseEvent -> stage.close());
//        btnMinimize.setOnMouseClicked(mouseEvent -> stage.setIconified(true));

    }
}
