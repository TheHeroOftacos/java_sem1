package project2;
public class uzd2 {
    public static void main(String[] args) {
        int N = 5;

        System.out.println("For Loop: " + factorialForLoop(N));
        System.out.println("Recursive: " + factorialRecursive(N));
    }
//https://www.geeksforgeeks.org/java/java-program-for-factorial-of-a-number/
    static int factorialForLoop(int N) {
        if (N < 0) return 0;

        int result = 1;

        for (int i = 2; i <=N; i++)
            result *= i;
        return result;
    }
    static int factorialRecursive(int N) {
        if (N < 0) return 0;

        if (N == 0)
            return 1;

        return N * factorialRecursive(N - 1);
    }

}