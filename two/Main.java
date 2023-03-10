package group.project.two;

import java.util.Arrays;

public class Main {
	
	public static void main(String [] args) {
		
		int[][] fromRomeo = {{0,0,4,4},{4,0,4,0},{16}};//first array is x coord second is y third is maxLength
		//get from Romeo
		
		//define critital arrays for Main class 
		int[] XvalMain = fromRomeo[0]; 
		int[] YvalMain = fromRomeo[1];
		double maxLengthMain = fromRomeo[2][0];
		
		
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
		
		
		System.out.println(Arrays.toString(magnitudesMain));
		System.out.println(Arrays.deepToString(finalSetOfListsMain));
		System.out.println(Arrays.deepToString(finalSetOfLengthsMain));
		System.out.println(Arrays.toString(bestPathsMain));
		
		
		
		
	}
}
