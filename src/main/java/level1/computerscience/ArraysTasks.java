package level1.computerscience;

import java.util.Arrays;

public class ArraysTasks {

    public int[] excludeNegativeNumbers(int[] originalArray){
        int positiveNumbersCounter = 0;

        for (int j : originalArray) {
            if (j >= 0) {
                positiveNumbersCounter++;
            }
        }

        int[] positiveArray = new int[positiveNumbersCounter];

        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (originalArray[i] >= 0){
                positiveArray[j] = originalArray[i] * positiveNumbersCounter;
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

    public int[] charArrayToIntArray(char[] charArray) {
        int[] intArray = new int[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = charArray[i];
        }
        return intArray;
    }

    public int average(int[] intArray){
        int sum = 0;
        for (int element : intArray){
            sum += element;
        }
        return sum / intArray.length;
    }

    public void getMoreThenAverage(char[] charArray) {
        int moreThenAverageCounter = 0;
        int[] intArray = charArrayToIntArray(charArray);
        int average = average(intArray);

        for (char c : charArray) {
            if (c > average) {
                moreThenAverageCounter++;
            }
        }

        int[] moreThenAverageArray = new int[moreThenAverageCounter];

        for (int i = 0, j = 0; i < intArray.length; i++){
            if (intArray[i] > average) {
                moreThenAverageArray[j] = intArray[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(moreThenAverageArray));
    }

    public int[][] arraySplitting(int[] sourceArray) {
        int positiveCounter = 0;
        int negativeCounter = 0;
        int zeroCounter = 0;

        for (int element : sourceArray) {
            if (element > 0) {
                positiveCounter++;
            } else if (element < 0) {
                negativeCounter++;
            } else {
                zeroCounter++;
            }
        }

        int[] positiveArray = new int[positiveCounter];
        int[] negativeArray = new int[negativeCounter];
        int[] zeroArray = new int[zeroCounter];

        for (int i = 0, j = 0, k = 0, z = 0; i < sourceArray.length; i++) {
            if (sourceArray[i] > 0) {
                positiveArray[j] = sourceArray[i];
                j++;
            } else if (sourceArray[i] < 0) {
                negativeArray[k] = sourceArray[i];
                k++;
            } else {
                zeroArray[z] = sourceArray[i];
                z++;
            }
        }
        return new int[][]{positiveArray, negativeArray, zeroArray};
    }
}
