package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Controller_4 {
    Stage j1=new Stage();
    Stage j2=new Stage();
    Stage j3=new Stage();
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void yotoq1(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Yotoq1.fxml"));

        j1.setTitle("Yotoqlar ");

        j1.setScene(new Scene(root, 600, 400));
        j1.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void yotoq2(ActionEvent event)throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Yotoq2.fxml"));

        j2.setTitle("Yotoqlar ");

        j2.setScene(new Scene(root, 600, 400));
        j2.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }


    @FXML
    void yotoq3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/fxmls/Yotoq3.fxml"));

        j3.setTitle("Yotoqlar ");

        j3.setScene(new Scene(root, 600, 400));
        j3.show();
        ((Node)(event.getSource())).getScene().getWindow().hide();
    }

    @FXML
    void initialize() {

    }
}
