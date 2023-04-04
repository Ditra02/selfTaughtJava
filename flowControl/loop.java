package flowControl;

public class loop {
    public static void main(String[] args) {
        int n = 4;

        for (int i = 0; i <= 4; i++)
        {
            System.out.println("idx = " + i);
        }

        int sum = 0;
        int i;
        for (i = 0; i < 1000; i++) {
            if (i % 2 == 0) {
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum = " + sum);

        int[] numbers = { 3, 7, 5, -5 };

        for(int number: numbers)
        {
            System.out.println(number);
        }

        // ? for each loop
        int[] array = {1, 2, 3, 4, 5};
        int sumArr = 0;

        for (int angka: array)
        {
            sumArr += angka;
        }
        
        System.out.println("sum array = " + sumArr);

        int[] array2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };

        for(int i = 0; i < array2.length; i++)
        {
            System.out.println("index " + i + " >> " + array2[i]);
        }
        
        System.out.println(array2.length);

    
    
    }
}
