package project2;
public class uzd7 {
    public static void main(String[] args) {
        int level = 6;
        String result = pascalsTriangle(level);
        System.out.println(result);
    }
    
    static String pascalsTriangle(int level) {
        String result = "[";

        for (int r = 0; r <= level; r++) {
            int value = factorial(level) / (factorial(r) * factorial(level - r));

            result += value;

            if (r < level)
                result += ", ";
        }

        result += "]";
        return result;
    }

    static int factorial(int n) {
        int result = 1;
        
        for (int i = 2; i <= n; i++)
            result *= i;
        return result;
    }
}
