# CPSC-project
Efficient Point Mapping System

The goal of this project is to be able to calculate the most efficient path between 4 points while keeping the combined paths under a length restriction. 
A project like this could be used to design a more efficient transit system for a city or walking paths in a community.

To use our algorithm, open FinalCode and begin by inputting the 4 X coordinates followed by the 4 Y coordinates into the program. 
The program will then prompt you for your maximum path length.

The program then calculates the distances between all the input values. These are then turned into vectors.  And are returned to us as vector lengths for the
6 possible vectors. These vectors are printed

The code makes a powerset of all possible vector combinations

the powerset is tested for path connectivity. If the set of paths it is connective and under the max path length it is added to a 2d array and its 
corrosponding distance set is added to another 2d array in the corrosponding position

Every set in the 2d array is tested for efficiency and the most efficient is printed


15 of the 396 lines of code are cited (3.8%)

source for some of the code
https://stackoverflow.com/questions/1670862/obtaining-a-powerset-of-a-set-in-java
https://stackoverflow.com/questions/26726366/convert-nested-list-to-2d-array

SUBMISSION 3 *****************************************************************************************************************
NOTE ^^^ the video is a little out of date. we added getters and setters in class GetMagnitudes
use the classes in the folder part 3 >>> GetMagnitudes.java , GetSetOfLengths.java , GetSetOfLists.java , EfficiencyTest.java , 
InputView.fxml , Main.java , RoutePlannerController.java
the image in folder part 3 is the new class diagram.



