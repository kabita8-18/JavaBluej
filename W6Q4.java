import java.util.*;

/**
 * Write a description of class W6Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W6Q4
 {
    public static void main(String[] args) {

        // Initial array
        int[] scores = {10, 20, 30, 40, 50};

        System.out.println("Original Scores:");
        for (int n : scores) {
            System.out.print(n + " ");
        }
        System.out.println();

        // Sum
        int sum = 0;
        int max = scores[0];
        int min = scores[0];

        for (int n : scores) {
            sum += n;

            if (n > max) max = n;
            if (n < min) min = n;
        }

        double avg = (double) sum / scores.length;

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
        System.out.println("Highest Score = " + max);
        System.out.println("Lowest Score = " + min);

        // Dynamic part
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter number of subjects: ");
        int n = sc.nextInt();

        int[] newScores = new int[n];

        System.out.println("Enter the scores:");
        for (int i = 0; i < n; i++) {
            System.out.print("Score " + (i + 1) + ": ");
            newScores[i] = sc.nextInt();
        }

        System.out.println("\nUpdated Scores:");
        for (int s : newScores) {
            System.out.print(s + " ");
        }
    }
}