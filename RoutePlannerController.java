package application;

import java.util.Arrays;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class RoutePlannerController {
// all the variables we can pull from the first scene
    @FXML
    private TextField xThree;

    @FXML
    private TextField xFour;

    @FXML
    private TextField xTwo;

    @FXML
    private TextField yOne;

    @FXML
    private TextField yFour;

    @FXML
    private TextField max;

    @FXML
    private TextField xOne;

    @FXML
    private TextField yTwo;

    @FXML
    private TextField yThree;

    @FXML
    void FindRoute(ActionEvent event) {
    	int[][] myArray; // converts the user inputs into integers. these are put into a 2d list we can use for the program to run
        int x1 = Integer.parseInt(xOne.getText());
        int x2 = Integer.parseInt(xTwo.getText());
        int x3 = Integer.parseInt(xThree.getText());
        int x4 = Integer.parseInt(xFour.getText());
        int y1 = Integer.parseInt(yOne.getText());
        int y2 = Integer.parseInt(yTwo.getText());
        int y3 = Integer.parseInt(yThree.getText());
        int y4 = Integer.parseInt(yFour.getText());
        int maximum = Integer.parseInt(max.getText());
        myArray = new int[][] {{x1, x2, x3, x4}, {y1, y2, y3, y4}, {maximum}};
    	//once the user clicks the button to calculate the route this is where the code will run
		//define critital arrays for Main class 
		int[] XvalMain = myArray[0]; 
		int[] YvalMain = myArray[1];
		double maxLengthMain = myArray[2][0];


		GetMagnitudes go = new GetMagnitudes();
		go.Xval = XvalMain;
		go.Yval = YvalMain;
		double [] magnitudesMain = GetMagnitudes.pythag();

		GetSetOfLists ya = new GetSetOfLists();
		ya.magnitudes = magnitudesMain;
		ya.maxLength = maxLengthMain;
		String [][] setOfListsMain = GetSetOfLists.filter();


		PathConnect dope = new PathConnect();
		dope.setOfLists = setOfListsMain;
		String [][]finalSetOfListsMain = PathConnect.connect();

		GetSetOfLengths connected = new GetSetOfLengths();
		connected.magnitudes = magnitudesMain;
		connected.setOfLists = finalSetOfListsMain;
		double[][] finalSetOfLengthsMain = GetSetOfLengths.filterlengths();

		EfficiencyTest hi = new EfficiencyTest();
		hi.setOfLists = finalSetOfListsMain;
		hi.setOfLengths = finalSetOfLengthsMain;
		String[] bestPathsMain = EfficiencyTest.best();
		System.out.println(Arrays.toString(bestPathsMain));
    }

}