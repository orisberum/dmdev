import level1.computerscience.ArraysTasks;
import level1.computerscience.Functions;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        Functions functions = new Functions();
        ArraysTasks arraysTasks = new ArraysTasks();
        int[] testArray = {-2,-1,0,2,3,4};

//        functions.minutesToQuarterPrint(5);
//        System.out.println(functions.calculate(10, 3, '%'));
//
//        double triangleAreaA = functions.getTriangleArea(20, 20);
//        double triangleAreaB = functions.getTriangleArea(20, 20);
//        functions.compareTriangle(triangleAreaA, triangleAreaB);

        System.out.println(Arrays.toString(arraysTasks.excludeNegativeNumbersWithLambda(testArray)));
    }
}
