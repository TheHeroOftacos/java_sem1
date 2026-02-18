package project2;
import java.util.Random;

public class uzd3 {
    public static void main(String[] args) {
        
        int N=10;
        double lower = 1.0;
        double upper = 10.0;

        double[] array = generateArray(N, lower, upper);

        if (array.length == 0) {
            System.out.println("Array empty.");
            return;
        }

        System.out.println("Array:");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();

        System.out.println("Min: " + getMin(array));
        System.out.println("Max: " + getMax(array));
        System.out.println("Mean: " + getMean(array));

        double[] sorted = arraySort(array);
        System.out.println("Sorted array:");
        for (int i = 0; i < sorted.length; i++)
            System.out.print(sorted[i] + " ");
        System.out.println();
    }
    //genr random array
    static double[] generateArray(int N, double lower, double upper) {
    if (lower > upper) return new double[0];
    double[] arr = new double[N];
    Random rand = new Random(); // https://www.geeksforgeeks.org/java/generating-random-numbers-in-java/
    for (int i = 0; i < N; i++) {
        double value = lower + rand.nextDouble() * (upper - lower);
        arr[i] = Math.round(value * 100.0) / 100.0;
    }
    return arr;
    }
    static double getMean(double[] array){
        double sum = 0;
        for(int i = 0; i < array.length; i++)
            sum += array[i];
        return sum / array.length;
    }
    static double getMin(double[] array){
        double min = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] < min) min = array[i];
        return min;
    }
    static double getMax(double[] array){
        double max = array[0];
        for (int i = 0; i < array.length; i++)
            if (array[i] > max) max = array[i];
        return max;
    }
     // Bubble sort
     //https://www.w3schools.com/dsa/dsa_algo_bubblesort.php
    static double[] arraySort(double[] array) {
    double[] arr = array.clone();
    int n = arr.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                double temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }
    return arr;
}

}
//hi