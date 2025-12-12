
/**
 * Write a description of class W6Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W6Q6
{
    public static void main(String[] args)
    {
        int[][] marks = {
            {80, 75},   // Student 1
            {90, 85}    // Student 2
        };

        System.out.println("Marks Table (Nepali, English):");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < marks.length; i++) {
            int total = 0;
            for (int j = 0; j < marks[i].length; j++) {
                total += marks[i][j];
            }
            System.out.println("Total marks of Student " + (i + 1) + ": " + total);
        }
    }
}