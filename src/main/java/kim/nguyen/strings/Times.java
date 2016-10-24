/**
 * Times.java Demonstrates converting integers to Strings, how to format text, how to use nested loops.
 * 
 * @version %I%, %G%
 * 
 * @author Kim Nguyen
 */
package kim.nguyen.strings;

public class Times {

    /* Size of the 2D array */
    private final static int size = 11;

    private static int[][] time = new int[size][size];

    public static void initTimeArray() {

        /* Where to start filling the array */
        final int startPos = 2;

        time = initTimeHeader(time);

        /* Sets values for the body of the time array */
        for (int row = startPos; row < size; ++row) {
            for (int col = startPos; col < size; ++col) {
                time[row][col] = Integer.valueOf(time[row][0] * time[0][col]);
            }
        }
    }

    private static int[][] initTimeHeader(int[][] array) {
        int[][] timeHeader = array;

        /* The row and the column where the header is initialized */
        final int headerPos = 0;

        /* The row where the header and the body of the array are separated */
        final int spacePos = 1;

        /* Sets values for the header of the array */
        for (int index = 0; index < size; ++index) {
            if (index == 0) {
                timeHeader[index][index] = 0;
            } else {
                timeHeader[spacePos][index] = 0;
                timeHeader[index][spacePos] = 0;
                timeHeader[headerPos][index] = index - spacePos;
                if (index >= spacePos) {
                    timeHeader[index][headerPos] = index - spacePos;
                }
            }
        }

        return timeHeader;
    }

    public static void main(String[] args) {
        final String format = "%1$3s";

        initTimeArray();

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (i == 0 && j == 0) {
                    System.out.print(String.format(format, " "));
                } else {
                    System.out.print(String.format(format, Integer.toString(time[i][j])));
                }

            }
            System.out.println();
        }
    }
}
