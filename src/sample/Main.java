package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;


public class Main extends Application {

    final static int xStart   = 50;
    final static int yStart   = 50;
    final static int bgHeight = 90;
    final static int bgWidth  = 200;
    final static int lineGirth = 5;


    @Override
    public void start(Stage primaryStage) throws Exception{
       Group root = new Group();
       Scene scene = new Scene(root, 300, 200);
       scene.setFill(Color.DARKOLIVEGREEN);


       Rectangle formRec = new Rectangle();
        formRec.setX(xStart);
        formRec.setY(yStart);
        formRec.setWidth(bgWidth + lineGirth);
        formRec.setHeight(bgHeight + 2*lineGirth);
       root.getChildren().add(formRec);
        formRec.setFill(Color.DARKRED);

        Rectangle firstVertical = new Rectangle();
        firstVertical.setX(xStart + bgWidth / 2);
        firstVertical.setY(yStart);
        firstVertical.setWidth(lineGirth);
        firstVertical.setHeight(bgHeight / 3);
        firstVertical.setFill(Color.YELLOW);
        root.getChildren().add(firstVertical);

        Rectangle secondVertical = new Rectangle();
        secondVertical.setX(xStart + bgWidth / 2);
        secondVertical.setY(yStart + (bgHeight*2)/3 + lineGirth*2);
        secondVertical.setWidth(lineGirth);
        secondVertical.setHeight(bgHeight/3);
        secondVertical.setFill(Color.YELLOW);
        root.getChildren().add(secondVertical);

        Rectangle firstHorizontal = new Rectangle();
        firstHorizontal.setX(xStart);
        firstHorizontal.setY(yStart + bgHeight / 3);
        firstHorizontal.setWidth(bgWidth + lineGirth);
        firstHorizontal.setHeight(lineGirth);
        firstHorizontal.setFill(Color.YELLOW);
        root.getChildren().add(firstHorizontal);

       primaryStage.setScene(scene);
       primaryStage.show();

        Rectangle secondHorizontal = new Rectangle();
        secondHorizontal.setX(xStart);
        secondHorizontal.setY(yStart + (bgHeight*2)/3 + lineGirth*2);
        secondHorizontal.setWidth(bgWidth + lineGirth);
        secondHorizontal.setHeight(lineGirth);
        secondHorizontal.setFill(Color.YELLOW);
        root.getChildren().add(secondHorizontal);

        Rectangle thirdVertical = new Rectangle();
        thirdVertical.setX(xStart + bgWidth/4);
        thirdVertical.setY(yStart + bgHeight / 3 + lineGirth);
        thirdVertical.setWidth(lineGirth);
        thirdVertical.setHeight(bgHeight/3 + lineGirth);
        thirdVertical.setFill(Color.YELLOW);
        root.getChildren().add(thirdVertical);

        Rectangle fourthVertical = new Rectangle();
        fourthVertical.setX(xStart + 3*bgWidth/4);
        fourthVertical.setY(yStart + bgHeight / 3 + lineGirth);
        fourthVertical.setWidth(lineGirth);
        fourthVertical.setHeight(bgHeight/3 + lineGirth);
        fourthVertical.setFill(Color.YELLOW);
        root.getChildren().add(fourthVertical);


        primaryStage.setScene(scene);
        primaryStage.show();


    }


    public static void main(String[] args) {
        launch(args);
    }
}
