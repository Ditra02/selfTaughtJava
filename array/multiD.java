package array;

public class multiD {
    public static void main(String[] args) {
        int[][] array = {
                { 1, 2, 3 },
                { 1, 2, 3, 4 },
                { 1 }
        };

        // for (int i = 0; i < 3; i++)
        // {
        // System.out.println("Length of row " + (i + 1) + ": " +array[i].length);
        // }

        // ? access two dimensional array
        // for (int j = 0; j < array.length; j++) {
        // for (int k = 0; k < array[j].length; k++) {
        // System.out.print(array[j][k] + " ");
        // }
        // System.out.println(" ");
        // }

        // ? access two dimensional array with for-each
        for (int[] row : array) {
            for (int num : row) {
                System.out.print(num);
            }
            System.out.println("");
        }

    }
}
