package level1.computerscience;

import java.util.Arrays;

public class ArraysTasks {

    public int[] excludeNegativeNumbers(int[] originalArray){
        int positiveNubersCounter = 0;
        for (int j : originalArray) {
            if (j >= 0) {
                positiveNubersCounter++;
            }
        }

        int[] positiveArray = new int[positiveNubersCounter];

        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (originalArray[i] >= 0){
                positiveArray[j] = originalArray[i] * positiveNubersCounter;
                j++;
            }
        }
        return positiveArray;
    }

        public int[] excludeNegativeNumbersWithLambda(int[] originalArray){
        int[] positiveArray = Arrays.stream(originalArray)
                                .filter(element -> element >= 0)
                                .toArray();

        return Arrays.stream(positiveArray)
                .map(element -> element * positiveArray.length)
                .toArray();
    }
}
