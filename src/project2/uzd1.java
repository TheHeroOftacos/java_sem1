package project2;
public class uzd1 {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        finalPosition = postionCalc(
            gravity,
            initialVelocity,
            initialPosition,
            fallingTime
        );
        System.out.println("Pos in "+fallingTime+"sec :"+finalPosition);
    }

    static double postionCalc(
        double gravity,
        double initialVelocity,
        double initialPosition,
        double fallingTime) {
            return 0.5 * gravity * Math.pow(fallingTime, 2) + initialVelocity * fallingTime + initialPosition;
        }
}
