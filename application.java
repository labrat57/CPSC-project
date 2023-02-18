package group.project;
	

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

class Point{
	int x;
	int y;
	String name;
}

	
public class application {
	public static void main(String[] args) {
		
		
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
        for (int b = 0; b <1; b++) {
        	maxLength[b] = input.nextInt();
        }

        input.close();
		Point[] newArr = new Point[4];
		
		char names = 'A';
		//function where you are given x,y
		for (int i = 0; i < 4; i++) {
          newArr [i] = new Point();
          newArr[i].x=Xval[i];
          newArr[i].y=Yval[i];		  
          newArr[i].name= names + "";
          names++;
		}
		
		int amountOfPoints =4;
		double[] magnitudes = new double[amountOfPoints*(amountOfPoints-1)/2]; // create an array to store the magnitudes
    	int index = 0;
    	// finding all vectors and calculating magnitudes
    	for(int i=0; i < amountOfPoints-1; i++){
    		for(int j=i+1; j < amountOfPoints; j++){
    			System.out.println(newArr[i].x + "," + newArr[i].y);
    			System.out.println(newArr[j].x + "," + newArr[j].y);
        
    			double magnitude = Math.sqrt(Math.pow((newArr[j].x-newArr[i].x),2)+ Math.pow((newArr[j].y-newArr[i].y),2)); // calculate magnitude
    			magnitudes[index] = magnitude; // store magnitude in the array
    			index++;
        
    			System.out.println(newArr[i].name + newArr[j].name );
    			System.out.println(magnitude);
    		}
    	}
    			System.out.println("this is the array:" + Arrays.toString(magnitudes));
		// romeos additions
    	String ab = String.valueOf(magnitudes[0]);
    	String ac = String.valueOf(magnitudes[1]);
    	String ad = String.valueOf(magnitudes[2]);
    	String bc = String.valueOf(magnitudes[3]);
    	String bd = String.valueOf(magnitudes[4]);
    	String cd = String.valueOf(magnitudes[5]);
    	String [] given = {ab, ac, ad, bc, bd, cd};
		System.out.println("list of all the numbers: " + Arrays.toString(given));
args = given;
		

	    List<List<String>> powerSet = new LinkedList<List<String>>();

	    for (int i = 1; i <= args.length; i++)
	        powerSet.addAll(combination(Arrays.asList(args), i));

	    System.out.println(powerSet);}

	public static <T> List<List<T>> combination(List<T> values, int size) {

	    if (0 == size) {
	        return Collections.singletonList(Collections.<T> emptyList());
	    }

	    if (values.isEmpty()) {
	        return Collections.emptyList();
	    }

	    List<List<T>> combination = new LinkedList<List<T>>();

	    T actual = values.iterator().next();

	    List<T> subSet = new LinkedList<T>(values);
	    subSet.remove(actual);

	    List<List<T>> subSetCombination = combination(subSet, size - 1);

	    for (List<T> set : subSetCombination) {
	        List<T> newSet = new LinkedList<T>(set);
	        newSet.add(0, actual);
	        combination.add(newSet);
	    }

	    combination.addAll(combination(subSet, size));
	    List<List<String>> powerSet = new LinkedList<List<String>>();

	   

	    // Check the size of the output arrays
	    int desiredSize = 4;
	    for (List<T> list : combination) {
	        if (list.size() >=3) {
	        	String addition = "";
	        	for (int n = 0; n<list.size(); n++) 
					addition += list.get(n);
	        	
	           System.out.println("Here's a combination of more than 3 vectors: " + list + " length of:" + addition );
	        }
	    
	    }

	   
	   return combination;
	    
	
		
	}
}