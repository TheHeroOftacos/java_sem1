package project2;
public class uzd5 {
    public static void main(String[] args) {
        //part1
        int[] test = {10, 100, 1000, 10000};

        for (int N : test) {
            double[] result = coinFlip(N);
            System.out.println("N = " + N);
            System.out.println("Heads: " + (int)result[0] + ", Tails: " + (int)result[1] + ", Ratio: " + result[2]);
            System.out.println();
        }

        //part2
        for (int N: test){
            int[] histogram = rollDice(N);
            System.out.println("Dice rolls for N = " + N);
            for (int i = 0; i < histogram.length; i++)
                System.out.println((i + 1) + ": " + histogram[i]);
            System.out.println();
        }
        //part3
        int tries = roll2Dices();
        System.out.println("Part 3: Number of tries to get double six: " + tries);
    
    }
    //part1
    static double[] coinFlip(int N){
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < N; i++) {
            int flip = (int)(Math.random() * 2);
            if (flip == 0)
                 heads++;
            else
                 tails++;
        }

        double ratio = tails == 0 ? 0 : (double)heads / tails;

        return new double[]{heads, tails, ratio};
    }
    //part2
    static int[] rollDice(int N){
        int[] counts = new int[6];

        for (int i = 0; i < N; i++) {
            int roll = (int)(Math.random() * 6) + 1;
            counts[roll - 1]++;
        }

        return counts;
    }
    //part3
    static int roll2Dices() {
        int tries = 0;
        int dice1, dice2;

        do {
            dice1 = (int)(Math.random() * 6) + 1;
            dice2 = (int)(Math.random() * 6) + 1;
            tries++;
        } while (dice1 != 6 || dice2 != 6);

        return tries;
    }
}
