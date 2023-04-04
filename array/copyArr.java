package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class copyArr {
    public static void main(String[] args) {
        // ? kopi dengan alamat sama maksudnya jika di array utama diubah
        // maka array kopiannya juga berubah
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7 };
        int[] positivenum = numbers;

        // numbers[0] = 100;

        // for(int num : positivenum)
        // {
        // System.out.print(num + ", ");
        // }

        // ? copying array with loop in order to get the different address
        // int[] arrayCopy = new int[3];

        // for (int i = 0; i < 3; i++) {
        // arrayCopy[i] = numbers[i];
        // }

        // numbers[0] = 100;

        // System.out.println(Arrays.toString(arrayCopy));

        // ? copying array with method
        // int[] array4 = new int[5];
        // System.arraycopy(numbers, 0, array4, 2, 3);

        // System.out.println(Arrays.toString(array4));

        // ? Copying Arrays using copyofRange() method
        // int[] array5 = { 1, 2, 3, 4, 5 };
        // int[] array6 = Arrays.copyOfRange(array5, 0, array5.length);

        // System.out.println(Arrays.toString(array6));

        int[][] array7 = {
                { 1, 2, 3, 4 },
                { 5, 6 },
                { 0, 2, 42, -4, 5 }
        };

        // int[][] array8 = new int[array7.length][];  // atur space buat row

        // for (int i = 0; i < array7.length; i++) {
        //     array8[i] = new int[array7[i].length]; // atur space buat column

        //     for (int j = 0; j < array7[i].length; j++) {
        //         array8[i][j] = array7[i][j];
        //     }
        // }
        
        // System.out.println(Arrays.deepToString(array8));

        int[][] array9 = new int[array7.length][];

        for (int f = 0; f < 3;f++)
        {
            array9[f] = new int[array7[f].length];
        }

        System.arraycopy(array7, 0, array9, 0, array7.length);

        System.out.println(Arrays.deepToString(array9));
    }
}
