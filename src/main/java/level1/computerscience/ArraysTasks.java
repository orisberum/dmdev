package level1.computerscience;

import java.util.Arrays;

public class ArraysTasks {

        public int[] excludeNegativeNumbersWithLambda(int[] originalArray){
        int[] positiveArray = Arrays.stream(originalArray)
                                .filter(element -> element >= 0)
                                .toArray();

        return Arrays.stream(positiveArray)
                .map(element -> element * positiveArray.length)
                .toArray();
    }
}
