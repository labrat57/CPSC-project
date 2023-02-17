package group.project;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class roughDraft {

	public static void main(String[] args) {
		
		String [] given = {"AB", "AC", "AD", "BC", "BD", "CD"};
		System.out.println("list of all the numbers: " + Arrays.toString(given));
		

		int maxLength = 6;
		// loop that adds all the vectors in the given array
				String sum = "";
				for (int i = 0; i<6; i++) {
					sum = sum + given[i];
				}
				System.out.println("sum of all numbers in the array: " + sum);
		
	
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
	    
	}}
