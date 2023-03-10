package group.project.two;

class Point {
    int x;
    int y;
    String name;
}

public class GetMagnitudes {

	public static int[] Xval;
	public static int[] Yval;
	
    public static double[] pythag() {

        

        Point[] newArr = new Point[4];

        char names = 'A';
        // function where you are given x,y
        for (int i = 0; i < 4; i++) {
            newArr[i] = new Point();
            newArr[i].x = Xval[i];
            newArr[i].y = Yval[i];
            newArr[i].name = names + "";
            names++;
        }

        int amountOfPoints = 4;
        double[] magnitudes = new double[amountOfPoints * (amountOfPoints - 1) / 2]; // create an array to store the magnitudes
        int index = 0;
        // finding all vectors and calculating magnitudes
        for (int i = 0; i < amountOfPoints - 1; i++) {
            for (int j = i + 1; j < amountOfPoints; j++) {

                double magnitude = Math.sqrt(Math.pow((newArr[j].x - newArr[i].x), 2)
                        + Math.pow((newArr[j].y - newArr[i].y), 2)); // calculate magnitude
                magnitudes[index] = magnitude; // store magnitude in the array
                index++;

            }
        }
        
        return magnitudes;
        
    }

}

