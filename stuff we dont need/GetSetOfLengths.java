package application;

import java.util.Arrays;

public class GetSetOfLengths {


	public static double [] magnitudes;
	public static String [][] setOfLists;

	public static double[][]  filterlengths(){


		double [][] setOfLengths = {};

		for (int t = 0; t < setOfLists.length; t++) {

			String[] tempSet = setOfLists[t];

			double[] tempLength = new double[tempSet.length];


			for (int q = 0; q < tempSet.length; q++) {

				if (tempSet[q].equals("AB")) {
					tempLength[q] = magnitudes[0];

				}

				if (tempSet[q].equals("AC")) {
					tempLength[q] = magnitudes[1];

				}

				if (tempSet[q].equals("AD")) {
					tempLength[q] = magnitudes[2];


				}

				if (tempSet[q].equals("BC")) {
					tempLength[q] = magnitudes[3];

				}

				if (tempSet[q].equals("BD")) {
					tempLength[q] = magnitudes[4];


				}

				if (tempSet[q].equals("CD")) {
					tempLength[q] = magnitudes[5];



				}        			
			}


			//if the 1d array is under max length it adds the 1d array to a 2d array which will be passed on
			double[][] newsetOfLengths = Arrays.copyOf(setOfLengths, setOfLengths.length + 1);

			//deep copy
			newsetOfLengths[newsetOfLengths.length - 1] = tempLength;


			setOfLengths = newsetOfLengths;





		}




		return setOfLengths;




	}

}
