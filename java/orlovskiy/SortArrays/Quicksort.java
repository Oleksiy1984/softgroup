package orlovskiy.SortArrays;


import java.util.Arrays;

public class Quicksort {

    public static void sort(int tenNums[]) {
        System.out.println("Sort using Java.util.Arrays.sort(int[])");
        //2. Sort Java
        /*The sorting algorithm is a Dual-Pivot Quicksort
     * by Vladimir Yaroslavskiy, Jon Bentley, and Joshua Bloch. This algorithm
     * offers O(n log(n)) performance on many data sets that cause other
     * quicksorts to degrade to quadratic performance, and is typically
     * faster than traditional (one-pivot) Quicksort implementations
     */
        Arrays.sort(tenNums);
        System.out.println("MAX: "+tenNums[tenNums.length-1]+"\nMIN: "+tenNums[0]);
    }

}
