package orlovskiy.SortArrays;


public class Bubble {

    public static void sort(int tenNums[]) {
        /* 1.Bubble sort

        * Worst-case performance	 O(n^2)
        * Best-case performance	      O(n)
        * Average performance	     O(n^2)
        */
        System.out.println("Bubble sort:");
        for (int i = 0; i < tenNums.length; i++) {
            for (int j = i + 1; j < tenNums.length; j++) {
                int tmp = 0;
                if (tenNums[i] > tenNums[j]) {
                    tmp = tenNums[i];
                    tenNums[i] = tenNums[j];
                    tenNums[j] = tmp;
                }
            }

    }
        System.out.println("MAX: "+tenNums[tenNums.length-1]+"\nMIN: "+tenNums[0]);
    }
}
