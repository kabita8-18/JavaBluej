
/**
 * Write a description of class W6Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class W6Q7
{
    public static void main(String[] args)
    {
        String[][] seats = new String[2][3];

        // Fill first row with names
        seats[0][0] = "Asha";
        seats[0][1] = "Bikash";
        seats[0][2] = "Sita";

        // Second row left empty (null values)

        System.out.println("Seating Chart:");

        for (int i = 0; i < seats.length; i++) {
            System.out.print("Row " + (i + 1) + ": ");
            for (int j = 0; j < seats[i].length; j++) {

                if (seats[i][j] == null || seats[i][j].isEmpty()) {
                    System.out.print("[empty] ");
                } else {
                    System.out.print(seats[i][j] + " ");
                }

            }
            System.out.println();
        }
    }

}