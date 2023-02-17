package group.project;
import java.util.Arrays;
import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] Xval = new int[6];
        int[] Yval = new int [6];
        
        
        System.out.println("Please enter 6 x values:");
        for (int i = 0; i < 6; i++) {
            Xval[i] = input.nextInt();
        }
        System.out.println("Please enter 6 Y values:");
        for (int n = 0; n < 6; n++) {
            Yval[n] = input.nextInt();
        }
        input.close();
        System.out.println("The X values are:" + Arrays.toString(Xval));
        System.out.println("The Y values are:" + Arrays.toString(Yval));
        
    }
}
