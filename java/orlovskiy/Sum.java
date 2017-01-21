package orlovskiy;


import java.util.Arrays;

public class Sum {
    public static void print() {
        int[][] array = new int[5][8];
        int sum = 0;
        System.out.println("Random array 5x8");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 2);

                System.out.print(array[i][j] + "  ");
            }
            System.out.println();
        }

        int size = array[0].length; // Replace it with the size of maximum length inner array
        int temp[] = new int[size];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                temp[j] += array[i][j];  // Note that, I am adding to `temp[j]`.
            }
        }
        for (int i : temp) {
            sum += i;
        }
        System.out.println(Arrays.toString(temp));
        System.out.println("Sum: " + sum);
    }
}
