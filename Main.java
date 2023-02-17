package application;
	

import java.util.Scanner;
import java.util.Arrays;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;

class Point{
	int x;
	int y;
	String name;
}
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
		
		Scanner input = new Scanner(System.in);
        int[] Xval = new int[4];
        int[] Yval = new int [4];
        int[] maxLength = new int[1];


        //getting x and y from user
        System.out.println("Please enter 4 x values:");
        for (int i = 0; i < 4; i++) {
            Xval[i] = input.nextInt();
        }
        System.out.println("Please enter 4 Y values:");
        for (int n = 0; n < 4; n++) {
            Yval[n] = input.nextInt();
        }
		// max length 
		System.out.print("Please enter your maximum length:");
        for (int b = 0; b <2; b++) {
        	maxLength[b] = input.nextInt();
        }

        input.close();
		Point[] newArr = new Point[6];
		
		char names = 'A';
		//function where you are given x,y
		for (int i = 0; i < 6; i++) {
          newArr [i] = new Point();
          newArr[i].x=Xval[i];
          newArr[i].y=Yval[i];		  
          newArr[i].name= names + "";
          names++;
		}
		
		int amountOfPoints =6;
		int magnitutde=6;
		// fingding all vectors and calulating magnitutde
		for(int i=0; i < amountOfPoints-1; i++){
			for(int j=i+1; j < amountOfPoints; j++){
				System.out.println(newArr[i].x + "," + newArr[i].y);
				System.out.println(newArr[j].x + "," + newArr[j].y);
				
				double magnitudel = Math.pow((newArr[j].x-newArr[i].x),2)+ Math.pow((newArr[j].y-newArr[i].y),2);
				magnitudel=Math.sqrt(magnitudel);
				
				System.out.println(newArr[i].name + newArr[j].name );
				
				System.out.println(magnitudel);
			}
		}
	}
}
